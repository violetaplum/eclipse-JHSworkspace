package fileTest;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
//java.io.*;도 가능

import java.util.*;
public class FileMain {
    public static void main(String[] args) throws FileNotFoundException
    {

        try {
            //전송단위:1byte --> byte
            //         1byte --> 문자
            //open
            FileReader fr = new FileReader("C:/Users/KGITBANK/Downloads/aa.txt"); //한 byte씩이 아닌 문자로 처리한다.
            //또한 c:/aa.txt를 fr이 가리키게끔 한다.
            //이때 다른 사용자는 접근 할 수 없다
            //File은 예외처리를 달고다닌다.

            //c:/aa.txt
            //만약 저 경로 대신 aa.txt라고만 친다면 project위치로 가게된다.따라서 그 위치에 aa.txt 위치에 신경써야한다.

            //위치명: ./src/....
            //한 byte 씩 처리할때는 inputStream, outputStream 이 붙는다.(FileOutputStream(File file,boolean append)
            //File file = new File(dir,"파일명");
            //boolean append = true; --> append 가 true : file 이 존재할때 덧붙여 씀
            //FileOutputStream outputStream = new FileOutputStream(file, append);


            BufferedReader br = new BufferedReader(fr);
            //new BufferReader(FileReader class);
            //Buffer 크기만큼 한꺼번에 꺼내서 보내주기때문에 속도가 빠르다.
            //BufferReader객체 만들어서 br이 가리키게끔한다.
            //한줄한줄 읽어준다.

            String s = null; //문자열은 잡을때마다 null값을 주고 들어가는 것이 좋다
            //null point error가 날 수 있기 때문
            while((s=br.readLine())!=null)
                        //BufferedReader.readLine() --> 한줄씩 읽어준다.
                        //한줄의 끝은 항상 null이 들어가 있음.
                                            //br이 fr에서 읽어들인 문자를 s에 넣고 확인한다.
                                            //하지만 만약 Stream을 이용하여 byte단위로 읽는다면 br사용 불가해짐
                                            //만약 byte 단위로 본다면 null 이 아니라 -1
            {
                System.out.println(s);  //단순 화면출력
                                        //한줄에서 문자 하나씩 s 에 들어가서 출력
            }
            br.close();//생략해도 알아서 닫아주긴 한다.

        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }

    }
}
