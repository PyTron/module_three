/*
Write a program that asks the user to input:

The number of gallons of gas in the tank
The fuel efficiency in miles per gallon
The price of gas per gallon

Then print the cost per 100 miles and 

how far the car can go with the gas in the car.

input decimal gallons
input decimal price
input decimal efficiency
print "The cost per 100 miles is " + price/efficiency * 100
print "the car can go " + gallons * efficiency + " miles with " + gallons + "in the tank."
*/
import java.util.Scanner;
public class Problem3 {
    public static void main(String[] args) {
        Scanner car = new Scanner(System.in);
        System.out.println("Enter the number of gallons in your gas tank...");
        double gallons = car.nextDouble();
        System.out.println("Enter the price you paid for gas...");
        double price = car.nextDouble();
        System.out.println("Enter the fuel efficiency of your car...");
        double efficiency = car.nextDouble();
        System.out.println("The cost per 100 miles is $" + String.format("%.2f", (price / efficiency * 100)));
        if (gallons == 1) {
        System.out.println("The car can go " + String.format("%.2f", (gallons * efficiency)) + " miles with " + gallons + " gallon in the tank.");
        }
        else {
        System.out.println("The car can go " + String.format("%.2f", (gallons * efficiency)) + " miles with " + gallons + " gallons in the tank.");  
        }
        car.close();
    }
}
