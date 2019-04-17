package fileTest;
import java.util.*;
import java.io.*;

public class SwapFileMain {
    public static void main(String[] args) throws IOException
    {
        BufferedReader braa = new BufferedReader(new FileReader("C:/Users/KGITBANK/Downloads/aa.txt"));
        BufferedReader brbb = new BufferedReader(new FileReader("C:/Users/KGITBANK/Downloads/bb.txt"));
        BufferedReader brcc = new BufferedReader(new FileReader("C:/Users/KGITBANK/Downloads/cc.txt"));

        BufferedWriter bwaa = new BufferedWriter(new FileWriter("C:/Users/KGITBANK/Downloads/aa.txt"));
        BufferedWriter bwbb = new BufferedWriter(new FileWriter("C:/Users/KGITBANK/Downloads/bb.txt"));
        BufferedWriter bwcc = new BufferedWriter(new FileWriter("C:/Users/KGITBANK/Downloads/cc.txt"));



        String saa = null;
        String sbb = null;
        String scc = null;

        while((saa=braa.readLine())!=null)
        {
           bwcc.write(saa);

        }
        braa.close();
        bwcc.close();
        while((sbb=brbb.readLine())!=null)
        {
            bwaa.write(sbb);

        }
        brbb.close();
        bwaa.close();
        while((scc=brcc.readLine())!=null)
        {
            bwbb.write(scc);

        }
        brcc.close();
        bwbb.close();

    }
}
