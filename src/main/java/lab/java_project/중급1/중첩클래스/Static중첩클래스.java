package lab.java_project.중급1.중첩클래스;

import javax.crypto.CipherInputStream;

public class Static중첩클래스 {
    /***
     * 중첨 클래스
     *  1. 정적 중첨클래스 (static)
     *   - 독립적으로 생성 가능
     *   - 외부 클래스 멤버변수 사용 불가
     *  2. 내부 중첩 클래스 ( 익명, 내부, 지역 클래스)
     *   - 외부 클래스 멤버변수 사용 가능 (사실상 final -> 값 변경 불가)
     *   - 인터페이스 / 추상 클래스를 활용하여 클래스 활용 가능
     *   - 외부 클래스를 만들어야 사용 가능 (종속적)
     */

    public static void main(String[] args) throws InterruptedException {


        Parent.NoChild noChild = new Parent.NoChild("NoChild");
        noChild.print();

        /* 접근 불가능 */
//        Parent.Child child = new Parent.Child("Child");
//        child.print();

        //부모로 접근
        Parent parent = new Parent("Child");
        parent.getChildPrint();



        System.out.println("################################################");

        Outer outer = new Outer("Outer");
        Printer local = outer.process("local");

        System.out.println(" Outer == InnerLocal(Outer) : " + (outer.getOuter() == local.getOuter()));
        local.print();

        Printer printer = new Printer(){

            @Override
            public void print() {
                System.out.println("익명 클래스");
            }

            @Override
            public String getOuter() {
                return "";
            }
        };

        printer.print();

    }

}