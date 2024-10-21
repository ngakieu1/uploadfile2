package baitapthuchanh;

import java.io.*;
import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
//        File text = new File("/Users/kieuthinga/IdeaProjects/InputOutput/src/baitapthuchanh/data2ltptdl.txt");
//        Scanner scanner = null;
//        try {
//            scanner = new Scanner(text);
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//        while (scanner.hasNextLine()){
//            String line = scanner.nextLine();
//            System.out.println(line);
//        }
//    }
//}
////Phan tach theo dau cach
//Scanner scanner = new Scanner(text).useDelimiter("\\s");
//while (scanner.hasNext()){
//    if (scanner.hasNextInt()){
//        sout("Integer"+scanner.nextInt());
//        }
//    else{
//        sout("String:"+scanner.next());
//        }
//        }
//scanner.close();
        //BufferedWriter in = null;
        try {
            BufferedWriter in = new BufferedWriter(new FileWriter("test.txt"));
            in.write("1 fish 2 fish red fish blue fish");
            in.write("\nDong 2 na");
            in.flush();
            in.close();
            //Doc van ban tren
            BufferedReader out = new BufferedReader(new FileReader("test.txt"));
            String str = out.readLine();
            while (str != null){
                System.out.println(str);
                str = out.readLine();
            }
            out.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}