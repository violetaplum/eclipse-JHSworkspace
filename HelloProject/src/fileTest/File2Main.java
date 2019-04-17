package fileTest;
import java.io.*;

public class File2Main {
    public static void main(String[] args) throws FileNotFoundException,IOException
    {
        FileInputStream f1 = new FileInputStream("C:/Users/KGITBANK/Downloads/aa.txt");
        FileReader frfr = new FileReader("C:/Users/KGITBANK/Downloads/aa.txt");
        //FileOutputStream : File에 무언가 적기위한 것 --> 한 바이트 씩 처리하는 것
        //FileInputStream : File에서 읽어오기위한 것
        //FileWrite : File에 무언가 적기 위한 것
        BufferedReader br = new BufferedReader(frfr);
        int cnt;
        while((cnt=f1.available())>0)
        {
            byte[] b1 = new byte[cnt];
            int bada = f1.read(b1);
            if(bada==-1)    //File의 끝에 -1로 표시 돼있기 때문에 확인
            {
                break;
            }

            String str1 = new String(b1);
            System.out.println(str1);
            System.out.println("Hello Hello!!\n");
        }
        //딱딱 끊어서 읽기때문에 readInteger, readDouble등으로 할때 오류의 위험이 없다
        //이런 경우가 아니라면 굳이 이런 방식을 취할 이유는 없다
        //byte단위로 Int를 넣을때 4byte씩 정확히 들어가게 된다.
        //읽고싶은 byte크기를 정할 수 있기 때문에 좋다.


        String s = "";
        while((s=br.readLine())!=null)
        {
            System.out.println(s);
            System.out.println("It's new !!! ");
        }
    }
}
