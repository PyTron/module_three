/*
Write a program that prompts the user for a measurement in meters, and then converts it in to miles, feet, and inches.
Start
    User input meas_Met (Decimal)
    Print "The amount in inches is" + (meas_Met * 39.3701)
    Print "The amount in feet is" + (meas_Met * 3.28084)
    Print "The amount in miles is" + (meas_Met * 0.000621371)
Stop
*/
import java.util.Scanner;
public class Problem1 {
    public static void main(String[] args) throws Exception{
        Scanner meas = new Scanner(System.in);
            System.out.println("Enter an amount in meters...");
                Double meas_Met = meas.nextDouble();
            System.out.println("The amount in inches is " + String.format("%.2f", (meas_Met * 39.3701)));
            System.out.println("The amount in feet is " + String.format("%.2f", ((meas_Met * 3.28084))));
            System.out.println("The amount in miles is " + String.format("%.2f", ((meas_Met / 1609.344))));
        meas.close();
    }
}   