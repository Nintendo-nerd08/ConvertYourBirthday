import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class BirthdayConvert {

    public static void main(String[] args) {
        LocalDateTime birthday = LocalDateTime.of(2009, 1, 28, 5, 28, 15);
        ZoneId us = ZoneId.of("America/New_York");
        ZonedDateTime birthdayZoned = ZonedDateTime.of(birthday, us);

        ZoneId Pairs = ZoneId.of("Europe/Pairs");
        ZonedDateTime birthdayPairs = birthdayZoned.withZoneSameInstant(Pairs);
        System.out.println(birthdayZoned);
        System.out.println(birthdayPairs);
    }



}
