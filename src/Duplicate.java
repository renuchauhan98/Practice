// program to find duplicate characters in a String.
public class Duplicate {

	public static void main(String[] args) {
		System.out.println("string conatins duplicate characters : "+ duplicatecharacters("rrenu"));
	}
		public static boolean duplicatecharacters(String str1){
			for(int i=0;i<str1.length();i++) {
				for(int n=i+1;n<str1.length();n++)
			if(str1.charAt(i) ==  str1.charAt(n) )
			{return true;
			}
		
	}
			return false;
	}
}

