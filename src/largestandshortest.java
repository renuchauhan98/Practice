
	//find the largest and shortest element in the list of array
	public class largestandshortest {
		public static int largeandshort(int[] a , int n){ 
			for(int i=0;i<a.length;i++) {
				for(int j=i+1;j<a.length;j++) {
					if(a[i]>a[j]) {
						int temp=a[i];
						a[i]=a[j];
						a[j]=temp;					
					}				
				}		
			}
			System.out.println(a[n-1]); 
			System.out.println(a[0]);
	return 0;
	}
		public static void main(String [] args) {
			int[] a= {2,4,3,1,56,3};
			int n=a.length;
			largeandshort(a,n);
			
		}
	}
