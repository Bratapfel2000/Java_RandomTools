public class floater {
  // creates and prints a floating numbers and sums of them and with text included
    public static void main(String[] args) {
      double number = 42.0;
      double number_two = 13;
      double number_sum = number + number_two;
      
      System.out.println(number);
      System.out.println(number_two);
      System.out.println(number_sum);
      
      System.out.println(number + number_two + " Hello World");   // <- double+double+string = double+string
      System.out.println( "Hello World " + number + number_two);  // <- string+double+double = string+double=string
    }
}



