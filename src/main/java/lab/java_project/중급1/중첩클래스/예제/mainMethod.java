package lab.java_project.중급1.중첩클래스.예제;

import com.fasterxml.jackson.core.JsonPointer;
import lab.java_project.중급1.중첩클래스.Printer;

public class mainMethod {
    public static void main(String[] args) {

        Library library = new Library();

        library.add("ChildBook#1", "park");
        library.add("ChildBook#2", "kim");
        library.add("ChildBook#3", "tao");
        library.add("ChildBook#4", "nang");
        library.add("ChildBook#5", "king");

        library.showBooks();


        PrinterAbstract printerAbstract = new PrinterAbstract() {
            @Override
            void showBooks() {
                System.out.println();
                System.out.println("###############################");
                System.out.println("익명클래스");
                System.out.println("###############################");
            }
        };


        printerAbstract.showBooks();


        // 익명클래스 사용 (Thread)
        /*
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("thread - run()");
            }
        };
        */

        // 익명 클래스 -> 람다식으로 변환
        // [람다식 규칙]
        // 1. 반드시 "함수형 인터페이스"여야 함 (추상 메서드가 하나만 존재하는 인터페이스)
        // 2. 추상 메서드가 하나만 있어야 람다식 사용 가능
        Runnable runnable = () -> System.out.println("thread - run()");


        Thread thread = new Thread(runnable);
        thread.start();
    }
}
