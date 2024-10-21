package tuluyen;
import java.io.*;
import java.util.*;
public class Main2 {
    public static void main(String[] args) {
        try{
            FileInputStream fin = new FileInputStream("/Users/kieuthinga/IdeaProjects/InputOutput/src/tuluyen/image_sky.jpg");
            FileOutputStream fout = new FileOutputStream("sky_image.jpg");
            int c;
            while((c=fin.read())!=-1){
                fout.write(c);
            }
            if (fin != null)
                fin.close();
            if (fout != null)
                fout.close();
            DataOutputStream dos = new DataOutputStream(new FileOutputStream("Int.txt"));
            int i = 100;
            int x = 101;
            dos.writeInt(i);
            dos.writeInt(x);
            //dos.writeString("KTQD");
            dos.close();
//            FileInputStream fis = new FileInputStream("Int.txt");
//            DataInputStream dis = new DataInputStream(fis);
             DataInputStream dis = new DataInputStream(new FileInputStream("Int.txt"));
             int y = dis.readInt();
             int y2 = dis.readInt();
             System.out.println(y);
             System.out.println(y2);
             dis.close();

             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("Int.txt"));
             int a = 3;
             bos.write(a);
             bos.close();
             BufferedInputStream bis = new BufferedInputStream(new FileInputStream("Int.txt"));
             int b;
             b = bis.read();
            System.out.println(b);
        }
        catch(IOException ex){
            System.out.println("Co loi xay ra trong qua trinh doc ghi file");
        }
    }

}
