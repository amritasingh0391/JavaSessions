package Arrays;


import java.util.Arrays;

public class LeftRotateElement {

	 int count =0;

	public static void main(String[] args) {
		
		int arr1[] = new int[] {1,2,3,4,5};
		int i = 0,j = 0;
		// find the last index
		int k = arr1.length-1;
		
		for(int n=1 ;n <= 3; n++) {
			int first = arr1[0];
			for(j= 0 ;j < k; j++) {
				arr1[j] = arr1[j+1];
			}
			arr1[k] = first;
			System.out.println(Arrays.toString(arr1));
			
			
			}
		
	}
		
	}


