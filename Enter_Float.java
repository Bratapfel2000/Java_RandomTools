import java.util.Scanner;

public class Enter_Float {

    public static void main(String[] args) {
        double x;

        Scanner in = new Scanner(System.in);

        // ask for input and get value
        System.out.print("Enter double");
        x = in.nextDouble();

        System.out.printf("%.2f x \n",x);
        System.out.println(x);
    }

}
