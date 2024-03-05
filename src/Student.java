import java.util.Scanner;
import java.util.Arrays;

public class Student {

    Scanner reader = new Scanner(System.in);
    private String studentID;
    private String studentName;
    private String [] extraActivities;

    public Student(String studentID,String studentName,int num){
        this.studentID=studentID;
        this.studentName=studentName;
        extraActivities=new String[num];
    }

    public Student(){}

    public String getStudentID(){
        return studentID;
    }

    public String getStudentName(){
        return studentName;
    }

    public void setStudentID(String studentID){
        this.studentID=studentID;
    }

    public void setStudentName(String studentName){
        this.studentName=studentName;
    }

    public void setExtraActivities(String [] extraActivities){
        this.extraActivities=extraActivities;
    }

    public String[] getExtraActivities() {
        return extraActivities;
    }

    public void  AddextraActivities(int num){
        for(int i=0;i<num;i++){
            System.out.println("enter extraActivity"+(i+1));
            extraActivities[i] =reader.nextLine();
        }

    }

    public String toString(){
        return "Student ID: " + studentID + ", Student Name: " + studentName + ", Extra Activities: " +
        Arrays.toString(extraActivities);
    }

}