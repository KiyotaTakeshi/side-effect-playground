package step1;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Greet greet = new Greet("mike", "popcorn", "M", LocalDateTime.of(2022, 2, 7,14, 0, 0));
        greet.greet();
    }
}
