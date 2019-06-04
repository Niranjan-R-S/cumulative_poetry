package poetry;
import cumulative_poetry.CumulativePoetry;
import static constants.Constants.*;
import java.util.*;

public class PoetryTaleForDay implements Poetry{

  public List<String> revealPoetry(CumulativePoetry poetry){
    final Integer dayValue = this.getDayValue(poetry);
    List<String> poems = new ArrayList();
    if(this.checkDayWithinRange(dayValue)){
      poems.add(poetry.getPoetryForDay(dayValue));
      return poems;
    }
    poems.add("Day value is outside the range");
    return poems;
  }

  public Integer getDayValue(CumulativePoetry poetry){
    return Integer.parseInt((String)poetry.flags.get(DAY_VALUE));
  }

  public Boolean checkDayWithinRange(Integer dayValue){
    return dayValue > MIN_DAY_LIMIT &&  dayValue <= TALES.length;
  }
}
