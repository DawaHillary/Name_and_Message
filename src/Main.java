import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
    //A program to take a name as input and print a message for that particular name
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Hello " + name + " welcome to our program.");

    }
}