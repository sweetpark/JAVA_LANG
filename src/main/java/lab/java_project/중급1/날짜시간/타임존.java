package lab.java_project.중급1.날짜시간;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class 타임존 {
    public static void main(String[] args) {
//        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
//        for (String availableZoneId : availableZoneIds) {
//            System.out.println(" Time Zone : " +availableZoneId);
//        }

        ZoneId zoneId = ZoneId.of("Asia/Seoul");
        LocalDateTime ldt = LocalDateTime.now();
        ZonedDateTime zonedDateTime = ZonedDateTime.of(ldt, zoneId);
        System.out.println(" Current Country : " + zonedDateTime);

        //Zone 변경
        ZonedDateTime utc1 = zonedDateTime.withZoneSameInstant(ZoneId.of("UTC"));
        System.out.println(" UTC1 Country : " + utc1);

    }
}
