package lab.java_project.중급1.중첩클래스;

public class Parent {
    private Child child;

    public Parent(String child){
        this.child= new Child(child);
    }

    public void getChildPrint() {
        child.print();
    }

    public static class NoChild{
        private String className;

        public NoChild(String className) {
            this.className = className;
        }

        public void print(){
            System.out.println("No Child : " + className);
        }
    }


    private static class Child{
        private String className;
        private Child(String className) {
            this.className = className;
        }

        public void print(){
            System.out.println("Child : " + className);
        }
    }


}
