package lab.java_project.중급1.열거형;

import java.util.Arrays;

public class 문제1_계정권한 {
    public static void main(String[] args) {

        ACCOUNT[] values = ACCOUNT.values();
        System.out.println(Arrays.toString(values));

        System.out.println(chkAccountAuth(ACCOUNT.NO_ACCOUNT));

        
    }

    public static String chkAccountAuth(ACCOUNT account){
        switch (account.level){
            case 1:
            case 2:
                return account.auth;
            default:
                return "권한 없음";
        }
    }

    public static enum ACCOUNT{

        ADMIN(1, "ADMIN"), GUEST(2, "GUEST"), NO_ACCOUNT(3, "NO ACCOUNT");

        private int level;
        private String auth;

        ACCOUNT(int level, String auth) {
            this.level = level;
            this.auth = auth;
        }

        @Override
        public String toString() {
            return "Level : " + level + "( Auth : " + auth + " )";
        }
        
    }
}
