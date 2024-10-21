package baitapthuchanh;
import java.io.*;

public class FileCopyNoBuffer {
    public static void main(String[] args) {
        File fileIn;
        FileInputStream in = null;
        FileOutputStream out = null;
        long startTime, elapsedTime;
        try {
            fileIn = new File("/Users/kieuthinga/IdeaProjects/InputOutput/src/tuluyen/image_sky.jpg");
            System.out.println("File size is" + fileIn.length() + "bytes");
            in = new FileInputStream(fileIn);
            out = new FileOutputStream("b.jpg");
            startTime = System.nanoTime();
            int byteRead;
            while ((byteRead = in.read()) != -1) {
                out.write(byteRead);
            }
            elapsedTime = System.nanoTime() - startTime;
            System.out.println("Elapsed Time is " + (elapsedTime / 1000000.0) + " msec");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {    // always close the streams
            try {
                if (in != null) in.close();
                if (out != null) out.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}


