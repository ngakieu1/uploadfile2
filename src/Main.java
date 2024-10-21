import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("/Users/kieuthinga/IdeaProjects/InputOutput/data2ltptdl.txt");
                    //hoac: "/Users/kieuthinga/Downloads/data2ltptdl.txt");
            FileOutputStream fos = new FileOutputStream("abc.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);
            //BufferedInputStream bis = new BufferedInputStream(new FileInputStream("/Users/kieuthinga/IdeaProjects/InputOutput/data2ltptdl.txt");
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            ////BufferedInputStream bos = new BufferedInputStream(new ???FileInputStream("abc.txt");
            //int x = fis.read();
//            while(x!=-1){ //-1 la du lieu cuoi cung
//            System.out.printf("%c",x);// printf
//            x = fis.read();
//        }
            //while ((x=fis.read())!=-1{fos.write(x);}
//            while ((x=fis.read)!=-1){}
//            while(x!=-1){
//                fos.write(x);
//                x = fis.read();
//            }
            int y;
            while((y=bis.read())!=-1){
                bos.write(y);
            }
//            fis.close();
//            fos.close();
            bis.close();
            bos.close();
        }
        catch (FileNotFoundException ex){
            System.out.println("File khong ton tai.");
        }
        catch(IOException ex){
            System.out.println("Toi khong doc duoc");
        }
    }
}