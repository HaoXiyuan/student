import java.util.Scanner;
import java.util.Arrays;

public class Main {
 
    public static void main(String[] args){

        Scanner reader=new Scanner(System.in);

        System.out.println("How many Student details you want to add?");
        int count=reader.nextInt();
        reader.nextLine();

        Student [] studentArr=new Student[count];

        for(int i=0;i<count;i++){
            System.out.println("Enter the student ID:");
            String id=reader.nextLine();

            System.out.println("Enter the student name:");
            String name=reader.nextLine();

            System.out.println("Enter the number of extraActivities this student has:");
            int num=reader.nextInt();
            reader.nextLine();
 
            studentArr[i]=new Student(id,name,num);
            studentArr[i].AddextraActivities(num);
        }

 
        for(int i=0;i<count;i++){
        System.out.println(studentArr[i]);
        }

        reader.close();
    }
}