package calendarTest;
import java.util.Calendar;
import java.util.Date;

public class CountMain {
    public static void main(String[] args)
    {
        Calendar cal = Calendar.getInstance();
        //오늘로부터 만난지 100일되는날
        cal.add(Calendar.DAY_OF_MONTH,99); //100일후 날짜 구해진다.

        int year = cal.get(Calendar.YEAR); //Calendar.YEAR에서는 제대로 된 년도가 나온다.
        int month = cal.get(Calendar.MONTH)+1;
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int hour = cal.get(Calendar.HOUR_OF_DAY);//24시간 기준으로 출력됨
        int min = cal.get(Calendar.MINUTE);
        int sec = cal.get(Calendar.SECOND);
        System.out.println("CURRENT TIME ");
        System.out.println(year+" year "+month+" month "+day+" day ");
        System.out.println(hour+" time "+min+" minute "+sec+" second ");



        Date d = new Date();
        d.setDate(d.getDate()+100-1);
        System.out.println(d.toLocaleString());


    }
}
