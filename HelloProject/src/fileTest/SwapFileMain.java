package fileTest;
import java.util.*;
import java.io.*;

public class SwapFileMain {
    public static void main(String[] args) throws IOException
    {
        BufferedReader braa = new BufferedReader(new FileReader("C:/Users/KGITBANK/Downloads/aa.txt"));
        BufferedReader brbb = new BufferedReader(new FileReader("C:/Users/KGITBANK/Downloads/bb.txt"));
        BufferedReader brcc = new BufferedReader(new FileReader("C:/Users/KGITBANK/Downloads/cc.txt"));

        String saa = null;
        String sbb = null;
        String scc = null;

        PrintWriter pwc = new PrintWriter(new BufferedWriter(new FileWriter("C:/Users/KGITBANK/Downloads/cc.txt")));
        //
        while( (saa=braa.readLine()) != null )
        {

            pwc.println(saa);
        }
        braa.close();
        pwc.close();

        PrintWriter pwa = new PrintWriter(new BufferedWriter(new FileWriter("C:/Users/KGITBANK/Downloads/aa.txt")));

        while((sbb=brbb.readLine())!=null)
        {
            pwa.write(sbb);

        }
        brbb.close();
        pwa.close();

        PrintWriter pwb = new PrintWriter(new BufferedWriter(new FileWriter("C:/Users/KGITBANK/Downloads/bb.txt")));

        while((scc=brcc.readLine())!=null)
        {
            pwb.write(scc);

        }
        brcc.close();
        pwb.close();

    }
}
