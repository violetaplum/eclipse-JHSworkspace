package hangMan;
import java.util.*;

public class HangMan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//hangMan 게임 만들기
		//단어는 한단어임
		//답 : printer
		//
		//String 배열 : printer
		//mitjool배열 : _______
		
		//한글자만 입력받아  printer글자 중 하나냐?
		//없으면 그냥 _ 출력
		//있으면 한글자를 그자리에 대신 출력
		//Scanner, equals()
		Scanner sc = new Scanner(System.in);
		String insert;
		String[] arr = {"happy","day"};
		String[] str;
		int count = 0;
		
		int internal;
		int index = (int)Math.random()*(arr.length)+1; //랜덤으로 하나 고르는 숫자
		str = new String[arr[index].length()];
		
		for(int i=0;i<(arr[index]).length();i++)
		{
			System.out.print("_ ");//일단 자리수만큼 출력
			str[i]="_ ";//동시에 '_'로 str[]을 초기화
		}
		
		for(int j=0;j<6;j++)//게임 총 6번 기회
		{
			if(count==str.length)
			{
				System.out.println("Good Job!!");
				break;
			}
			/*System.out.println("\nyou're in "+(j+1)+"th turn! ");*/
			System.out.print("insert the Charactor! >> ");
			insert = sc.next(); //추측문자 입력
			
			if(arr[index].contains(insert))//맞췄을때
			{	
				internal = arr[index].indexOf(insert);
				str[internal] = insert;
				for(int k=0;k<str.length;k++) 
				{
					System.out.print(str[k]+" ");
				}
				count++;
			}
			else
			{
				System.out.println("Try again..");
				continue;
			}
		
			
		}
		
		//String.contains() -> true,false 반환
		//String.indexOf() -> String 내 일치 문자 위치
		//Sring.matches() -> true, false 반환
		
	/*	
		 String [] moonja=
			   {"p","r","i","n","t","e","r"};
	       String [] jool={"_","_","_","_","_","_","_"};
		   String ip;
	         
		   int cnt,sw=0;
	       for(int j=0; j<7;j++) //처음 줄 출력
	           System.out.print(jool[j]);
	       System.out.println();
	     
	       Scanner scan1=new Scanner(System.in);
	       for(int i=1;i<=13;i++){
	    	 cnt=0;  
	   	     System.out.println("예상글자입력:"); 
	         ip=scan1.next(); //////// 	 
	      
	         for(int j=0; j<7;j++){
	        	   if(ip.equals(moonja[j]))//////////
	        		       jool[j]=moonja[j];
	         } 	   
	         for(int j=0; j<7;j++)
	              System.out.print(jool[j]);//줄출력	
	         System.out.println("\t"+i+"번시도");
	        
	         for(int j=0; j<7;j++){
	        	   if(jool[j].equals(moonja[j]))
	        		        cnt++;
	         }	   
	         if(cnt == 7){
	              System.out.println("참잘했어요");
	              sw=1;/////////////////
	        	  break;	   
	         }
	      }
	         if(sw==0)
	              System.out.print("다음기회에");
	         	
	         */
		
		
		
		
		
		sc.close();

	}

}
