//find the second largest
public class secondlargest {
	public static int seclargest(int[] a , int n){ 
		int temp;
for(int i=0 ;i<n;i++) {
	for(int j=i+1 ;j<n;j++) {
	if(a[i]>a[j])
	{
	temp=a[i];
	a[i]=a[j];
	a[j]=temp;
	}
	}
}
return a[n-2];
}
	public static void main(String [] args) {
		int[] a= {2,4,3,1,56,32};
		System.out.println("the second largest elements is :" +seclargest(a,6));
	}
}
