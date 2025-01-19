import java.util.Arrays;
import java.util.Scanner;

public class WeeklyHoursOfEmployee {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter number of employees");
        int noOfEmp = s.nextInt();

        int[][] weeklyHrs = new int[noOfEmp][2];

        for(int i=0;i<noOfEmp;i++)
        {
            System.out.println("Enter employee "+ (i+1)+" data");
            int calcHrs = 0;
            for(int j=0;j<7;j++)
            {
                calcHrs+=s.nextInt();
            }
            weeklyHrs[i][0]=i+1;
            weeklyHrs[i][1]=calcHrs;
        }

        Arrays.sort(weeklyHrs, (row1,row2) -> Integer.compare(row2[1],row1[1]) );

        for(int i=0;i<noOfEmp;i++)
        {
            System.out.println("Employee "+weeklyHrs[i][0]+" worked for "+weeklyHrs[i][1]);
        }
        s.close();
    }
}

/*
    Enter number of employees
    8
    Enter employee 1 data
    2 4 3 4 5 8 8
    Enter employee 2 data
    7 3 4 3 3 4 4
    Enter employee 3 data
    3 3 4 3 3 2 2
    Enter employee 4 data
    9 3 4 7 3 4 1
    Enter employee 5 data
    3 5 4 3 6 3 8
    Enter employee 6 data
    3 4 4 6 3 4 4
    Enter employee 7 data
    3 7 4 8 3 8 4
    Enter employee 8 data
    6 3 5 9 2 7 9
    Employee 8 worked for 41
    Employee 7 worked for 37
    Employee 1 worked for 34
    Employee 5 worked for 32
    Employee 4 worked for 31
    Employee 2 worked for 28
    Employee 6 worked for 28
    Employee 3 worked for 20
 */