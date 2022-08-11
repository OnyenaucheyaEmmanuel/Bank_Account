import Account.Clock;
import org.junit.jupiter.api.Test;

public class ClockTest {
    @Test
    public void DisplayTime(){
        Clock clock = new Clock(12,23,44);
        clock.getTime(12,23,44);
    }
}
