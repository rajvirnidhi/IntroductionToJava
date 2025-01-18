//The problem is to write a program that will grade multiple-choice tests.

import java.util.Scanner;

class GradingMultipleChoiceTest
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = s.nextInt();

        System.out.print("Enter the number of questions: ");
        int numQuestions = s.nextInt();

        char[] key = new char[numQuestions];
        char[][] marks = new char[numStudents][numQuestions];
        int[] grades = new int[numStudents];

        System.out.println("Enter the answer key");
        for(int i=0;i<numQuestions;i++)
        {
            key[i]=s.next().charAt(0);
        }

        for(int i=0;i<numStudents;i++)
        {
            int calcGrade = 0;
            System.out.println("Enter the answer for " + (i+1) + " student");
            for(int j=0;j<numQuestions;j++)
            {
                marks[i][j]=s.next().charAt(0);
                if(marks[i][j]==key[j])
                    calcGrade++;
            }
            grades[i]=calcGrade;
        }

        for(int i=0;i<numStudents;i++)
        {
            System.out.println("Marks for " + i+1 +" student is " + grades[i]);
        }
        s.close();
    }
}

/*
PS D:\IntroductionToJava\IntroductionToJava\Chapter 8 Multidimensional Arrays\CaseStudy> javac GradingMultipleChoiceTest.java
PS D:\IntroductionToJava\IntroductionToJava\Chapter 8 Multidimensional Arrays\CaseStudy> java GradingMultipleChoiceTest      
Enter the number of students: 8
Enter the number of questions: 10
Enter the answer key
D
B
D
C
C
D
A
E
A
D
Enter the answer for 1 student
A
B
A
C
C
D
E
E
A
D
Enter the answer for 2 student
D
B
A
B
C
A
E
E
A
D
Enter the answer for 3 student
E
D
D
A
C
B
E
E
A
D
Enter the answer for 4 student
C
B
A
E
D
C
E
E
A
D
Enter the answer for 5 student
A
B
D
C
C
D
E
E
A
D
Enter the answer for 6 student
B
B
E
C
C
D
E
E
A
D
Enter the answer for 7 student
B
B
A
C
C
D
E
E
A
D
Enter the answer for 8 student
E
B
E
C
C
D
E
E
A
D
Marks for 01 student is 7
Marks for 11 student is 6
Marks for 21 student is 5
Marks for 31 student is 4
Marks for 41 student is 8
Marks for 51 student is 7
Marks for 61 student is 7
Marks for 71 student is 7
 * */
