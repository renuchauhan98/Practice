//Missing number in an array
public class MissingNumber {
public static int missingnumber(int[] a ,int n) {
int sum=0;	
	int m=n+1;
	int  total = m*(m + 1)/2;
	   for (int i = 0; i < n; i++) {
	        sum += a[i];
	    }
	   int number = total- sum;
	return number;
	
}
	public static void main(String[] args) {
		int[] a= {1,6,3,4,5,7};
		int n=a.length;
		System.out.println(missingnumber(a,n));

	}

}
