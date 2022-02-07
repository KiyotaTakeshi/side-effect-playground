package step3;

import lombok.AllArgsConstructor;

import java.time.LocalDateTime;

public class Greet {

    public static String greet(String first, String last, String gender, LocalDateTime now) {
        return getFirstMessage(now) + getForGender(gender) + forFullName(first, last);
    }

    private static String getFirstMessage(LocalDateTime now) {
        int hour = now.getHour();
        if (6 <= hour && hour < 12) {
            return "good morning ";
        } else if (12 <= hour && hour < 18) {
            return "hello ";
        } else {
            return "good bye ";
        }
    }

    private static String getForGender(String gender) {
        if (gender.equals("M")) {
            return "Mr. ";
        } else {
            return "Miss ";
        }
    }

    private static String forFullName(String first, String last) {
        return first + " " + last;
    }
}
