package AMLogical;

public class CountWord2 {

	public static void main(String[] args) {
String a="A sentence is a group of words that usually have a subject, verb and information about the subject";

System.out.println(a.length());//98

int count =1;

for(int i =0;i<a.length()-1;i++) {
	
	if((a.charAt(i)==' ') && (a.charAt(i+1)!=' ')) {
	
		count++;
	}
}
System.out.println("Total number of words : "+count);//18
}

}
