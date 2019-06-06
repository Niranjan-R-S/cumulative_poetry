package poetry;
import application_flags.*;
import cumulative_poetry.CumulativePoetry;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;
import static constants.Constants.*;

public class NotPoetryProblemTest {

    @Test public void testRevealPoetry() {
        ApplicationFlags flags = new ApplicationFlags();
        flags.revealForDay = "";
        flags.help = true;
        flags.recite = false;
        CumulativePoetry mockClass = new CumulativePoetry(flags);
        NotPoetryProblem classUnderTest = new NotPoetryProblem();
        List<String> poems = Arrays.asList(
         "Please enter a specific operation"
        );
        assertEquals(classUnderTest.revealPoetry(mockClass), poems);
    }

}
