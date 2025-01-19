import java.util.Scanner;

class SumOfElements
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns");
        int rows = s.nextInt();
        int columns = s.nextInt();

        int[][] grid = new int[rows][columns];
        int[] sumOfColumns = new int[columns];
        System.out.println("Enter grid");
        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<columns; j++)
            {
                grid[i][j]=s.nextInt();
                sumOfColumns[j]+=grid[i][j];
            }
        }

        for(int i=0;i<columns;i++)
        {
            System.out.println("Sum of column "+(i+1)+" = "+sumOfColumns[i]);
        }
        s.close();
    }
}

/*
    Enter the number of rows and columns
    3
    3
    Enter grid
    1 2 3
    4 5 6
    7 8 9
    Sum of column 1 = 12
    Sum of column 2 = 15
    Sum of column 3 = 18
 */