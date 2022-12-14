package AMLogical;

public class JunkWord {

public static void main(String[] args) {
String a ="@#&j@#*#@ @u@#&+n@#&@k@@#@w&&@## *#o@#r#&@#@d@##@@";

a=a.replaceAll("[^a-z]", "");//Replaces each substring of this string that matches 
                              //the given regular expression with the given replacement. 

System.out.println(a);
	}

}
