package calendarTest;

import java.util.Calendar;

public class CalendarMain {
    public static void main(String[] args)
    {
        Calendar cal1 = Calendar.getInstance();
                        //singleton pattern , 동일 인스턴스, 전역
        //Calendar calendar = new Calendar(); 와는 다르게 새로 객체를 선언하지 않는다.

        int year = cal1.get(Calendar.YEAR); //Calendar.YEAR에서는 제대로 된 년도가 나온다.
        int month = cal1.get(Calendar.MONTH)+1;
        int day = cal1.get(Calendar.DAY_OF_MONTH);
        int hour = cal1.get(Calendar.HOUR_OF_DAY);//24시간 기준으로 출력됨
        int min = cal1.get(Calendar.MINUTE);
        int sec = cal1.get(Calendar.SECOND);

        System.out.println("CURRENT TIME ");
        System.out.println(year+" year "+month+" month "+day+" day ");
        System.out.println(hour+" time "+min+" minute "+sec+" second ");
    }
}
