package hangMan;
import java.util.*;

public class HangMan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//hangMan ���� �����
		//�ܾ�� �Ѵܾ���
		//�� : printer
		//
		//String �迭 : printer
		//mitjool�迭 : _______
		
		//�ѱ��ڸ� �Է¹޾�  printer���� �� �ϳ���?
		//������ �׳� _ ���
		//������ �ѱ��ڸ� ���ڸ��� ��� ���
		//Scanner, equals()
		Scanner sc = new Scanner(System.in);
		String insert;
		String[] arr = {"happy","day"};
		String[] str;
		int count = 0;
		
		int internal;
		int index = (int)Math.random()*(arr.length)+1; //�������� �ϳ� ���� ����
		str = new String[arr[index].length()];
		
		for(int i=0;i<(arr[index]).length();i++)
		{
			System.out.print("_ ");//�ϴ� �ڸ�����ŭ ���
			str[i]="_ ";//���ÿ� '_'�� str[]�� �ʱ�ȭ
		}
		
		for(int j=0;j<6;j++)//���� �� 6�� ��ȸ
		{
			if(count==str.length)
			{
				System.out.println("Good Job!!");
				break;
			}
			/*System.out.println("\nyou're in "+(j+1)+"th turn! ");*/
			System.out.print("insert the Charactor! >> ");
			insert = sc.next(); //�������� �Է�
			
			if(arr[index].contains(insert))//��������
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
		
		//String.contains() -> true,false ��ȯ
		//String.indexOf() -> String �� ��ġ ���� ��ġ
		//Sring.matches() -> true, false ��ȯ
		
	/*	
		 String [] moonja=
			   {"p","r","i","n","t","e","r"};
	       String [] jool={"_","_","_","_","_","_","_"};
		   String ip;
	         
		   int cnt,sw=0;
	       for(int j=0; j<7;j++) //ó�� �� ���
	           System.out.print(jool[j]);
	       System.out.println();
	     
	       Scanner scan1=new Scanner(System.in);
	       for(int i=1;i<=13;i++){
	    	 cnt=0;  
	   	     System.out.println("��������Է�:"); 
	         ip=scan1.next(); //////// 	 
	      
	         for(int j=0; j<7;j++){
	        	   if(ip.equals(moonja[j]))//////////
	        		       jool[j]=moonja[j];
	         } 	   
	         for(int j=0; j<7;j++)
	              System.out.print(jool[j]);//�����	
	         System.out.println("\t"+i+"���õ�");
	        
	         for(int j=0; j<7;j++){
	        	   if(jool[j].equals(moonja[j]))
	        		        cnt++;
	         }	   
	         if(cnt == 7){
	              System.out.println("�����߾��");
	              sw=1;/////////////////
	        	  break;	   
	         }
	      }
	         if(sw==0)
	              System.out.print("������ȸ��");
	         	
	         */
		
		
		
		
		
		sc.close();

	}

}
