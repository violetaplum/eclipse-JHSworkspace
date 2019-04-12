package calendarTest;
import java.text.SimpleDateFormat;
import java.util.*;

public class BirthdayMain {
    public static void main(String[] args)
    {
        Calendar cal = Calendar.getInstance();
        Date birthday = new Date(1993-1900,9-1,27);
        Date today = new Date();
        long ago = today.getTime()-birthday.getTime(); //밀리세컨드 기준으로 나온다.
                                                        //밀리세컨드를 초/시간으로 바꿔야 한다.
        long days = ago/1000/3600/24;
                    //밀리세컨->초->시간->하루
        System.out.println(days);

        Date d = new Date();
        SimpleDateFormat sdf1 = new
                SimpleDateFormat("yyyy/MM/dd/E/HH:mm:ss a");
                            //Java만의 Format을 정해준 것임.
                    //HH : 24h 기준
                    //a는 오전,오후를 맞춰줌
        System.out.println(sdf1.format(d));
    }
}
