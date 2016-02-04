import javax.swing.JOptionPane;
public class Array2D3 
{
    public static void main(String[] args) 
    {   
        String rwString = JOptionPane.showInputDialog("Enter a number");
        String clString = JOptionPane.showInputDialog("Enter a number");
        int rw = Integer.parseInt(rwString);
        int cl = Integer.parseInt(clString);
        int[][] grid = new int[rw][cl];

        for(int row = 0; row < grid.length; row++)
        {
            for(int col = 0; col < grid[0].length; col++)
            {
                grid[row][col] = row*col;
                grid[row][0] = row;
                grid[0][col] = col;
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