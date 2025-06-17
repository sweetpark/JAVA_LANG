package lab.java_project.중급1.래퍼클래스와클래스;

import java.util.Arrays;
import java.util.Map;

public class 시스템클래스 {
    public static void main(String[] args) {
        //ms 시간
        long l = System.currentTimeMillis();
        System.out.println(l);
        //nano 시간
        long l1 = System.nanoTime();
        System.out.println(l1);

        //환경변수
        Map<String, String> getenv = System.getenv();
        for (String s : getenv.keySet()) {
            System.out.println(s + ":" + getenv.get(s));
        }

        // 배열 복사 & 배열 출력
        int[] arr = new int[] {1,2,3};
        int[] arrCopy = Arrays.copyOf(arr, 2);
        char[] helloArr = new char[] {'h','e','l','l','o'};
        char[] copyHelloArr = new char[5];
        System.arraycopy(helloArr, 0, helloArr, 0, helloArr.length);
        System.out.println(Arrays.toString(copyHelloArr));
        System.out.println(Arrays.toString(arrCopy));






    }
}
