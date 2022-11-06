
public class Q_6 {
	
	//WAP to check whether an array is a subset of another array.
	
	public static void main(String[] args) {
		
		int[] arr1 = {2, 3, 56, 6, 7, 8, 34, 5};
		int[] arr2 = {8, 34, 66};
		
		int j;
		boolean flag = false;
		
		for(int i = 0; i < arr2.length; i++) {
			for(j = 0; j < arr1.length; j++) {
				if(arr2[i] == arr1[j]) 
					break;
			}
			if(j == arr1.length) flag = false;
			else flag = true;
		}
		
		if(flag) System.out.println("arr2[] is the subset of arr1[]");
		else System.out.println("arr2[] is not the subset of arr1[]");
	}

}
