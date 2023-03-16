import com.rakhi.service.NewGreeter;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        NewGreeter g = new NewGreeter();
        LocalDate
        System.out.println(g.greet());
        System.out.println(g.greet());
        System.out.println(g.greet("Rakhi"));
        System.out.println(g.greet("Rakhi"));
    }
}