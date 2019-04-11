
public class transpose {
	

	public static void main(String[] args) {
		
		int matrix[][] = {{1,2,3},{3,4,2},{2,6,7}};
		
		int transpose[][]=new int[3][3];
		
		for(int i=0;i<3;i++)
		{
			for (int j=0;j<3;j++)
			{
				transpose[j][i]=matrix[i][j];
			}
		}
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(matrix[i][j]);
			}
			System.out.println();
			
		}
		
		System.out.println("The transposed matrix is :") ;
		
		for(int i=0;i<3;i++)
			
		{
			for (int j=0;j<3;j++)
			{
				System.out.print(transpose[i][j]);
			}
			
			System.out.println();
		}
		// TODO Auto-generated method stub

	}

}
