package tuluyen;

import java.io.*;
import java.nio.Buffer;

public class BaiDemSoTu {
    public static void main(String[] args) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("DemSoTu.txt"));
            writer.write("Hello beautiful world");
            writer.close();
            BufferedReader reader= new BufferedReader(new FileReader("DemSoTu.txt"));
            String line;
            int wordCount = 0;
            while((line = reader.readLine())!= null) {
                System.out.println(line);
                String[] words = line.split("\\s+");
                wordCount += words.length;
                System.out.print(wordCount);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
