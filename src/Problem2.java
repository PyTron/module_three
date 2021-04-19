/*
Write a program that reads in an integer, and breaks it into a sequence of individual digits. Display each digit on a separate line.

For example, the input 16384 is displayed as

1

6

3

8

4

You may assume that the input has no more than five digits and is not negative.
Start    
    Input probIn
    probStr = probIn.ToString
    int counter = 0;
    while counter <= length of probStr - 1
        Print probStr[counter]
        counter++
End
*/
import java.util.Scanner;
public class Problem2 {
   public static void main(String[] args) throws Exception {
        Scanner probIn = new Scanner(System.in);
            System.out.println("Enter a number...");
                int probInt = probIn.nextInt();
                String probStr = String.valueOf(probInt);
                int counter = 0;
                while (counter <= (probStr.length() - 1)) {
                    System.out.println(probStr.charAt(counter));
                    counter++;
                }
        probIn.close();
   } 
}
