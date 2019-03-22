@SuppressWarnings("unchecked")
public class MyDeque<E>{
  private E[] data;
  private int size, start, end;
  public MyDeque(){
    data = (E[])new Object[10];
    size = 1;
    start = 0;
    end = 0;
  }
  public MyDeque(int initialCapacity){
    data = (E[])new Object[initialCapacity];
    size = 1;
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
    return ans + "}";
  }

  public void addFirst(E element){
    if (size == data.length){
      //resize function;
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
    end ++;
    data[end] = element;
    size ++;
   }
  public E removeFirst(){
    E returnValue = data[start];
    start ++;
    size --;
    return returnValue;
  }
  public E removeLast(){
    if (end == 0){
      // do shitfing stuff
    }
      int oldEnd = end;
      end --;
      size --;
      return data[oldEnd];
  }
  public E getFirst(){
    return data[start];
  }
  public E getLast(){
  return data[end];
}
private void resize(){
  E[] temp = (E[])new Object[data.length *2];
  if (end >= start){
    for(int i = start; i <= end; i ++){
      temp[i -start] = data[i];
    }
  }
}
  //*/
  public static void main(String[] args) {
    MyDeque test = new MyDeque(10);
    System.out.println(test.removeFirst());
    test.addLast(1);
    test.addLast(2);
    test.addLast(3);
    test.addLast(4);
    test.addLast(5);
    test.addLast(6);
    test.addFirst(0);
    System.out.println(test);
    System.out.println("Size: " + test.size());
    System.out.println("LastIndex: " + test.getLast());
    System.out.println("FirstIndex: " + test.getFirst());
  }
}
