public class Array2D1
{
    public static void main (String[] args)
    {
        int[] [] grid = new int [3][4];

        for(int row = 0; row < grid.length; row++)
        {
            for(int col = 0; col < grid[0].length; col++)
            {
                grid[row][col] = (int)(Math.random()*10);
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

        for(int row = 0; row < grid.length; row++)
        {
            for(int col = 0; col < grid[0].length; col++)
            {
                if(grid[row][col]==5)
                {
                    System.out.println(row + " , " + col);
                }
            }
        }
    }
}

