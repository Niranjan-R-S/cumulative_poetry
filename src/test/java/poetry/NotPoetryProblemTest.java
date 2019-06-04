package poetry;
import cumulative_poetry.CumulativePoetry;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;
import static constants.Constants.*;

public class NotPoetryProblemTest {

    @Test public void testRevealPoetry() {
        HashMap<String, Object> flags = new HashMap<String, Object>();
        flags.put(REVEAL_FOR_DAY, false);
        flags.put(RECITE, false);
        flags.put(DAY_VALUE, "0");
        CumulativePoetry mockClass = new CumulativePoetry(flags);
        NotPoetryProblem classUnderTest = new NotPoetryProblem();
        assertEquals(classUnderTest.revealPoetry(mockClass), "Please enter a specific operation");
    }

}
