package step1;

import lombok.AllArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
public class Greet {
    String first;
    String last;
    String gender;
    LocalDateTime now;

    public void greet() {
        System.out.println(
                getFirstMessage() + getForGender() + forFullName()
        );
    }

    private String getFirstMessage() {
        int hour = now.getHour();
        if (6 <= hour && hour < 12) {
            return "good morning ";
        } else if (12 <= hour && hour < 18) {
            return "hello ";
        } else {
            return "good bye ";
        }
    }

    private String getForGender() {
        if (gender.equals("M")) {
            return "Mr. ";
        } else {
            return "Miss ";
        }
    }

    private String forFullName() {
        return first + " " + last;
    }
}
