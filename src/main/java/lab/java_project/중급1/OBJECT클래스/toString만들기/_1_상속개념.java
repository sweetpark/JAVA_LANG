package lab.java_project.중급1.OBJECT클래스.toString만들기;

/**
 *[상속]
 * 1. parent는 Child 객체를 가리키고 있고, 힙에는 Child의 전체 구조가 올라간다.
 * 2. 메서드도 포함해서 Child가 가진 모든 것들이 메모리에 존재한다.
 * 3. 다만 참조 타입이 Parent이므로 컴파일러는 Parent까지만 인식할 수 있다.
 */
public class _1_상속개념 {
    public static void main(String[] args) {
        //CHILD 객체 그대로 힙에 올라감 (다만, parent가 Child를 가리키기에 컴파일 시점에서 직접 접근 불가)
        Parent parent = new Child();
        parent.print();
    }

    public static class Parent{
        public void print(){
            System.out.println("Hello I'm Parent");
        }

    }

    public static class Child extends Parent{
        public void print(){
            System.out.println("Hello I'm Child");
            onlyChild();
        }

        public void onlyChild(){
            System.out.println("Only Child Method");
        }
    }
}
