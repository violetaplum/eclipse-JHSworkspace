package fileTest;
import java.io.*;

public class File3Main {
    public static void main(String[] args) throws FileNotFoundException,IOException
    {
        FileReader fr = new FileReader("C:/Users/KGITBANK/Downloads/aa.txt");
        FileInputStream fis = new FileInputStream("C:/Users/KGITBANK/Downloads/aa.txt");

        BufferedReader br = new BufferedReader(new FileReader("C:/Users/KGITBANK/Downloads/aa.txt"));//System.in :키보드로 치는것을 읽는다.
        //BufferedReader br = new BufferedReader(new InputStreamReader("C:/Users/KGITBANK/Downloads/aa.txt"));//System.in :키보드로 치는것을 읽는다.

        //InputStreamReader is1 = new InputStreamReader(System.in);
        //BufferedReader br = new BufferedReader(is1);  의 줄인 방식
        FileWriter fw = new FileWriter("C:/Users/KGITBANK/Downloads/bb.txt",true);  //true : append
                                                                                                    //false : 덮어쓰기
        //File에 적기위해 연다.
        //키보드로 입력받아 적어본다
        BufferedWriter bw = new BufferedWriter(fw);
        //BufferedReader 의 적는 버전
        PrintWriter pw = new PrintWriter(fw,true);
        //PrintWriter : 출력을 유연하게 하기 위함
        //때문에 출력용으로만 사용

        String s = null;
        while((s=br.readLine())!=null)
        {
            //System.out.println("나 복사중!!");
            pw.println(s);
            //PrintWriter.println(String class);
            //한줄만 치다가 ctrl+Z 를 하면 입력종료됨
        }

        br.close();
        pw.close();
        fw.close();


    }
}
