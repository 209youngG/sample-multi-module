import org.junit.jupiter.api.Test;
import utils.TimeUtil;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class TimeUtilTest {

    @Test
    void testGetCurrentDate() {
        String currentDate = TimeUtil.getCurrentDate();
        assertNotNull(currentDate);
    }

    @Test
    void testGetInputDate() {
        LocalDateTime now = LocalDateTime.now();
        String inputDate = TimeUtil.getInputDate(now);
        assertNotNull(inputDate);
    }
}