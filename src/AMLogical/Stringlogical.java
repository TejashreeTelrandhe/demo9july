package AMLogical;

public class Stringlogical {

	public static void main(String[] args) {
		//WAP to count no of words which starts with 's' in given string 
		String s = "My name is Abhishek Mudholkar and my native place is Nagpur, Vidarbha. I have total 3.5 years of working experience in software testing field. In my project I was responsible for automating scripts using java selenium and in that we are using Jenkins for test case execution, jira for defect tracking and we are following agile scrum process.";
				String[] arr = s.split(" ");
			
				int count = 0 ;
				
				for (int i=0;i<arr.length;i++) {
					String word=arr[i];
					for(int j=0;j<word.length();j++){
					  if(word.charAt(0)=='m'|| word.charAt(0)=='M') {
						  count++;
					 }
					  word="";
					}
				}
				System.out.println(count);
	}

}
