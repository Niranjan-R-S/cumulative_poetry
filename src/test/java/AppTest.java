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
        assertEquals(classUnderTest.getPoetryTale(), "This is the house that Jack built.");
    }

    @Test public void testRevealTaleForDayNotInRange() {
        String[] args = new String[]{
          Constants.REVEAL_FOR_DAY,
          "0"
        };
        App classUnderTest = new App(args);
        assertEquals(classUnderTest.getPoetryTale(), "Day value is outside the range");
    }

    @Test public void testRevealNoOperationFound() {
        String[] args = new String[]{
          "--reveal-for-dayk",
          "0"
        };
        App classUnderTest = new App(args);
        assertEquals(classUnderTest.getPoetryTale(), "Please enter a specific operation");
    }

    @Test public void testRecite() {
        String wholePoetry = "Day 1 -\nThis is the house that Jack built.\nDay 2 -\nThis is the malth that lay in the house that Jack built.\nDay 3 -\nThis is the rat that ate the malth that lay in the house that Jack built.\nDay 4 -\nThis is the cat that killed the rat that ate the malth that lay in the house that Jack built.\nDay 5 -\nThis is the dog that worried the cat that killed the rat that ate the malth that lay in the house that Jack built.\nDay 6 -\nThis is that cow with the crumpled horn that tossed the dog that worried the cat that killed the rat that ate the malth that lay in the house that Jack built.\nDay 7 -\nThis is the maiden all forlorn that milked that cow with the crumpled horn that tossed the dog that worried the cat that killed the rat that ate the malth that lay in the house that Jack built.\nDay 8 -\nThis is the man all tattered and torn that kissed the maiden all forlorn that milked that cow with the crumpled horn that tossed the dog that worried the cat that killed the rat that ate the malth that lay in the house that Jack built.\nDay 9 -\nThis is the priest all shaven and shorn that married the man all tattered and torn that kissed the maiden all forlorn that milked that cow with the crumpled horn that tossed the dog that worried the cat that killed the rat that ate the malth that lay in the house that Jack built.\nDay 10 -\nThis is the rooster that crowed in the morn that woke the priest all shaven and shorn that married the man all tattered and torn that kissed the maiden all forlorn that milked that cow with the crumpled horn that tossed the dog that worried the cat that killed the rat that ate the malth that lay in the house that Jack built.\nDay 11 -\nThis is the farmer sowing his corn that kept the rooster that crowed in the morn that woke the priest all shaven and shorn that married the man all tattered and torn that kissed the maiden all forlorn that milked that cow with the crumpled horn that tossed the dog that worried the cat that killed the rat that ate the malth that lay in the house that Jack built.\nDay 12 -\nThis is the horse and the hound and the horn that belonged to the farmer sowing his corn that kept the rooster that crowed in the morn that woke the priest all shaven and shorn that married the man all tattered and torn that kissed the maiden all forlorn that milked that cow with the crumpled horn that tossed the dog that worried the cat that killed the rat that ate the malth that lay in the house that Jack built.\n";
        String[] args = new String[]{
          Constants.RECITE
        };
        App classUnderTest = new App(args);
        assertEquals(classUnderTest.getPoetryTale(), wholePoetry);
    }

}
