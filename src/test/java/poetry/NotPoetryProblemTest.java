package poetry;
import poetry_application.*;
import cumulative_poetry.CumulativePoetry;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;
import static constants.Constants.*;

public class NotPoetryProblemTest {

    @Test public void testRevealPoetry() {
        String[] args = new String[]{};
        App app = new App(args);
        CumulativePoetry mockClass = new CumulativePoetry(app.flags);
        NotPoetryProblem classUnderTest = new NotPoetryProblem();
        List<String> poems = Arrays.asList(
         "Please enter a specific operation"
        );
        assertEquals(classUnderTest.revealPoetry(mockClass), poems);
    }

}
