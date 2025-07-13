package lab.java_project.중급1.날짜시간;

import java.time.LocalDate;

/**
 * LocalDate 는 불변 객체
 *
 * 주요 메서드
 * 1. of() : 날짜 지정
 * 2. now() : 현재 날짜 기준 생성
 * 3. plus***() : 날짜 더하기
 */
public class LOCALDATE {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2025,1,1);
        System.out.println(localDate);
        System.out.println(localDate.getDayOfMonth());
        System.out.println(localDate.getDayOfWeek());
        System.out.println(localDate.getDayOfYear());
        System.out.println(localDate.getMonthValue());
        System.out.println(localDate.getYear());
        // 2025/1/1 -> 2025/1/11
        System.out.println(localDate.plusDays(10));
        // 2025/1/1 -> 2025/4/1
        System.out.println(localDate.plusMonths(3));
        // 2025/1/1 -> 2025/1/15
        System.out.println(localDate.plusWeeks(2));
        // 2025/1/1 -> 2027/1/1
        System.out.println(localDate.plusYears(2));

        LocalDate localDate2 = LocalDate.of(2025,1,1);
        // 2025/1/1 -> 2025/1/11
        LocalDate newLocalDate = localDate2.plusDays(10);
        // 2025/1/11 -> 2027/1/11
        LocalDate uptLocalDate = newLocalDate.plusYears(2);
        // 2025/ 1/ 11
        System.out.println(uptLocalDate);
    }
}
