package poetry;
import cumulative_poetry.CumulativePoetry;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;
import static constants.Constants.*;

public class PoetryTaleForDayTest {

    @Test public void testRevealPoetry() {
        HashMap<String, Object> flags = new HashMap<String, Object>();
        flags.put(REVEAL_FOR_DAY, true);
        flags.put(RECITE, false);
        flags.put(DAY_VALUE, "1");
        CumulativePoetry mockClass = new CumulativePoetry(flags);
        PoetryTaleForDay classUnderTest = new PoetryTaleForDay();
        assertEquals(classUnderTest.revealPoetry(mockClass), "This is the house that Jack built.");
    }

    @Test public void testGetDayValue() {
        final Integer dayValue = 1;
        HashMap<String, Object> flags = new HashMap<String, Object>();
        flags.put(REVEAL_FOR_DAY, true);
        flags.put(RECITE, false);
        flags.put(DAY_VALUE, "1");
        CumulativePoetry mockClass = new CumulativePoetry(flags);
        PoetryTaleForDay classUnderTest = new PoetryTaleForDay();
        assertEquals(classUnderTest.getDayValue(mockClass), dayValue);
    }

    @Test public void testCheckDayWithinRange() {
        final Integer dayValue = 1;
        PoetryTaleForDay classUnderTest = new PoetryTaleForDay();
        assertEquals(classUnderTest.checkDayWithinRange(dayValue), true);
    }
}
