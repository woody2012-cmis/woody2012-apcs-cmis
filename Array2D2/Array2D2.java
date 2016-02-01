public class Array2D2
{
    public static void main (String[] args)
    {
        int[] [] grid = new int [3][5];
        int i = 1;
        int totalsum = 0;
        int[] rowsum = new int[3];
        int[] colsum = new int[5];
        for(int row = 0; row < grid.length; row++)
        {
            for(int col = 0; col < grid[0].length; col++)
            {
                grid[row][col] = i;
                i = i+1;
            }
        }

        for(int row = 0; row < grid.length; row++)
        {
            for(int col = 0; col < grid[0].length; col++)
            {
                System.out.print(grid[row][col] + " ");
            }
            System.out.println("\n");
        }

        for(int[] row : grid)
        {
            for(int num : row)
            {
                System.out.println(rowsum);
            }
        }
    }
}

