package cumulative_poetry;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;
import static constants.Constants.*;

public class CumulativePoetryTest {

    @Test public void testRevealTaleForDay() {
        int dayValue = 1;
        HashMap<String, Object> flags = new HashMap<String, Object>();
        flags.put(REVEAL_FOR_DAY, true);
        flags.put(RECITE, false);
        flags.put(DAY_VALUE, "1");
        CumulativePoetry classUnderTest = new CumulativePoetry(flags);
        assertEquals(classUnderTest.revealTaleForDay(dayValue), " the farmer sowing his corn that kept");
    }

    @Test public void testGetPoetryForDay() {
        int dayValue = 1;
        HashMap<String, Object> flags = new HashMap<String, Object>();
        flags.put(REVEAL_FOR_DAY, true);
        flags.put(RECITE, false);
        flags.put(DAY_VALUE, "1");
        CumulativePoetry classUnderTest = new CumulativePoetry(flags);
        assertEquals(classUnderTest.getPoetryForDay(dayValue), "This is the house that Jack built.");
    }

    @Test public void testGetPoetryTaleRevealForDay() {
        HashMap<String, Object> flags = new HashMap<String, Object>();
        flags.put(REVEAL_FOR_DAY, true);
        flags.put(RECITE, false);
        flags.put(DAY_VALUE, "1");
        CumulativePoetry classUnderTest = new CumulativePoetry(flags);
        List<String> poems = new ArrayList();
        poems.add("This is the house that Jack built.");
        assertEquals(classUnderTest.getPoetryTale(), poems);
    }

    @Test public void testGetPoetryTaleRecite() {
        HashMap<String, Object> flags = new HashMap<String, Object>();
        flags.put(REVEAL_FOR_DAY, false);
        flags.put(RECITE, true);
        flags.put(DAY_VALUE, "0");
        List<String> poems = new ArrayList();
        poems.add("This is the house that Jack built.");
        poems.add("This is the malth that lay in the house that Jack built.");
        poems.add("This is the rat that ate the malth that lay in the house that Jack built.");
        poems.add("This is the cat that killed the rat that ate the malth that lay in the house that Jack built.");
        poems.add("This is the dog that worried the cat that killed the rat that ate the malth that lay in the house that Jack built.");
        poems.add("This is that cow with the crumpled horn that tossed the dog that worried the cat that killed the rat that ate the malth that lay in the house that Jack built.");
        poems.add("This is the maiden all forlorn that milked that cow with the crumpled horn that tossed the dog that worried the cat that killed the rat that ate the malth that lay in the house that Jack built.");
        poems.add("This is the man all tattered and torn that kissed the maiden all forlorn that milked that cow with the crumpled horn that tossed the dog that worried the cat that killed the rat that ate the malth that lay in the house that Jack built.");
        poems.add("This is the priest all shaven and shorn that married the man all tattered and torn that kissed the maiden all forlorn that milked that cow with the crumpled horn that tossed the dog that worried the cat that killed the rat that ate the malth that lay in the house that Jack built.");
        poems.add("This is the rooster that crowed in the morn that woke the priest all shaven and shorn that married the man all tattered and torn that kissed the maiden all forlorn that milked that cow with the crumpled horn that tossed the dog that worried the cat that killed the rat that ate the malth that lay in the house that Jack built.");
        poems.add("This is the farmer sowing his corn that kept the rooster that crowed in the morn that woke the priest all shaven and shorn that married the man all tattered and torn that kissed the maiden all forlorn that milked that cow with the crumpled horn that tossed the dog that worried the cat that killed the rat that ate the malth that lay in the house that Jack built.");
        poems.add("This is the horse and the hound and the horn that belonged to the farmer sowing his corn that kept the rooster that crowed in the morn that woke the priest all shaven and shorn that married the man all tattered and torn that kissed the maiden all forlorn that milked that cow with the crumpled horn that tossed the dog that worried the cat that killed the rat that ate the malth that lay in the house that Jack built.");
        CumulativePoetry classUnderTest = new CumulativePoetry(flags);
        assertEquals(classUnderTest.getPoetryTale(), poems);
    }

    @Test public void testGetPoetryTaleNoOperationFound() {
        HashMap<String, Object> flags = new HashMap<String, Object>();
        flags.put(REVEAL_FOR_DAY, false);
        flags.put(RECITE, false);
        flags.put(DAY_VALUE, "0");
        CumulativePoetry classUnderTest = new CumulativePoetry(flags);
        List<String> poems = new ArrayList();
        poems.add("Please enter a specific operation");
        assertEquals(classUnderTest.getPoetryTale(), poems);
    }

}
