package poetry;
import application_flags.ApplicationFlags;
import cumulative_poetry.CumulativePoetry;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

public class WholePoetryTest {

    @Test public void testRevealPoetry() {
        List<String> poems = Arrays.asList(
         "This is the house that Jack built.",
         "This is the malth that lay in the house that Jack built.",
         "This is the rat that ate the malth that lay in the house that Jack built.",
         "This is the cat that killed the rat that ate the malth that lay in the house that Jack built.",
         "This is the dog that worried the cat that killed the rat that ate the malth that lay in the house that Jack built.",
         "This is that cow with the crumpled horn that tossed the dog that worried the cat that killed the rat that ate the malth that lay in the house that Jack built.",
         "This is the maiden all forlorn that milked that cow with the crumpled horn that tossed the dog that worried the cat that killed the rat that ate the malth that lay in the house that Jack built.",
         "This is the man all tattered and torn that kissed the maiden all forlorn that milked that cow with the crumpled horn that tossed the dog that worried the cat that killed the rat that ate the malth that lay in the house that Jack built.",
         "This is the priest all shaven and shorn that married the man all tattered and torn that kissed the maiden all forlorn that milked that cow with the crumpled horn that tossed the dog that worried the cat that killed the rat that ate the malth that lay in the house that Jack built.",
         "This is the rooster that crowed in the morn that woke the priest all shaven and shorn that married the man all tattered and torn that kissed the maiden all forlorn that milked that cow with the crumpled horn that tossed the dog that worried the cat that killed the rat that ate the malth that lay in the house that Jack built.",
         "This is the farmer sowing his corn that kept the rooster that crowed in the morn that woke the priest all shaven and shorn that married the man all tattered and torn that kissed the maiden all forlorn that milked that cow with the crumpled horn that tossed the dog that worried the cat that killed the rat that ate the malth that lay in the house that Jack built.",
         "This is the horse and the hound and the horn that belonged to the farmer sowing his corn that kept the rooster that crowed in the morn that woke the priest all shaven and shorn that married the man all tattered and torn that kissed the maiden all forlorn that milked that cow with the crumpled horn that tossed the dog that worried the cat that killed the rat that ate the malth that lay in the house that Jack built."
        );
        ApplicationFlags flags = new ApplicationFlags();
        flags.revealForDay = "";
        flags.help = true;
        flags.recite = true;
        CumulativePoetry mockClass = new CumulativePoetry(flags);
        WholePoetry classUnderTest = new WholePoetry();
        assertEquals(classUnderTest.revealPoetry(mockClass), poems);
    }

}
