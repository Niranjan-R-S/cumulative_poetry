package poetry;
import cumulative_poetry.CumulativePoetry;
import static cumulative_poetry.Constants.*;

public class PoetryTaleForDay implements Poetry{
  public CumulativePoetry getPoetryTale;

  public PoetryTaleForDay(CumulativePoetry getPoetryTale){
      this.getPoetryTale = getPoetryTale;
  }

  public String revealPoetry(){
    final Integer dayValue = this.getDayValue();
    if(this.checkDayWithinRange(dayValue)){
      return this.getPoetryTale.getPoetryForDay(dayValue);
    }
    return "Day value is outside the range";
  }

  public Integer getDayValue(){
    return Integer.parseInt((String)this.getPoetryTale.flags.get(DAY_VALUE));
  }

  public Boolean checkDayWithinRange(Integer dayValue){
    return dayValue > MIN_DAY_LIMIT &&  dayValue <= this.getPoetryTale.tales.length;
  }
}
