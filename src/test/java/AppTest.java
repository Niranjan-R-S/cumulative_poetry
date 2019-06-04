package application;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;
import constants.Constants;

public class AppTest {

    @Test public void testParseArgs() {
        String[] args = new String[]{
          Constants.REVEAL_FOR_DAY,
          "1"
        };
        App classUnderTest = new App(args);
        HashMap<String, Object> flags = new HashMap<String, Object>();
        flags.put(Constants.REVEAL_FOR_DAY, true);
        flags.put(Constants.RECITE, false);
        flags.put(Constants.DAY_VALUE, "1");
        assertEquals(classUnderTest.parseArgs(), flags);
    }

    @Test public void testRevealTaleForDayInRange() {
        String[] args = new String[]{
          Constants.REVEAL_FOR_DAY,
          "1"
        };
        App classUnderTest = new App(args);
        List<String> poems = new ArrayList();
        poems.add("This is the house that Jack built.");
        assertEquals(classUnderTest.getPoetryTale(), poems);
    }

    @Test public void testRevealTaleForDayNotInRange() {
        String[] args = new String[]{
          Constants.REVEAL_FOR_DAY,
          "0"
        };
        App classUnderTest = new App(args);
        List<String> poems = new ArrayList();
        poems.add("Day value is outside the range");
        assertEquals(classUnderTest.getPoetryTale(), poems);
    }

    @Test public void testRevealNoOperationFound() {
        String[] args = new String[]{
          Constants.NOT_POETRY_PROBLEM,
          "0"
        };
        App classUnderTest = new App(args);
        List<String> poems = new ArrayList();
        poems.add("Please enter a specific operation");
        assertEquals(classUnderTest.getPoetryTale(), poems);
    }

    @Test public void testRecite() {
        String wholePoetry = "Day 1 -\n\nDay 2 -\n\nDay 3 -\n\nDay 4 -\n\nDay 5 -\n\nDay 6 -\n\nDay 7 -\n\nDay 8 -\n\nDay 9 -\n\nDay 10 -\n\nDay 11 -\n\nDay 12 -\n\n";
        String[] args = new String[]{
          Constants.RECITE
        };
        App classUnderTest = new App(args);
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
        assertEquals(classUnderTest.getPoetryTale(), poems);
    }

}
