import javax.swing.JOptionPane;
public class Array2D4 
{
    public static void main(String args[]) 
    {
        String rwString = JOptionPane.showInputDialog("Enter a number");
        String clString = JOptionPane.showInputDialog("Enter a number");
        int rw = Integer.parseInt(rwString);
        int cl = Integer.parseInt(clString);
        int i = 0;

        String[][] grid = new String [rw][cl];
        String[] letters = new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

        for(int row = 0; row < grid.length; row++) 
        {
            for(int col = 0; col < grid.length; col++)
            {
                grid[row][col] = letters[i];
                System.out.print(grid[row][col] + "\t");
                i++;
                if (i == 26)
                {
                    i-=26;
                }
            }
            System.out.println("\n");
        }
    }

}
