public class MyDeque<E>{
  private E[] data;
  private int size, start, end;

  @SuppressWarnings("unchecked")
  public MyDeque(){
    data = (E[])new Object[10];
    size = 0;
    start = 0;
    end = 0;
  }
  @SuppressWarnings("unchecked")
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
    String ans = "";
    if (end >= start){
      for(int i = start; i <= end; i ++){
        ans += data[i] + " ";
      }
    }
    else{
      for(int j = start; j < data.length; j ++){
        ans += data[j] + " ";
      }
      for (int k = 0; k <= end; k ++){
        ans += data[k] + " ";
      }
    }
    return ans;
  }

  public void addFirst(E element){
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
   }
  public void addLast(E element){ }
  public E removeFirst(){
    if (start == data.length -1){
      // do shitfing stuff
    }
    else{
      int oldStart = start;
      start ++;
      return data[oldStart];
    }
  }
  public E removeLast(){
    if (end == 0){
      // do shitfing stuff
    }
    else{
      int oldEnd = end;
      end --;
      return data[oldEnd];
    }
  }
  public E getFirst(){
    return data[start];
  }
  public E getLast(){
  return data[end];
}
  */
  public static void main(String[] args) {

  }
}
