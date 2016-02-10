public class Swapper
{
    public static void main ( String[] args )
    {
        int rowprod = 1;
        int colprod = 1;
        int rowHighestProd = 0;
        int colHighestProd = 0;
        int rowOfHighestProd = 0;
        int colOfHighestProd = 0; 
        int[] [] grid = new int[][] {{9, 0, 2, 5, 0, 9, 0, 5, 8, 5},
                {4, 8, 1, 7, 0, 5, 3, 6, 2, 0},
                {7, 7, 5, 6, 0, 5, 6, 6, 4, 0},
                {5, 1, 6, 2, 2, 2, 0, 9, 1, 9},
                {0, 7, 8, 9, 0, 7, 4, 3, 8, 6},
                {1, 0, 5, 6, 3, 2, 9, 3, 5, 3},
                {5, 3, 1, 4, 9, 9, 1, 3, 4, 8},
                {5, 6, 9, 9, 7, 8, 7, 3, 9, 3},
                {1, 0, 4, 8, 3, 1, 0, 2, 1, 5},
                {1, 7, 3, 6, 3, 7, 8, 3, 3, 6}};

        for(int row = 0; row < grid.length; row++)
        {
            for(int col = 0; col < grid[0].length; col++)
            {
                if (grid[row][col] != 0)
                {
                    rowprod *= grid[row][col];
                    if (rowprod > rowHighestProd)
                    {
                        rowHighestProd = rowprod;

                    }
                }
            }

        }

        for(int col = 0; col < grid[0].length; col++)
        {
            for(int row = 0; row < grid.length; row++)
            {
                if (grid[row][col] != 0)
                {
                    colprod *= grid[row][col];
                    if (colprod > colHighestProd)
                    {
                        colHighestProd = colprod;  

                    }
                }
            }

        }

        for(int row = 0; row < grid.length; row++)
        {
            for(int col = 0; col < grid[0].length; col++)
            {
                if (grid[row][col] == grid[colOfHighestProd][rowOfHighestProd])
                {    
                    grid[row][col] = 0;
                }
                else if (grid[row][col] == 0)
                {
                    grid[row][col] = grid[colOfHighestProd][rowOfHighestProd];
                }
            }
        }

        for(int row = 0; row < grid.length; row++)
        {
            for(int col = 0; col < grid[0].length; col++)
            {
                System.out.print(grid[row][col] + "\t");
            }
            System.out.println("\n");
        }
    }
}
