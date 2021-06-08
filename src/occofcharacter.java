// JAVA program to count occurrences
// of a character
public class occofcharacter {
public static int character(String str, char c){
	int res=0;
	for(int i=0;i<str.length();i++) {
		if(str.charAt(i)==c) {
			res++;
		}
	}
	return res;
	
}
public static void main(String args[]) {
	String str="chauhanrenu";
	char c='e';
	System.out.println("the char a is occured "+character(str,c));
}

}

