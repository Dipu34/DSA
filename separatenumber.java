import java.util.Arrays;

public class separatenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {2,2,3,5,6,7,8,9};
   System.out.println("original array:");

   for(int i=0;i<arr.length-1;i++) {
	   System.out.print(arr[i]+" ");
	}

arr=separatenumber(arr);
System.out.println("array after separating array:");
for(int i=0;i<arr.length;i++) {
	
System.out.print(arr[i]+" ");
}
}
public static int[]separatenumber(int arr[]){
	int left=0;
	int right=arr.length-1;
	Arrays.sort(arr);
	for(int i=0;i<arr.length-1;i++) {
		while(arr[left]%2==1) {
			left++;
		}
		while(arr[right]%2==0) {
			right--;
		}
		if(left<right) {
			int temp=arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
		}
	}
	return arr;
}
} 