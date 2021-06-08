//Program to Check if a Given String is Palindrome
public class Palindrome {
	public static boolean stringpalindome(String str) {
		for(int i=0;i<str.length();i++) {
			for(int j=str.length()-1;j>=0;j--) {
			if(str.charAt(i)==str.charAt(j))
			{
				return true;
			}
			else {
				return false;
			}
			}	}
		return false;
	}
	public static void main(String args[]) {
		String str="abba";
		System.out.println("the string is palindrome : "+stringpalindome(str));
	}

}
