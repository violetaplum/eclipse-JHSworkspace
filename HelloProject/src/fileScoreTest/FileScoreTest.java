package fileScoreTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class FileScoreTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		FileReader fr = new FileReader("E:/jum.txt");
		BufferedReader br = new BufferedReader(fr);
		String s=null;
		String str="";
		while((s=br.readLine())!=null)
		{
			str+=s+"\n";		
		}
		System.out.println(str);
		String[] strarr = str.split("\n");
		int total=0;
		for(int i=0;i<strarr.length;i++)
		{
			total+=Integer.valueOf(strarr[i].split(":")[1]);
		}
		double ave = total/3;
		System.out.println("총점 :"+total+"\t"+"평균: "+ave);

		FileWriter fw = new FileWriter("E:/jum.txt",true);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(fw,true);
		
		pw.println("총점 :"+total+"\t"+"평균: "+ave);//println을 함으로써 한줄한줄 출력할 수 있게 된다.
		
		
		
		
		
	}

}
