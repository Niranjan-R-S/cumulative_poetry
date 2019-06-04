package poetry;
import cumulative_poetry.CumulativePoetry;
import static constants.Constants.*;

public class PoetryTaleForDay implements Poetry{

  public String revealPoetry(CumulativePoetry getPoetryTale){
    final Integer dayValue = this.getDayValue(getPoetryTale);
    if(this.checkDayWithinRange(dayValue)){
      return getPoetryTale.getPoetryForDay(dayValue);
    }
    return "Day value is outside the range";
  }

  public Integer getDayValue(CumulativePoetry getPoetryTale){
    return Integer.parseInt((String)getPoetryTale.flags.get(DAY_VALUE));
  }

  public Boolean checkDayWithinRange(Integer dayValue){
    return dayValue > MIN_DAY_LIMIT &&  dayValue <= TALES.length;
  }
}
