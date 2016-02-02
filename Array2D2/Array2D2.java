public class Array2D2
{
    public static void main (String[] args)
    {
        int[] [] grid = new int [3][5];
        int i = 1;
        int totalsum = 0;
        //int rowsum = 0;
        int colsum = 0;
        for(int row = 0; row < grid.length; row++)
        {
            int rowsum = 0;
            for(int col = 0; col < grid[0].length; col++)
            {
                grid[row][col] = i;
                i = i+1;
                totalsum += grid[row][col];
                System.out.print(grid[row][col] + "\t");
                rowsum += grid[row][col];
            }
            System.out.print("This row sum is " + rowsum + ".");
            System.out.println("\n");
        }
        System.out.println("The total sum is " + totalsum + ".");

    }
}
