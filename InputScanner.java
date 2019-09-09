import java.util.Scanner;

/**
 * Input for string and integer
 */
public class InputScanner {

    public static void main(String[] args) {
        String strings;
        int numbers;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter String ");
        strings = in.nextLine();
        System.out.print("Enter Integer ");
        numbers = in.nextInt();
        System.out.printf("String %s, Integer %d\n", strings, numbers);


    }

}
