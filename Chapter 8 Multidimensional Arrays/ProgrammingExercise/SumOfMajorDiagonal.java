import java.util.Scanner;

public class SumOfMajorDiagonal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter the number of rows and columns");
        int rows = s.nextInt();
        int columns = s.nextInt();
        int sumOfDiagonal=0;
        System.out.println("Enter grid");
        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<columns; j++)
            {
                if(i==j)
                    sumOfDiagonal+=s.nextInt();
                else
                    s.nextInt();
            }
        }

        System.out.println("Sum of major diagonal is "+sumOfDiagonal);
        
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
    Sum of major diagonal is 15
 */