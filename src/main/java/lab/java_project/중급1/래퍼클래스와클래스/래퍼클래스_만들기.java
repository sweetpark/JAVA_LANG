package lab.java_project.중급1.래퍼클래스와클래스;

public class 래퍼클래스_만들기 {
    /**
     * 기본형 특징
     * - null 값을 가질 수 없다
     * - 객체가 아니기에, 외부 메서드를 이용하여 다루어야한다.
     * (컬렉션, 제너릭 등을 사용할 수 없다 - 전제 조건: 객체 )
     *
     * Tip)
     * - JAVA의 메모리 연산을 수천번 줄이는것보다, 외부 네트워크 통신 한번을 줄이는게 더낫다 (데이터베이스 연결, 프론트엔드 통신 등)
     * - 권장하는 방법은 개발 이후에 성능 테스트를 해보고 정말 문제가 되는 부분을 찾아서 최적화 하는 것이다.
     */

    public static void main(String[] args) {
        MyInteger myInteger = new MyInteger(3);
        System.out.println(myInteger.compareTo(4));

        //ver2
        /* Boxing */
        Integer num = Integer.valueOf(3);

        /* UnBoxing */
        int num2 = num.intValue();


        //ver3
        /* 주요함수 */
        //1. 변환
        Integer number = Integer.valueOf(4);
        int number_basic = number.intValue();

        //2. 문자열 <-> 숫자
        Integer changeNum = Integer.parseInt("3");
        String changeNum2 = String.valueOf(changeNum);

        //3. 비교
        //(같으면 : 0, number > number_basic : 1, number < number_basic : -1)
        Integer compare = number.compareTo(number_basic);

        //4. 산술연산
        int sum = Integer.sum(10,20);
        int min = Integer.min(10,20);
        int max = Integer.max(10,20);


        //기본형 VS 래퍼클래스
        Long COUNT = 1_000_000_000L;

        long basicLong = 0;
        Long wrapperLong = 0L;

        long startTime = System.currentTimeMillis();
        for (long i = 0; i < COUNT; i++){
            basicLong += 1;
        }
        long endTime = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder();
        sb.append("long 기본형 걸린 시간 : ").append(endTime - startTime);
        System.out.println(sb.toString());

        startTime = System.currentTimeMillis();
        for(Long i = 0L; i< COUNT; i++){
            wrapperLong += 1;
        }
        endTime = System.currentTimeMillis();

        StringBuilder sb2 = new StringBuilder();
        sb2.append("Long 래퍼클래스 걸린 시간 : ").append(endTime - startTime);
        System.out.println(sb2.toString());

    }

    public static class MyInteger{
        //불변 객체
        private final int value;

        public MyInteger(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public int compareTo(int target){
            if(value > target){
                return 1;
            }else if(value < target){
                return -1;
            }else{
                return 0;
            }
        }
    }
}
