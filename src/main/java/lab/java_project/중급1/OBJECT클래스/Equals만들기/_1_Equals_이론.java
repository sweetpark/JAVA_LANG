package lab.java_project.중급1.OBJECT클래스.Equals만들기;

import lombok.Data;

public class _1_Equals_이론 {
    /**
     * 1. equals는 동일성 / 동등성을 이해해야함
     * 2. 동일성 -> 메모리 주소까지 같아야 "동일성" 이라고 일컫음
     * 3. 동등성 -> 값만 같으면 "동등성" 이라고 말함
     */
    public static void main(String[] args) {
        USER user1 = new USER();
        user1.setId(1);
        user1.setName("test");

        USER user2 = new USER();
        user2.setId(1);
        user2.setName("test");

        System.out.println(user1 == user2); // false
        System.out.println(user1.equals(user2)); // true


        // 모든 멤버 변수 값이 같아야 true가 나옴
        user2.setName("test2");
        System.out.println(user1.equals(user2)); // false


        // 만약 id만 같아도 같다고 할 경우)
        USER2 user3 = new USER2();
        user3.setId(1);
        user3.setName("test");
        USER2 user4 = new USER2();
        user4.setId(1);
        user4.setName("test2");

        System.out.println(user3 == user4); // false
        System.out.println(user3.equals(user4)); // true

    }

    @Data
    public static class USER{
        private Integer id;
        private String name;   
    }

    @Data
    public static class USER2{
        private Integer id;
        private String name;

        //id만 같아도 되는경우
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            USER2 user2 = (USER2) o;
            return user2.getId().equals(id);
        }
    }
}
