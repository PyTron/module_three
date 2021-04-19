/*
Write a program that asks the user to enter the name of his or her favorite city. use a String variable to store the input. 

The program should display the following:

The number of characters in the city name
the name of the city in all uppercase letters
the name of the city in all lower case letters
the first character in the name of the city
Start
    input city
    printcity.stringlength
    print city stringtouppercase
    print city string to lowercase
    printy city char.str(1)
End
*/
import java.util.Scanner;
public class Problem4 {
   public static void main(String[] args) throws Exception {
       Scanner city = new Scanner(System.in);
       System.out.println("Please Enter the Name of Your Favorite City...");
       String myCity = city.nextLine();
       System.out.println("The city you entered is " + myCity.length() + " characters long.");
       System.out.println("Your city in all upper case letters: " + myCity.toUpperCase());
       System.out.println("Your city in all lower case letters: " + myCity.toLowerCase());
       System.out.println("Your city starts with the letter: " + myCity.charAt(0));
       city.close();

   } 
}
