package tuluyen;
import java.io.*;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
public class Student2 implements Serializable{
    private int studentID;
    private String studentName;

    Student2(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }
//    public int getStudentID(){
//        return studentID;
//    }
//    public void setStudentID(int studentID){
//        this.studentID = studentID;
//    }
//    public String getStudentName(){
//        return studentName;
//    }
//    public void setStudentName(String studentName){
//        this.studentName = studentName;
//    }
        public String toString(){
            return studentID+" "+studentName+" ";
    }
}
class StudentDemo {
    public static void main(String[] args) {
        try {
            File file = new File("student.txt");
            Student2 s1 = new Student2(101, "Kapil Shukla");
            System.out.println(s1);
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
            oos.writeObject(s1);
            oos.close();
            ObjectInputStream ois = new ObjectInputStream((new FileInputStream(file)));
            Student2 s2 = (Student2) ois.readObject();
            ois.close();
            System.out.println("Student Info:" + s2);
            System.out.println(file.getAbsoluteFile());
        }
        catch(ClassNotFoundException ex){
            System.out.println("Class not found");
        }
        catch (FileNotFoundException ex){
            System.out.println("File khong ton tai.");
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
