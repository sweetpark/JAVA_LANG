package lab.java_project.중급1.래퍼클래스와클래스;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.transaction.Transactional;
import lombok.Data;
import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class 클래스정보 {
    /**
     * Class 정보
     *  - 클래스를 조회하여 해당 메타데이터를 조회할 수 있다
     *  (메타데이터 : 선언된 필드들 / 메서드들 / 클래스 이름 / 등등...)
     *  1. 타입 정보 얻기 (메서드, 필드들의 이름 등등)
     *  2. 인스턴스 생성 및 메서드 활용 가능
     *  3. 해당 클래스에 붙어있는 어노테이션 조회 가능
     *  4. 동적 로딩과 생성 (2번 세부 설명) : 직접 인스턴스를 만듬
     */
    public static void main(String[] args) throws Exception {
        // [클래스 조회]
        // 1. 패키지에서 가져오기
        // 2. 클래스에서 가져오기
        // 3. 인스턴스에서 가져오기
        Class<?> clazz = Class.forName("lab.java_project.중급1.래퍼클래스와클래스.클래스정보$UserInfo");
        Class<?> clazz2 = UserInfo.class;
        Class<?> clazz3 = new UserInfo("test", 10).getClass();

        // 필드 정보
        Field[] declaredFields = clazz.getDeclaredFields();
        System.out.println("=================== Field ====================");
        for (Field field : declaredFields) {
            Annotation[] annotations = field.getAnnotations();
            for (Annotation annotation : annotations) {
                System.out.println(annotation.annotationType().getName());
            }
            System.out.println(field.getName());
        }
        System.out.println("===============================================");
        
        // 메서드 정보
        Method[] declaredMethods = clazz.getDeclaredMethods();
        System.out.println("=================== Method ====================");
        for (Method method : declaredMethods) {
            System.out.println(method.getName());
        }
        System.out.println("===============================================");

        //어노테이션 정보 (클래스 단위에 붙은 어노테이션 정보 읽기)
        Annotation[] declaredAnnotations = clazz.getDeclaredAnnotations();
        System.out.println("=================== Annotation ====================");
        for (Annotation annotation : declaredAnnotations) {
            System.out.println(annotation.annotationType().getName());
        }
        System.out.println("===============================================");

        // [동적 생성]
        UserInfo userInfo = (UserInfo) clazz.getDeclaredConstructor().newInstance();
        System.out.println(userInfo.getName());
        UserInfo userInfo2 = (UserInfo) clazz.getConstructor(String.class, Integer.class).newInstance("test", 20);
        System.out.println(userInfo2.getName());

        

    }

    @Data
    @Entity
    public static class UserInfo{

        @Id
        private String name;
        private Integer age;

        public UserInfo() {}

        public UserInfo(String name, Integer age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge(){
            return age;
        }
    }
}
