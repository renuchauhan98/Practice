//No of vowels and consonants in a String
public class vowelsandconsonants {
public static int countvowelsandconso(String str){
	int count=0,sum=0;
	for(int i=0;i<str.length();i++) {
	if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
		count++;
	}
	else {
		sum++;
	}
	}
	System.out.println(count);
	System.out.println(sum);
	return 0;
}
public static void main(String args[]) {
	String str="chauhanrenu";
	countvowelsandconso(str);	
}
}
