package poetry;
import cumulative_poetry.CumulativePoetry;
import static constants.Constants.*;
import java.util.*;
import java.util.function.Predicate;

public class PoetryTaleForDay implements Poetry{

  public List<String> revealPoetry(CumulativePoetry poetry){
    final Integer dayValue = this.getDayValue(poetry);

    Predicate<Integer> checkDayWithinRange = value -> (value > MIN_DAY_LIMIT &&  value <= TALES.length);

    if(checkDayWithinRange.test(dayValue)){
      return Arrays.asList(
       poetry.getPoetryForDay(dayValue)
      );
    }
    return Arrays.asList(
     "Day value is outside the range"
    );
  }

  public Integer getDayValue(CumulativePoetry poetry){
    return Integer.parseInt(poetry.flags.revealForDay);
  }

}
