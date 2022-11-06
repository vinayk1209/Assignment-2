import java.util.Scanner;

public class Q_3 {

	//WAP to sort an array using Bubble Sort Algorithm.
	
	public static void main(String[] args) {
		
		int n=0;
    	Scanner sc = new Scanner(System.in);
    	
    	//collecting the size and declaring an array
    	System.out.print("Enter the number of elements to store: ");
    	n = sc.nextInt();
    	int[] arr = new int[n];
    	
    	//collecting and initializing elements of an array from the user
    	for(int i=0; i<n; i++) {
    		System.out.print("Element " + (i+1) + ": ");
    		arr[i] = sc.nextInt();
    	}
    	
    	//before applying Bubble Sort
        System.out.println("Before applying Bubble Sort");  
        for(int i:arr){  
            System.out.print(i+" ");  
        }   
        System.out.println();
        
        //sorting array using Bubble Sort
        for(int i = 0; i < arr.length; i++) {
			for(int j = 1; j < arr.length - i; j++) {
				if(arr[j-1] > arr[j]) {
					int temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
         
        //after applying Bubble sort 
        System.out.println("After applying Bubble Sort");  
        for(int i:arr)  
            System.out.print(i+" ");  
	}

}
