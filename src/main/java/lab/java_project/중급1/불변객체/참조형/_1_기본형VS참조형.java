package lab.java_project.중급1.불변객체.참조형;

public class _1_기본형VS참조형 {
    /**
     *
     * 1. 기본형 VS 참조값
     * - 인스턴스 : 하나의 객체를 받는 바구니
     * (new 연산을 통해 받는 쪽을 인스턴스라고 함)
     */
    public static void main(String[] args) {

        /* 기본형 */
        // 기본형은 값 복사가 일어나서 원본에 접근을 하지 않는다
        int a = 10;
        int b = a;
        System.out.println(a); // 10
        System.out.println(b); // 10

        b = 20;
        System.out.println(a); // 10
        System.out.println(b); // 20



        /* 참조형 */
        // 객체를 공유해서 사용한다
        Child child = new Child(10);
        Child child2 = child;

        // 둘다 AGE : 10
        System.out.println(child.getAge()); // 10
        System.out.println(child2.getAge()); // 10


        child2.setAge(20);
        System.out.println(child.getAge()); // 예상 : 10 -> 실제 : 20
        System.out.println(child2.getAge()); // 예상 : 20  -> 실제: 20


        //참조형 방어 방법
        // 1. 새로운 객체로 생성
        Child child3 = new Child(20);
        Child child4 = new Child(20);

        System.out.println(child3.getAge()); // 20
        System.out.println(child4.getAge()); // 20

        child4.setAge(10);
        System.out.println(child3.getAge()); // 20
        System.out.println(child4.getAge()); // 10
    }


    public static class Child{
        private int age;
        public Child(int age) {
            this.age = age;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}
