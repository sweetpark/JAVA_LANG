package lab.java_project.중급1.날짜시간;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class 날짜단위조작 {

    /***
     * ChronoUnit
     */

    public static void main(String[] args) {

        LocalDateTime time1 = LocalDateTime.of(2025, 10,20,13,30,0);
        LocalDateTime time2 = LocalDateTime.of(2025,10,30,20,30,0);

        // ChronoUnit 특정 시각의 단위 ( 해당 단위를 지정하여 두개의 시간 차이를 구할 수 있음 )
        long betweenBySec = ChronoUnit.SECONDS.between(time1, time2);
        System.out.println("Seconds : "+ betweenBySec);

        long betweenByMin = ChronoUnit.MINUTES.between(time1, time2);
        System.out.println("Minutes : "+ betweenByMin);

        long betweenByHour = ChronoUnit.HOURS.between(time1, time2);
        System.out.println("Hours : "+ betweenByHour);


        //ChronoField 특정 시각의 출력
        System.out.println(" time1 Month :  " + time1.get(ChronoField.MONTH_OF_YEAR));
    }
}
