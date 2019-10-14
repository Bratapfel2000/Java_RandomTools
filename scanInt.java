import java.util.Arrays;
import java.util.Scanner;

public class scanInt {
  
        public static int scanInt() {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a number: ");
            if (in.hasNextInt()) {
                break;
            }
            String word = in.next();
            System.err.println(word + " is not a number");
        }
        int x = in.nextInt();
        return x;
    }
 
    public static void main(String[] args) {
      
  //    System.out.print(scanInt());
      scanInt();
    }
}
