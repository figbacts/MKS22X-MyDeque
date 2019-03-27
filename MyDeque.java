import java.util.*;
@SuppressWarnings("unchecked")
public class MyDeque<E>{
  private E[] data;
  private int size, start, end;
  public MyDeque(){
    data = (E[])new Object[10];
    size = 0;
    start = 0;
    end = 0;
  }
  public MyDeque(int initialCapacity){
    data = (E[])new Object[initialCapacity];
    size = 0;
    start = 0;
    end = 0;
   }
  public int size(){
    return size;
  }
  public String toString(){
    String ans = "[";
    if (end >= start){
      for(int i = start; i < end; i ++){
        if (data[i] == null){

        }
        else{
        ans += data[i] + ", ";
      }
      }
    }
    else{
      for(int j = start; j < data.length; j ++){
        if(data[j] == null){
        }
        else{
        ans += data[j] + ", ";
      }
      }
      for (int k = 0; k < end; k ++){
        if(data[k] == null){
        }
        else{
        ans += data[k] + " ";
      }
      }
    }
    return ans + "]";
  }

  public void addFirst(E element){
    if (element == null){
      throw new NullPointerException("NullPointerException at addFirst(element)");
    }
    if (size == data.length){
      resize();
    }
    if(size ==0){
      data[start] = element;
      size ++;
      return;
    }
    if (start == 0){
      if (end != data.length -1){
      start = data.length -1;
      data[start] = element;
     }
    }
    else{
      start --;
      data[start] = element;
    }
    size ++;
   }
  public void addLast(E element){
    if (element == null){
      throw new NullPointerException("NullPointerException at addLast(element)");
    }
    if(size == data.length){
      resize();
      end ++;
      data[end] = element;
      size ++;
      return;
    }
    if (size ==0){
      data[end] = element;
      size ++;
      return;
    }
    if (end != data.length -1){
    end ++;
    data[end] = element;
    size ++;
   }
   else{
       end = 0;
       data[end] = element;
       size ++;
   }
 }
  public E removeFirst(){
    if (size == 0){
      throw new NoSuchElementException("NoSuchElementException at removeFirst()");
    }
    E returnValue = data[start];
    if (start != data.length -1){
      start ++;
    }
    else{
      start = 0;
    }
    size --;
    return returnValue;
  }
  public E removeLast(){
    if (size == 0){
      throw new NoSuchElementException("NoSuchElementException at removeLast()");
    }
    int oldEnd = end;
    if (end == 0){
      end = size-1;
    }
    else{
      end --;
    }
      size --;
      return data[oldEnd];
  }
  public E getFirst(){
    if (size == 0){
      throw new NoSuchElementException("NoSuchElementException at getFirst()");
    }
    return data[start];
  }
  public E getLast(){
    if (size == 0){
      throw new NoSuchElementException("NoSuchElementException at getLast()");
    }
  return data[end];
}
private void resize(){
  E[] temp = (E[])new Object[data.length *2];
  if (end >= start){
    for(int i = 0; i <= end; i ++){
      temp[i] = data[i+start];
    }
  }
  else{
    for(int j = start; j < data.length; j ++){
      temp[j - start] = data[j];
    }
    for(int k = 0; k <= end; k ++){
      temp[size - start + k] = data[k];
    }
  }
  data=temp;
  start = 0;
  end = size;

}
  //*/
  public static void main(String[] args) {
    MyDeque test = new MyDeque(100);
    for(int i = 0; i < 11 ;i ++){
      test.addLast(i);
    }
    //System.out.println(test);
    test.removeFirst();
    //System.out.println(test);
  }
}
