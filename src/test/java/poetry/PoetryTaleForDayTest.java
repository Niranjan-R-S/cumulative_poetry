package poetry;
import application_flags.ApplicationFlags;
import cumulative_poetry.CumulativePoetry;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

public class PoetryTaleForDayTest {

    @Test public void testRevealPoetry() {
        ApplicationFlags flags = new ApplicationFlags();
        flags.revealForDay = "1";
        flags.help = true;
        flags.recite = false;
        CumulativePoetry mockClass = new CumulativePoetry(flags);
        PoetryTaleForDay classUnderTest = new PoetryTaleForDay();
        List<String> poems = Arrays.asList(
         "This is the house that Jack built."
        );
        assertEquals(classUnderTest.revealPoetry(mockClass), poems);
    }

    @Test public void testGetDayValue() {
        final Integer dayValue = 1;
        ApplicationFlags flags = new ApplicationFlags();
        flags.revealForDay = "1";
        flags.help = true;
        flags.recite = false;
        CumulativePoetry mockClass = new CumulativePoetry(flags);
        PoetryTaleForDay classUnderTest = new PoetryTaleForDay();
        assertEquals(classUnderTest.getDayValue(mockClass), dayValue);
    }

}
