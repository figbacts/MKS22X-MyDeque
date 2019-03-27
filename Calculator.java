import java.util.*;

public class Calculator{
    /*Evaluate a postfix expression stored in s.
     *Assume valid postfix notation, separated by spaces.
     */
    public static double eval(String s){
      String[] equation = s.split(" ");
      System.out.println(Arrays.toString(equation));
      MyDeque<Double> history = new MyDeque<Double>(equation.length);
      for(int index = 0; index < equation.length; index ++){
          if(equation[index].charAt(0) == '+'){
            double num1 = history.getLast();
            history.removeLast();
            double num2 = history.getLast();
            history.removeLast();
            history.addLast(num1 + num2);
          }
          else if (equation[index].charAt(0) == '-') {
            double num1 = history.getLast();
            history.removeLast();
            double num2 = history.getLast();
            history.removeLast();
            history.addLast(num2 - num1);
          }
          else if (equation[index].charAt(0) == '*') {
            double num1 = history.getLast();
            history.removeLast();
            double num2 = history.getLast();
            history.removeLast();
            history.addLast(num2 * num1);
          }
          else if (equation[index].charAt(0) == '/') {
            double num1 = history.getLast();
            history.removeLast();
            double num2 = history.getLast();
            history.removeLast();
            history.addLast(num2 / num1);
          }
          else if (equation[index].charAt(0) == '%') {
            double num1 = history.getLast();
            history.removeLast();
            double num2 = history.getLast();
            history.removeLast();
            history.addLast(num2 % num1);
          }
          else{
            history.addLast(Double.parseDouble(equation[index]));
          }
          System.out.println(history);
          System.out.println(Arrays.toString(equation));
      }
      return history.getLast();
    }
  public static void main(String[] args) {
    System.out.println(eval("1 2 3 4 5 + * - -"));
  }
}
