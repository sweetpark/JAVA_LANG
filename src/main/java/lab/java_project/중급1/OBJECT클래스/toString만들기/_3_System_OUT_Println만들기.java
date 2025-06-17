package lab.java_project.중급1.OBJECT클래스.toString만들기;

public class _3_System_OUT_Println만들기 {
    public static void main(String[] args) {
        Animal dog = new Dog();
        print(dog);
        Object parent  = new Parent();
        print(parent);
    }

    public static void print(Object obj){
        System.out.println(obj.toString());
    }

    public static class Parent{
        @Override
        public String toString() {
            return " Parent ";
        }
    }

    public static class Animal{
        @Override
        public String toString() {
            return " Animal ";
        }
    }

    public static class Dog extends Animal{
        @Override
        public String toString() {
            return " DOG ";
        }
    }

    public static class Cat extends Animal{
        @Override
        public String toString() {
            return " CAT ";
        }
    }
}
