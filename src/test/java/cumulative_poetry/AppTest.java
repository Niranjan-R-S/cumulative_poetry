package cumulative_poetry;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

public class AppTest {

    @Test public void testRevealTaleForDayInRange() {
        String[] args = new String[2];
        args[0] = "--reveal-for-day";
        args[1] = "1";
        App classUnderTest = new App(args);
        String final_output = classUnderTest.getTaleForDay();
        assertEquals(final_output, "This is the house that Jack built.");
    }

    @Test public void testRevealTaleForDayNotInRange() {
        String[] args = new String[2];
        args[0] = "--reveal-for-day";
        args[1] = "0";
        App classUnderTest = new App(args);
        String final_output = classUnderTest.getTaleForDay();
        assertEquals(final_output, "Day value is outside the range");
    }

    @Test public void testRevealNoOperationFound() {
        String[] args = new String[2];
        args[0] = "--reveal-for-dayk";
        args[1] = "0";
        App classUnderTest = new App(args);
        String final_output = classUnderTest.getTaleForDay();
        assertEquals(final_output, "Please enter a specific operation");
    }

    @Test public void testRecite() {
        String wholePoetry = "Day 1 -This is the house that Jack built.Day 2 -This is the malt that lay in the house that Jack built.Day 3 -This is the rat that ate the malt that lay in the house that Jack built.Day 4 -This is the cat that killed the rat that ate the malt that lay in the house that Jack built.Day 5 -This is the dog that worried the cat that killed the rat that ate the malt that lay in the house that Jack built.Day 6 -This is that cow with the crumpled horn that tossed the dog that worried the cat that killed the rat that ate the malt that lay in the house that Jack built.Day 7 -This is the maiden all forlorn that milked that cow with the crumpled horn that tossed the dog that worried the cat that killed the rat that ate the malt that lay in the house that Jack built.Day 8 -This is the man all tattered and torn that kissed the maiden all forlorn that milked that cow with the crumpled horn that tossed the dog that worried the cat that killed the rat that ate the malt that lay in the house that Jack built.Day 9 -This is the priest all shaven and shorn that married the man all tattered and torn that kissed the maiden all forlorn that milked that cow with the crumpled horn that tossed the dog that worried the cat that killed the rat that ate the malt that lay in the house that Jack built.Day 10 -This is the rooster that crowed in the morn that woke the priest all shaven and shorn that married the man all tattered and torn that kissed the maiden all forlorn that milked that cow with the crumpled horn that tossed the dog that worried the cat that killed the rat that ate the malt that lay in the house that Jack built.Day 11 -This is the farmer sowing his corn that kept the rooster that crowed in the morn that woke the priest all shaven and shorn that married the man all tattered and torn that kissed the maiden all forlorn that milked that cow with the crumpled horn that tossed the dog that worried the cat that killed the rat that ate the malt that lay in the house that Jack built.Day 12 -This is the horse and the hound and the horn that belonged to the farmer sowing his corn that kept the rooster that crowed in the morn that woke the priest all shaven and shorn that married the man all tattered and torn that kissed the maiden all forlorn that milked that cow with the crumpled horn that tossed the dog that worried the cat that killed the rat that ate the malt that lay in the house that Jack built.";
        String[] args = new String[1];
        args[0] = "--recite";
        App classUnderTest = new App(args);
        String final_output = classUnderTest.getTaleForDay();
        assertEquals(final_output, wholePoetry);
    }

}
