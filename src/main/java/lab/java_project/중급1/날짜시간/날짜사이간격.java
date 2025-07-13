package lab.java_project.중급1.날짜시간;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class 날짜사이간격 {
    /***
     *
     * Duration : 날짜 사이 간격 ( 연, 월, 일 )
     * Period : 시간 사이 간격 ( 시, 분, 초 )
     *
     */
    public static void main(String[] args) {

        //Date 표기 포멧
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");


        System.out.println("###################### [ Period ] #########################");
        // Period 생성
        Period period = Period.ofDays(10);
        LocalDateTime now = LocalDateTime.now();

        /* 가) Period 와 내부함수 사용 */

        // 1. period 사용
        LocalDateTime plus = now.plus(period);
        // 2. LocalDateTime 내부 함수
        LocalDateTime plus2 = now.plusDays(10);

        System.out.println("Period : " + plus.format(formatter));
        System.out.println("Inner Function : " + plus2.format(formatter));



        /* Period 기간 차이 */

        Period between = Period.between(now.toLocalDate(), plus2.toLocalDate());
        System.out.println( "연 : " + between.getYears()
                + ", 월 : " + between.getMonths()
                + ", 일 : " + between.getDays());

        System.out.println("######################################################################");
        System.out.println();



        System.out.println("###################### [ Duration ] #########################");


        /* Duration 시간 차이 */

        // 1. 시간 생성
        LocalDateTime now2 = LocalDateTime.now();
        LocalDateTime plus3hour = LocalDateTime.now().plusHours(3);

        LocalTime localTime = now2.toLocalTime();
        LocalTime plus3hourTime = plus3hour.toLocalTime();

        Duration duration = Duration.between(localTime, plus3hourTime);
        System.out.println("Duration Seconds: " + duration.getSeconds());
        System.out.println("Duration Minute : " + duration.toMinutes());
        System.out.println("Duration Hour : " + duration.toHours());
        System.out.println("Duration Day : " + duration.toDays());


        System.out.println("######################################################################");
        System.out.println();


    }
}
