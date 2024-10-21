package baitapthuchanh;

import java.io.*;

public class FileCopyBuffered {
    public static void main(String[] args) {
        File fileIn;
        BufferedInputStream in = null;
        BufferedOutputStream out = null;
        long startTime, elapsedTime;
        try{
            fileIn = new File("/Users/kieuthinga/IdeaProjects/InputOutput/src/tuluyen/image_sky.jpg");
            System.out.println("File size is " + fileIn.length() + " bytes");
            in = new BufferedInputStream(new FileInputStream(fileIn));
            out = new BufferedOutputStream(new FileOutputStream("b.jpg"));
            startTime = System.nanoTime();
            int byteRead;
            while ((byteRead = in.read()) != -1) {
                out.write(byteRead);
            }
            elapsedTime = System.nanoTime() - startTime;
            System.out.println("Elapsed Time is " + (elapsedTime / 1000000.0) + " msec");
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {            // always close the streams
            try {
                if (in != null) in.close();
                if (out != null) out.close();
            } catch (IOException ex) { ex.printStackTrace(); }
        }
    }
}
