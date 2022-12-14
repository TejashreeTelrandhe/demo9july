package AMLogical;

public class PerfectNumber {
public static void main(String[] args) {
         	int a;
			int b=6;
			int sum=0;
			for(a=1; a<b;a++) {
			if(b%a==0)
				sum=sum+a;			//1 ,3 , 6
			}
			if(sum==b) {
				System.out.println(b+ " Is a perfect number");
			}
			else {
				System.out.println(b+ " Is Not a perfect number");
			}
			
	}

}
