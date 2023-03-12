package Arrays;

import java.util.Arrays;

public class FrequencyOfElement {

	public static void main(String[] args) {
		
		int[] arr1 = {1,2,8,3,2,2,2,5,1};
		int i, j;
		int count = 0 ;
		int visited = -1;
		int arr2[] = new int[arr1.length] ;
		
		for(i=0; i<arr1.length;i++) {
			for(j=0;j<arr1.length;j++) {
			if(arr1[i] == arr1[j]){
				count++;
			}
			
			}
			if(arr2[i]!= visited) {
			arr2[i] = count;
			
		
		}
			//Displays the frequency of each element present in array  
	        System.out.println(" Element | Frequency"); 
			System.out.println(Arrays.toString(arr1) + " " + Arrays.toString(arr2));
	}

}
}
