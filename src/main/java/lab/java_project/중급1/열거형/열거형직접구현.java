package lab.java_project.중급1.열거형;

/**
 * 열거형패턴의 장점
 * - 타입 안정성 ( String 으로 파라미터를 받지 않기에 안전하다 , 해당 클래스만 전달 가능)
 * - 데이터 일관성 향상
 */
public class 열거형직접구현 {

    public static void main(String[] args) {
        // 1. 타입 안정성
        // getGrade( GRADE 클래스만 전달 )
        // 2. 데이터 일관성
        // getGrade에서 준 String 문자열만 받으므로, 데이터의 일관성이 생김 (소문자, 오타 불가)
        System.out.println(getGrade(GRADE.DIAMOND));
    }

    private static String getGrade(GRADE grade){
        if(GRADE.DIAMOND.equals(grade)){
            return "DIAMOND";
        }else if(GRADE.GOLD.equals(grade)){
            return "GOLD";
        }else if(GRADE.SILVER.equals(grade)){
            return "SILVER";
        }else{
            return "ERROR";
        }
    }
    private static class GRADE{

        private static final GRADE DIAMOND = new GRADE();
        private static final GRADE GOLD = new GRADE();
        private static final GRADE SILVER = new GRADE();

        private GRADE(){};

    }
}
