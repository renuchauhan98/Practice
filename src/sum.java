import java.util.Arrays;

public class sum{
static int total(int arr[] , int n){
Arrays.sort(arr);

int sum=arr[0];
for(int i=0;i<n-1;i++)
{
	for(int j=0;j<=i;j++) {
if(j==i)
{
sum=sum+arr[i];
}
if(arr[i]==arr[j])
{
break;
}
}
}
return sum;
}
public static void main(String args[]){
int arr[]={10,5,5,1};
int n=arr.length;
System.out.println(total(arr,n));
}
}