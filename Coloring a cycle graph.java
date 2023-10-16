// Java program to find number of colors
// required to color a cycle graph
import java.io.*; 

class GFG { 

	// Function that calculates Color 
	// require to color a graph. 
	static int Color(int vertices) 
	{ 
		int result = 0; 

		// Check if number of vertices 
		// is odd or even. 
		// If number of vertices is even 
		// then color require is 2 otherwise 3 
		if (vertices % 2 == 0) 
			result = 2; 
		else
			result = 3; 
	
		return result; 
	} 
	
	// Driver program to test above function 
	public static void main (String[] args) 
	{ 
		int vertices = 3; 
		
		System.out.println("No. of colors require is: " + Color(vertices));
		
	} 
} 

// this code is contributed by Naman_Garg
