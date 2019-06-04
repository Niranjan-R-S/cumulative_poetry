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
        assertEquals(classUnderTest.getPoetryTale(), "This is the house that Jack built.");
    }

    @Test public void testGetPoetryTaleRecite() {
        HashMap<String, Object> flags = new HashMap<String, Object>();
        flags.put(REVEAL_FOR_DAY, false);
        flags.put(RECITE, true);
        flags.put(DAY_VALUE, "0");
        String wholePoetry = "Day 1 -\nThis is the house that Jack built.\nDay 2 -\nThis is the malth that lay in the house that Jack built.\nDay 3 -\nThis is the rat that ate the malth that lay in the house that Jack built.\nDay 4 -\nThis is the cat that killed the rat that ate the malth that lay in the house that Jack built.\nDay 5 -\nThis is the dog that worried the cat that killed the rat that ate the malth that lay in the house that Jack built.\nDay 6 -\nThis is that cow with the crumpled horn that tossed the dog that worried the cat that killed the rat that ate the malth that lay in the house that Jack built.\nDay 7 -\nThis is the maiden all forlorn that milked that cow with the crumpled horn that tossed the dog that worried the cat that killed the rat that ate the malth that lay in the house that Jack built.\nDay 8 -\nThis is the man all tattered and torn that kissed the maiden all forlorn that milked that cow with the crumpled horn that tossed the dog that worried the cat that killed the rat that ate the malth that lay in the house that Jack built.\nDay 9 -\nThis is the priest all shaven and shorn that married the man all tattered and torn that kissed the maiden all forlorn that milked that cow with the crumpled horn that tossed the dog that worried the cat that killed the rat that ate the malth that lay in the house that Jack built.\nDay 10 -\nThis is the rooster that crowed in the morn that woke the priest all shaven and shorn that married the man all tattered and torn that kissed the maiden all forlorn that milked that cow with the crumpled horn that tossed the dog that worried the cat that killed the rat that ate the malth that lay in the house that Jack built.\nDay 11 -\nThis is the farmer sowing his corn that kept the rooster that crowed in the morn that woke the priest all shaven and shorn that married the man all tattered and torn that kissed the maiden all forlorn that milked that cow with the crumpled horn that tossed the dog that worried the cat that killed the rat that ate the malth that lay in the house that Jack built.\nDay 12 -\nThis is the horse and the hound and the horn that belonged to the farmer sowing his corn that kept the rooster that crowed in the morn that woke the priest all shaven and shorn that married the man all tattered and torn that kissed the maiden all forlorn that milked that cow with the crumpled horn that tossed the dog that worried the cat that killed the rat that ate the malth that lay in the house that Jack built.\n";
        CumulativePoetry classUnderTest = new CumulativePoetry(flags);
        assertEquals(classUnderTest.getPoetryTale(), wholePoetry);
    }

    @Test public void testGetPoetryTaleNoOperationFound() {
        HashMap<String, Object> flags = new HashMap<String, Object>();
        flags.put(REVEAL_FOR_DAY, false);
        flags.put(RECITE, false);
        flags.put(DAY_VALUE, "0");
        CumulativePoetry classUnderTest = new CumulativePoetry(flags);
        assertEquals(classUnderTest.getPoetryTale(), "Please enter a specific operation");
    }

}
