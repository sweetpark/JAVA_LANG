package lab.java_project.중급1.OBJECT클래스.toString만들기;

/**
 *
 * 1. Object toString() 만 있을경우 : lab.java_project.BASIC.OBJECT클래스.toString만들기._toString개념$Child@7e9e5f8a
 * 2. parent toString()이 있을경우 : Hello I'm Parent
 * 3. child toString()이 있을경우 : Hello I'm Child
 *
 *  생성된 (new) 객체의 재정의된 메서드 -> 부모 메서드 -> Object 메서드 (최후)
 *
 */
public class _2_toString개념 {
    public static void main(String[] args) {
        // 생성된 객체 메서드에서부터 찾음
        // 다만, Object로 받았기에 컴파일러 입장에서는 Object안에 포함된 메서드만 사용할수 있음 (아니면 컴파일 에러남)
        Object object = new Child();
        System.out.println(object.toString());
    }

    public static class Parent{

        @Override
        public String toString(){
            return "Hello I'm Parent";
        }

    }

    public static class Child extends Parent{
        @Override
        public String toString(){
            onlyChild();
            return "Hello I'm Child";
        }

        public void onlyChild(){
            System.out.println("Only Child Method");
        }
    }
}
