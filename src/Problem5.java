import java.util.Scanner;

/*
Read a word from the user and 

display the string with the letters shifted to the right by two positions and 

with the letters shifted to the left by two positions in the string. 

Save all of the three strings in separate variables and 

display all three of them at the end of the program.
Start
    input string strOne
    strTwo
    strThree
    int counter = 0
    input int countTwo
    int variance = countTwo;
    while counter < length of strOne
    if variance > 0
       while counter < strOne length
	while countTwo < strOne length
            strTwo = strTwo + strOne.charAt(countTwo)
            countTwo++
            counter++
        strTwo = strTwo + strOnecharAt(counter + variance – strOne length)
   else
 	while counter < strOne length
    		if countTwo < 0
			strTwo = strTwo + strOne.charAt(strOne length + countTwo)
  			countTwo++
			counter++;
		else
   			strTwo = strTwo + strOne.charAt(counter + variance)
		counter++
      print strTwo
      */
public class Problem5 {
    public static void main(String[] args) throws Exception {
        Scanner strIn = new Scanner(System.in);
        System.out.println("Enter a string...");
        String strOne = strIn.nextLine();
        System.out.println("How many Units Would You Like This Moved?");
        int countTwo = strIn.nextInt();
        String strTwo = "";
        int counter = 0;
        int variance = countTwo;
        if(countTwo > 0){
            while (counter < strOne.length()){
                    while (countTwo < strOne.length()){
                    strTwo = strTwo + strOne.charAt(countTwo);
                    countTwo++;
                    counter++;
                }
                strTwo = strTwo + (strOne.charAt(counter + variance - strOne.length()));
                    counter++;
                
            }
        }
        else{
            while (counter < strOne.length()) {
                   if (countTwo < 0){
                        strTwo = strTwo + strOne.charAt(strOne.length() + countTwo);
                        countTwo++;
                        counter++;
                   }
                    else{
                        strTwo = strTwo + strOne.charAt(counter + variance);
                        counter++;
                    }
            }
        }
        System.out.println(strTwo);
            strIn.close();
    }
}
