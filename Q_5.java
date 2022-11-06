import java.util.Scanner;

public class Q_5 {
	
	//WAP to sort an array using Selection Sort Algorithm.
			
		 void selectionSort(int[] arr){  
	        for (int i = 0; i < arr.length-1; i++)  
	        {  
	            int index = i;  
	            for (int j = i+1; j < arr.length; j++){  
	                if (arr[j] < arr[index]){  
	                    index = j;
	                }  
	            }  
	            int smallerNumber = arr[index];   
	            arr[index] = arr[i];  
	            arr[i] = smallerNumber;  
	        }  
	    }  
	       
	    public static void main(String args[]){  
	    	
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
	    	
	    	//before applying selection sort
	        System.out.println("Before applying Selection Sort");  
	        for(int i:arr){  
	            System.out.print(i+" ");  
	        }   
	        System.out.println();
	        
	        //creating an object to call selectionSort method to apply on array.
	        Q_5 ob = new Q_5();
	        ob.selectionSort(arr);
	         
	        //after applying selection sort 
	        System.out.println("After applying Selection sort");  
	        for(int i:arr)  
	            System.out.print(i+" ");  
	}

}
