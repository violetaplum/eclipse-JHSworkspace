package dateTest;
import java.util.*;

public class DateMain {
    public static void main(String[] args)
    {
        Date d1 = new Date(); //java.sql, java.util 둘중 하나 선택 가능.
        //Date는 내장 클래스
        //heap 메모리에 만들어짐 -> 오늘날짜, 지금시간이 들어가 있음
        //내장클래스, 사용자정의클래스 (User definde Class)
        String s1 = d1.toLocaleString(); //중간에 그어진 줄은 오래된 문법임을 알리는것.
                        //그 지역의 형식을 따르라는 의미
        System.out.println("Time and Weather : "+s1);
        System.out.println("Time and Weather : "+d1.toString());
        System.out.println(d1.getYear());//getYear() : 1900년도부터의 년도만 뽑아내는것.
        System.out.println(d1.getDay());//getDay() : 오늘의 요일을 나타냄
        System.out.println(d1.getMonth());//getMonth() : 이번달 이전의 달이 나온다
        String[] strBae = {"Sunday","Monday","Tuesday","Wednesday","Thirsday","Friday","Saturday","Sunday"};

        String str1 = "Today : ";
        str1 += (d1.getYear()+1900)+" years "; //윈도우
        str1 += (d1.getMonth()+1)+" Month "; //1-12 :0-11 --> 첫달이 0달로 시작된다;;
        str1 += d1.getDate()+" Date "; //이게 날짜
        //str1 += d.getDay()+"요일"; 주의!! 몇번째 요일인지 숫자가 반환됨..심지어 시작되는 요일은 일요일!!
        str1 += strBae[d1.getDay()]+"~~~";//strBae[2]
        System.out.println(str1);


    }
}
