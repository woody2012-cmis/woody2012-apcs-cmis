public class Array2D2
{
    public static void main (String[] args)
    {
        int[] [] grid = new int [3][5];
        int i = 1;
        int totalsum = 0;
        int[] colsum = new int[grid[0].length]; 

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
                colsum[col] += grid[row][col]; 
            }
            System.out.print("The row sum is " + rowsum + ".");
            System.out.println("\n");
        }
        
        for(int k = 0; k < colsum.length; k++)
        {
            System.out.println("The column sum is " + colsum[k] + ".");
        }
        System.out.println("\n");
        System.out.println("The total sum is " + totalsum + ".");

    }
}
