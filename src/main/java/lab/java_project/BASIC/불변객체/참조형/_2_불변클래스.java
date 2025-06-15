package lab.java_project.BASIC.불변객체.참조형;

public class _2_불변클래스 {
    /* 값변경을 통한 공유객체로서 위험성이 있으므로,
    *  1. 값변경을 막거나
    *   - Set() 메서드 삭제
    *   - 멤버변수 final 키워드 사용
    *
    *  2. 값변경시 새로운 클래스를 제공
    *   - 값 수정시 return값으로 new 생성자 사용 (새로운 객체 반환)
    *
    *
    * */
    public static void main(String[] args) {

        CustomDate customDate = new CustomDate(2025, 6, 15);
        System.out.println(customDate.toString());

        CustomDate customDate2 = customDate.addDate(1, 2, 10);
        System.out.println(customDate2.toString());

        System.out.println("CustomDate1 : " + System.identityHashCode(customDate)
                + ",\nCustomDate2 : " + System.identityHashCode(customDate2));
    }


    public static class CustomDate{
        private final Integer year;
        private final Integer month;
        private final Integer day;

        public CustomDate(Integer year, Integer month, Integer day) {
            this.year = year;
            this.month = month;
            this.day = day;
        }

        public CustomDate addDate(Integer year, Integer month, Integer day) {
            Integer newYear = this.year + year;
            Integer newMonth = this.month + month;
            Integer newDay = this.day + day;

            return new CustomDate(newYear, newMonth, newDay);
        }

        @Override
        public String toString() {
            return year + "-" + month + "-" + day;
        }
    }
}
