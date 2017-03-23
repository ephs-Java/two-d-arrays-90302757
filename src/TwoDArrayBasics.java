import java.util.Random;

public class TwoDArrayBasics {

	public static void main(String[] args) {
		// Create a 3 x 5 array of ints
		int[][] td = new int[3][5];
		
		// Fill the array with random numbers using fillRandom
		
		
		// test each method you create below.
		fillRandom(td, 1, 100);
		print(td);
		System.out.println(sum(td, 0));
		
		

	}
	/*
	 * given the lower and upper bounds of the random numbers
	 * fill an array of random numbers 
	 */
	public static void fillRandom(int[][] n, int low, int high){
		Random random = new Random();
		for(int row = 0; row < n.length; row++){
			for(int cols = 0; cols < n[0].length; cols++){
				n[row][cols] = random.nextInt(high) + low;
				
			}
		}
	}
	
	
	/*
	 * create a method that prints a 2D array
	 */
	public static void print(int[][] n){
		for(int row = 0; row < n.length; row++){
			System.out.print("{\t ");
			for(int cols = 0; cols < n[0].length; cols++){
				System.out.print(n[row][cols] + "\t");
			}
			System.out.println(" } ");
		}
	}
	
	
	/*
	 * return the sum of a row (r) in a 2D array (nums)
	 */
	public static int sum(int[][] nums, int row){
		int total = 0;
		for(int i = 0; i < nums[row].length; i++){
			total += nums[row][i];
			
		}
		
		return total;
	}
	

	
	/*
	 * return an array of row sums of a 2D array (nums)
	 */
	public static int[] sumAll(int[][] n){
		int[] sums = new int[n.length];
		for(int i = 0; i < sums.length; i++){
			sums[i] = sum(n, i);
		}
		return sums;
	}

	
	
	/*
	 * check a 1D array for repeats, return true if all 
	 * elements of the array are unique
	 */
	public static boolean compare(int[] n){
		for(int i = 0; i < n.length; i++){
			for(int j = 0; i < n.length; j++){
				if(i != j && n[i] == n[j]){
					return false;
				}
			}
		}
		return true;
	}
	
	/*
	 * given an array
	 * return the index of the target value, 
	 * return -1 if it is not found
	 */
	public static int index(int[] n, int target){
		for(int i = 0; i < n.length; i++){
			int test = n[i];
			if(test == target){
				return i;
			}
		}
		return -1;
		
	}
	

	
	
	/*
	 * return the min value in a 2D array
	 */
	public static int minVal(int[][] n){
		int min = 0;
	
		for(int i = 0; i < n.length; i++){
			for(int j = 0; j< n[i].length; j++){

				if(min > n[i][j]){
					min = n[i][j];
				}
				min = n[i][j];
			}      
			min = 0;
    		}
		return min;
	}
	

	

	
	
	
	/*
	 * return the max value in a 2D array
	 */
	public static int maxVal(int[][] n){
		int max = 0;
		
	    for(int i = 0; i < n.length; i++){
	      for(int j = 0; j< n[i].length; j++){

	        if(max < n[i][j]){
	          max = n[i][j];
	        }
	        max = n[i][j];
	      }      
	      max = 0;
	    }
	  return max;
	}
}
