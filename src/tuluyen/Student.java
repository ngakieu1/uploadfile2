package tuluyen;

import java.io.ObjectInputStream;
import java.io.Serializable;
import java.io.*;
public class Student implements Serializable {
    private int studentID;
    private String studentName;

    Student(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }
    public int getStudentID(){
        return studentID;
    }
    public void setStudentID(int studentID){
        this.studentID = studentID;
    }
    public String getStudentName(){
        return studentName;
    }
    public void setStudentName(String studentName){
        this.studentName = studentName;
    }

    public static void main(String[] args) {
        ObjectInputStream in = null;
        ObjectOutputStream out = null;
        try{
            out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("object.txt")));
            Student[] list = new Student[3];
            list[0] = new Student(1,"Peter");
            list[1] = new Student(2, "David");
            list[2] = new Student(3,"Tommy");
            out.writeObject(list);
            out.close();
        }
        catch(IOException ex){
            ex.printStackTrace();
        }
    }
}


