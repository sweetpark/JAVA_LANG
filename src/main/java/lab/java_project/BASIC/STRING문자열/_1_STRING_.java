package lab.java_project.BASIC.STRING문자열;

import java.util.Arrays;

public class _1_STRING_ {

    public static void main(String[] args) {


        /* 문자열 자르기 */
        String fileName = "hello.txt";
        String ext = ".txt";

        // [방법1] 확장자 위치 찾기 (시작위치)
        int i = fileName.indexOf(ext);
        // 확장자 직전까지 파일이름 추출 (시작 ~ 확장자 인덱스 위치)
        String extFileName = fileName.substring(0, i);
        System.out.println("subString() : " + extFileName);

        // [방법2] "." 마지막으로 dot(.) 이 나오는 직전까지 문자열 자르기
        String extFileName2 = fileName.substring(0, fileName.lastIndexOf("."));
        System.out.println("lastIndexOf() : " + extFileName2);

        // [방법3] split()으로 나눠서 배열로 만들고 해당 인덱스 출력
        String[] parseFileName = fileName.split(".");
        System.out.println(Arrays.toString(parseFileName));


        /* 문자열 비교 */
        //문자열 비교
        String str1 = "test";
        String str2 = new String("test");


        // 대문자 무시
        System.out.println("eqaulsIgnoreCase() : " + str1.equalsIgnoreCase(str2));
        System.out.println("eqauls() : " + str1.equals(str2));
        System.out.println("== (기본비교) : " + str1 == str2);

        if("test".compareTo(str1) > 0){
            System.out.println("A compareTo B : A가 더 큼");
        }else if("test".compareTo(str1) == 0){
            System.out.println("A compareTo B : 동등함");
        }else if("test".compareTo(str2) < 0){
            System.out.println("A compareTo B : B가 더 큼" );
        }


        String http = "www.google.com";
        String prefix = "www";
        String subFix = "com";
        System.out.println("startWith : " + http.startsWith(prefix));
        System.out.println("endWith : " + http.endsWith(subFix));


        //문자열 검색
        String search = "aaaabbbbcccc";
        String compareStr = "aaaa";
        String regex = "[0-9]+";


        System.out.println(" compareTo() : " + search.compareTo(compareStr));
        System.out.println(" startWith() : " + search.startsWith(compareStr));
        System.out.println(" contains() : " + search.contains(compareStr));
        System.out.println(" indexOf() : " + search.indexOf(compareStr));
        System.out.println(" regex() : " + search.matches(regex)); // 정규표현식 매치



        /* 문자열 변환 */
        String target = "Hello Python! Nice to Meet you (Python)";
        String changeStr = "JAVA";

        System.out.println(target + " replace() -> " + target.replace("Python", changeStr));
        // -> Hello Python! Nice to Meet you (Python) replace() -> Hello JAVA! Nice to Meet you (JAVA)

        //주의!!) replaceAll(정규표현식, 대체할 문자열)은 정규표현식을 이용하므로 주의해서 사용해야함
        System.out.println(target + " replaceAll()-> " + target.replaceAll("[a-zA-Z]+", changeStr));
        // -> Hello Python! Nice to Meet you (Python) replaceAll()-> JAVA JAVA! JAVA JAVA JAVA JAVA (JAVA)

        String trimStr = "   Hello ~ ";
        System.out.println("Trim() : " + trimStr.trim());


        String StrArr = "ABCDEFG";
        Integer age = 10;
        String name = "park";
        System.out.println("toCharArray() : " + Arrays.toString(StrArr.toCharArray()));
        System.out.println("valueOf() : " + String.valueOf(StrArr.toCharArray()));
        System.out.println("format() : " + String.format("Hello My name is %s , And My age : %d", name, age));



        //String Builder(동기화의 안전 x) 와 String Buffer (동기화에 안전)
        //주의) 가변인자로서 불변객체가 아니다
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = sb1;
        sb1.append("A").append("B").append("C");
        System.out.println("sb1 : " + sb1);
        System.out.println("sb2 : " + sb2);

        sb2.append("D");
        System.out.println("sb1 : " + sb1); // 가변인자이기에 sb2변경이 sb1에도 영향을 미침 (사이드이펙트 - 주의!!)
        System.out.println("sb2 : " + sb2);


        /* 중요)  String 자바 문자열처리 방법 */
        // 더하기시 -> 객체를 새롭게 생성하여 객체를 생성한다 (Sting 클래스가 불변이어서)

    }
}
