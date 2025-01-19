//Given a set of points, the closest-pair problem is to find the two points that are nearest to each other.
import java.util.Scanner;

class ClosestPoints
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of points");
        int numberOfPoints = s.nextInt();
        double[][] points = new double[numberOfPoints][2];
        
        System.out.println("Enter Cordinates for Points");
        for(int i=0;i<numberOfPoints;i++)
        {
            System.out.println("Enter cordinates for point " + (i+1));
            points[i][0]=s.nextDouble();
            points[i][1]=s.nextDouble();
        }

        int p1=0,p2=1;
        double shortestDistance=distance(points[p1][0],points[p1][1],points[p2][0],points[p2][1]);
        for(int i=0;i<points.length;i++)
        {
            for(int j=i+1;j<points.length;j++)
            {
                double distance = distance(points[i][0], points[i][1], points[j][0], points[j][1]);
                if(distance<shortestDistance)
                {
                    shortestDistance=distance;
                    p1=i;
                    p2=j;
                }
            }
        }
        s.close();
        System.out.println("Shortest distance "+shortestDistance+" is between points ("+ points[p1][0] + "," + points[p1][1] + ") and ("+ points[p2][0] +","+ points[p2][1]+")");
    }

    public static double distance(double x1, double y1, double x2, double y2)
    {
        return Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
    }
}

/*
Enter number of points
8
Enter Cordinates for Points
Enter cordinates for point 1
-1
3
Enter cordinates for point 2
-1
-1
Enter cordinates for point 3
1
1
Enter cordinates for point 4
2
0.5
Enter cordinates for point 5
2
-1
Enter cordinates for point 6
3
3
Enter cordinates for point 7
4
2
Enter cordinates for point 8
4
-0.5
Shortest distance 1.118033988749895 is between points (1.0,1.0) and (2.0,0.5)
 */