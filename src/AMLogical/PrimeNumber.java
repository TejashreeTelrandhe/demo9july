package AMLogical;

import java.util.Scanner;

public class PrimeNumber {
 
	public static void main(String[] args) {
//  Prime number is number that is greater than 1 and divided by 
//		1 or number itself.
//		example : 2,3,5,7,11,13,17,19,23
		Scanner Sc = new Scanner (System.in);
		System.out.println("Enter a number");
		
		int num = Sc.nextInt();
		
		int tem = 0;
		
		for(int i = 2; i <= num-1 ;i++) {
		if(num%1==0)	
		{
			tem = tem+1;
		}
		}
		if(tem==0)
			System.out.println(num+" Prime number");
		
		else {
			System.out.println(num+" Not a prime number");
}
}
}

