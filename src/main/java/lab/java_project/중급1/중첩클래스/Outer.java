package lab.java_project.중급1.중첩클래스;


import org.springframework.cglib.core.Local;

/***
 * 1. 지역
 * 2. 익명
 * 3. 내부
 */
public class Outer {

    // 지역 클래스
    private String outer;
    private InnerClass innerClass = new InnerClass("test");

    public Outer(String outer){
        this.outer = outer;
    }

    public String getOuter() {
        return outer;
    }

    // 멤버변수 내부 클래스
    public class InnerClass{
        private String innerClass;
        public InnerClass(String innerClass){
            this.innerClass = innerClass;
        }
    }

    public Printer process(String local){

        // 지역 클래스
        class InnerLocal implements Printer{

            public String local;

            public InnerLocal(String local){
                this.local = local;
            }

            // outer는 Outer클래스의 멤버변수 ( process() 가 끝이 종료가 난다면 outer는 접근할 수 없어야할것)
            @Override
            public void print() {
                System.out.println("Local Info : " + local + " , " + outer + ", Inner Class : " + innerClass.innerClass);

            }

            @Override
            public String getOuter(){
                return outer;
            }
        }

        return new InnerLocal(local);
    }

}
