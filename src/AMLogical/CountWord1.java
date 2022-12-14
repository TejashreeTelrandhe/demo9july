package AMLogical;

public class CountWord1 {

public static void main(String[] args) {
String a ="The train leaves every morning at 06 AM";//8

System.out.println(a.length());//39

int count=1;

for(int i =0 ;i<a.length()-1;i++) {
	
	if((a.charAt(i)==' ') && (a.charAt(i+1)!=' ')) {
	
		count++;
	}
}
System.out.println("Total number of words is :"+count);
	}

}
