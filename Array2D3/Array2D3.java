public class Array2D3 
{
    public static void main(String[] args) 
    {   
        int[][] grid = new int [10][10];

        for(int row = 0; row < grid.length; row++)
        {
            for(int col = 0; col < grid[0].length; col++)
            {
                grid[row][col] = (row)*(col);
            }
        }

        for(int row = 0; row < grid.length ; row++)
        {
            for (int col = 0; col < grid[0].length; col++)
            {
                System.out.print(grid[row][col] + "\t");
            }
            System.out.println("\n");
        }
    }
}