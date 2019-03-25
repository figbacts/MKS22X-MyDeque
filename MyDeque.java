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
    String ans = "{";
    if (end >= start){
      for(int i = start; i <= end; i ++){
        if (data[i] == null){

        }
        else{
        ans += data[i] + " ";
      }
      }
    }
    else{
      for(int j = start; j < data.length; j ++){
        if(data[j] == null){
        }
        else{
        ans += data[j] + " ";
      }
      }
      for (int k = 0; k <= end; k ++){
        if(data[k] == null){
        }
        else{
        ans += data[k] + " ";
      }
      }
    }
    return ans + "}";
  }

  public void addFirst(E element){
    if (element == null){
      throw new NullPointerException("NullPointerException at addFirst(element)");
    }
    if(size ==0){
      data[start] = element;
      size ++;
      return;
    }
    if (size == data.length){
      resize();
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
    if (size ==0){
      data[end] = element;
      size ++;
      return;
    }
    if(size == data.length){
      resize();
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
    if (start == size -1){
      start = 0;
    }
    else{
      start ++;
    }
    size --;
    return returnValue;
  }
  public E removeLast(){
    if (size == 0){
      throw new NoSuchElementException("NoSuchElementException at removeLast()");
    }
    if (end == 0){
      end = size;
    }
      int oldEnd = end;
      end --;
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
    for(int i = start; i <= end; i ++){
      temp[i -start] = data[i];
    }
    data = temp;
  }
  else{
    for(int j = start; j < data.length; j ++){
      temp[j - start] = data[j];
    }
    for(int k = 0; k <= end; k ++){
      temp[size - start + k] = data[k];
    }
    data=temp;
    start = 0;
    end = size -1;
  }
}
  //*/
  public static void main(String[] args) {
    MyDeque test = new MyDeque(10);
    //System.out.println(test.removeFirst());
    test.addFirst(0);
    /*
    test.addLast(2);
    test.addLast(3);
    test.addLast(4);
    test.addLast(5);
    test.addLast(6);
    test.addLast(7);
    test.addLast(8);
    test.addLast(9);
    test.addLast(10);
    test.addLast(11);
    test.addFirst(19);
    /*
    test.addFirst(20);
    test.addFirst(19);
    test.addFirst(19);
    test.addFirst(19);
    test.addFirst(19);
    test.addFirst(19);
    test.addFirst(23);
    */
    System.out.println(test);
    System.out.println(Arrays.toString(test.data));
    System.out.println(test.start);
    System.out.println("Size: " + test.size());
    System.out.println("LastValue: " + test.getLast());
    System.out.println("FirstValue: " + test.getFirst());
  }
}
