package array;

import java.util.Arrays;

public class RotateArray {

	public RotateArray() {

	}
	
	public void reverse(int[] arr,int start,int end){
		while(start<end){
			int tmp = arr[start];
			arr[start] = arr[end];
			arr[end] =tmp;
			start++;
			end--;
		}
	}
	
	int[] rotateK(int []arr,int k){
		
		if(arr==null || arr.length == 0)return arr;
		k=k%arr.length;
		
		reverse(arr,0,arr.length-1);
		reverse(arr,0,k-1);
		reverse(arr,k,arr.length-1);
		
		return arr;
	}
	
	public static void main(String[] args) {
		RotateArray rotateArray = new RotateArray();
		int[] arr = new int[]{12,34,4,3,4,3,45,3};
		rotateArray.rotateK(arr, 10);
		System.out.println(Arrays.toString(arr));
	}

}
