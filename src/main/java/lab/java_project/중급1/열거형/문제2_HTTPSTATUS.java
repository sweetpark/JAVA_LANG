package lab.java_project.중급1.열거형;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Optional;

public class 문제2_HTTPSTATUS {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer code = Integer.parseInt(br.readLine());
        Optional<HTTPSTATUS> byCode = findByCode(code);
        if (byCode.isPresent()) {
            System.out.println(byCode.get());
        }else{
            System.out.println("해당 code가 존재하지 않습니다.");
        }
    }

    public static Optional<HTTPSTATUS> findByCode(int code){
        HTTPSTATUS[] values = HTTPSTATUS.values();
        for (HTTPSTATUS value : values) {
            if(value.code == code){
                return Optional.of(value);
            }
        }

        return Optional.empty();
    }

    public static enum HTTPSTATUS{
        SUCCESS(200, "SUCCESS", "정상 요청"),
        INTERNAL_SERVER_ERROR(500, "INTERNAL_SERVER_ERROR", "서버 응답 오류"),
        BAD_REQUEST(400, "Bad Request", "잘못된 요청");

        private int code;
        private String httpStatus;
        private String description;

        private HTTPSTATUS(int code, String httpStatus, String description) {
            this.code = code;
            this.httpStatus = httpStatus;
            this.description = description;
        }

        @Override
        public String toString() {
            return "CODE : " + code + " HTTP STATUS : " + httpStatus + " DESCRIPTION : " + description;
        }
    }
}
