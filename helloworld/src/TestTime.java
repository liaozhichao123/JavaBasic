import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class TestTime {
    public static void main(String[] args) {
        LocalDateTime currentTime=LocalDateTime.now();
        System.out.println(currentTime);
//        long time=System.currentTimeMillis();
//        System.out.println(time);
    }
}
