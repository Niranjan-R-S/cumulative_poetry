package poetry;
import poetry_application.*;
import cumulative_poetry.CumulativePoetry;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;
import static constants.Constants.*;

public class PoetryTaleForDayTest {

    @Test public void testRevealPoetry() {
        String[] args = new String[]{
          REVEAL_FOR_DAY,
          "1"
        };
        App app = new App(args);
        CumulativePoetry mockClass = new CumulativePoetry(app.flags);
        PoetryTaleForDay classUnderTest = new PoetryTaleForDay();
        List<String> poems = Arrays.asList(
         "This is the house that Jack built."
        );
        assertEquals(classUnderTest.revealPoetry(mockClass), poems);
    }

    @Test public void testGetDayValue() {
        final Integer dayValue = 1;
        String[] args = new String[]{
          REVEAL_FOR_DAY,
          "1"
        };
        App app = new App(args);
        CumulativePoetry mockClass = new CumulativePoetry(app.flags);
        PoetryTaleForDay classUnderTest = new PoetryTaleForDay();
        assertEquals(classUnderTest.getDayValue(mockClass), dayValue);
    }

    @Test public void testCheckDayWithinRange() {
        final Integer dayValue = 1;
        PoetryTaleForDay classUnderTest = new PoetryTaleForDay();
        assertEquals(classUnderTest.checkDayWithinRange(dayValue), true);
    }
}
