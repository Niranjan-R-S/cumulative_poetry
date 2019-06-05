package poetry;
import cumulative_poetry.CumulativePoetry;
import static constants.Constants.*;
import java.util.*;

public class PoetryTaleForDay implements Poetry{

  public List<String> revealPoetry(CumulativePoetry poetry){
    final Integer dayValue = this.getDayValue(poetry);
    if(this.checkDayWithinRange(dayValue)){
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

  public Boolean checkDayWithinRange(Integer dayValue){
    return dayValue > MIN_DAY_LIMIT &&  dayValue <= TALES.length;
  }
}
