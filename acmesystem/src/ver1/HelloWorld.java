package ver1;

import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Hello from Eclipse");
        System.out.println("Gennaro is working locally on his branch");

        heyNow();

        System.out.print("Enter a string: ");
        String userString = input.nextLine();

        whatFor(userString);

        input.close();
    }

    public static void heyNow() {
        String Msg = "Hey Now!";
        System.out.println(Msg);
    }

    public static void whatFor(String stringArg) {
        System.out.println(stringArg + ", what for?");
    }
}