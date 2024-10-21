import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class Program2 {
    public static void main(String[] args) {
        try{
            String url = "https://www.w3schools.com/js/json_demo.txt";
            InputStream is = new URL(url).openStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
//            System.out.printf("%c", is.read());
//            System.out.printf("%c", is.read());
//            System.out.printf("%c", is.read());
//            System.out.printf("%c", is.read());
//            System.out.printf("%c", is.read());
//            System.out.printf("%c", is.read());
//            System.out.printf("%c", is.read());
//            System.out.printf("%c", is.read());
//            System.out.printf("%c", is.read());
            //BufferedReader br = new BufferedReader(new InputStreamReader(new URL("https://www.w3schools.com/js/json_demo.txt");
              String s;
              while ((s=br.readLine())!=null){
                  System.out.println(s);
              }
        }
        catch (IOException ex){

        }
    }
}
