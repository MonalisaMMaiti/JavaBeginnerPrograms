
public class Arrays {

	public static void main(String[] args) {
		//1-D Array................................................
		int num =6;
		int arr[]={4,5,6,7,1};
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]== num) 
			{
				System.out.println("Num " +num+ " Found at position "+ i);
			}	
		}
		
		// Array of String............................................
		String[] words = new String[5];
		words[0]= "Hello";
		words[1]= "To";
		words[2]= "Everyone";
		words[3]= "Present";
		words[4]= "Overhere";
		
		System.out.print("The Entire String :- ");
		for(int i=0;i<words.length;i++)
		{
			System.out.print(words[i]+" ");
		}System.out.println("\n");
		String[] fruits = {"Apple","Bannana","Kiwi","Orange"};
		for(String fruit : fruits)
		{
			System.out.print(fruit+" ");
		}
		
		// Multi-Dimensional Array.....................................
		
		int[][] grid= {
			{3,5,23,44},
			{56,22,7,6},
			{2,4,21,23}	};
		System.out.println(grid[1][1]);
		String[][] texts = new String[2][3];
		
		texts[0][1]="3X4 D ARRAY";
		System.out.println(texts[0][1]);
		for(int row=0;row<grid.length;row++) 
		{
			for(int col=0;col<grid[row].length;col++) 
			{
				System.out.print(grid[row][col]+"\t");
			}
			System.out.println();
		}
	}

}
