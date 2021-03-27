package lab1;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class ex3 {


    public static void main(String[] args) {
        LocalDateTime curr = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("HH:mm  dd/MM/yyyy");
        System.out.println("Current datetime is: " + curr.format(format));
    }
}
