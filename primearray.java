//Program will create an array of prime numbers within a user's defined range
//Program will then print out the array.
import java.util.Scanner;
public class primearray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		int lowRange;
		int high;
		int arrayCount = 0;
		int arrayLength = 0;
		
		//Get user input
		System.out.println ("This program will list all prime numbers within a range.");
		System.out.println ("Please enter the lower range: ");
		lowRange = userInput.nextInt();
		
		System.out.println ("Please enter the upper range: ");
		high = userInput.nextInt();
		
		
		//Close the user input
		userInput.close();
		
		//loop to determine array length
		for (int i = lowRange; i <= high; i++){
			if (isPrime(i)){
				arrayLength = arrayLength + 1;
			}
		}
		
		//Declare the array
		int[] primeArray = new int [(arrayLength)];
		
		//loop to test for prime numbers
		for (int i = lowRange; i <= high; i++){
			
			//System.out.println("number " + i + " is " + isPrime(i));
			if (isPrime(i)){
				primeArray[arrayCount] = i;
				arrayCount = arrayCount + 1;
			}
		}
		//Print out the results
		System.out.println("\n\nThe prime numbers in that range are: ");
		for (int i = 0; i < primeArray.length; i++){
		System.out.println((primeArray[i]));
		}
	}
	
	
	
	//method to test for prime number.
	//returns true or false.
	public static boolean isPrime(int number){
		if (number < 2){
			return false;
		}
		//loop tests if there is a divisor.
		//if one if found, return false.
		//else return true.
		for(int i = 2; i < number; i++ ) {
			if(number%i == 0){
				return false;
			}
		}
		return true;
	}
}
