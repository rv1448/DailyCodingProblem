package stack;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args){
        StackInterface<String> reversestring = new ArrayBoundedStack<String>(10);
        Scanner scan = new Scanner(System.in);
        String input;

        for(int i=0;i<=4;i++){
            System.out.println("Enter the String for "+ i);
            input = scan.nextLine();
            reversestring.push(input);
            System.out.println(reversestring.toString());
        }
        for(int i=0;i<=4;i++){

            System.out.println("Enter the String for "+ i);
            reversestring.pop();
            System.out.print(reversestring.toString());
        }

    }
}
