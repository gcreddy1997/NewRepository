package JavaPrograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverceNumber {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// reverse the number
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter the number ");
		int number = Integer.parseInt(br.readLine());
		// 12345
		int revNumber =0;
		int counter=1;
		
		while(number>0) {
			int reminder = number % 10;
		//	System.out.println(reminder);
			number = number/10;
			revNumber = revNumber*10 +reminder;	
			if (counter==3) {
				break;
			}
			counter = counter+1;	
			
		}
		System.out.println(revNumber);
		
		int x=2;
	    x*= 2+5;	    
		System.out.println(x);
		
		

	}

}
