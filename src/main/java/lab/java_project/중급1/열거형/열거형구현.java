package lab.java_project.중급1.열거형;

import java.util.Arrays;

public class 열거형구현 {
    public static void main(String[] args) {
        System.out.println(getGrade(GRADE.DIAMOND));

        //enum 정의된 부분 반환
        System.out.println(Arrays.toString(GRADE.values()));
        //해당 enum 반환
        System.out.println(GRADE.valueOf("DIAMOND"));
        //enum 순서 반환 메서드
        System.out.println(GRADE.SILVER.ordinal());
        //toString() 오버라이딩
        System.out.println(GRADE.DIAMOND);

    }

    private static String getGrade(GRADE grade){

        if(GRADE.DIAMOND.equals(grade)){
            return grade.name;
        }else if(GRADE.GOLD.equals(grade)){
            return grade.name;
        }else if(GRADE.SILVER.equals(grade)){
            return grade.name;
        }

        return "";

    }

    public static enum GRADE{
        DIAMOND("DIAMOND"), GOLD("GOLD"), SILVER("SILVER"), PLATINUM;

        private String name;
        GRADE(String name) {
            this.name = name;
        }
        GRADE(){
        }

        @Override
        public String toString() {
            return "열거형 상수의 타입 :" + super.toString() + ", 값 :" + this.name;
        }
    }
}
