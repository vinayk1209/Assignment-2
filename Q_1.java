
public class Q_1 {
	
	//WAP to find the duplicates present in an array.
	
	public static void main(String[] args) {
		
		int[] arr = {5, 6, 6, 7, 2, 5, 2, 7};
		boolean flag = false;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] == arr[j]) {
					System.out.println("Duplicate Element: " + arr[i]);
					flag = true;
				}
			}
		}
		
		if(!flag) System.out.println("Duplicates not found"); 
	}
}
