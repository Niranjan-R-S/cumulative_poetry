package cumulative_poetry;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import poetry.*;

public class CumulativePoetry{
  public final int MIN_DAY_LIMIT;
  public final String[] tales;
  public final String REVEAL_FOR_DAY = "--reveal-for-day";
  public final String RECITE = "--recite";
  public final String DAY_VALUE = "for_which_day";
  public HashMap<String, Object> flags;
  public Poetry poetry;

  CumulativePoetry(HashMap<String, Object> flags){
    this.MIN_DAY_LIMIT = 0;
    this.flags = flags;
    this.tales = new String[]{
      " the horse and the hound and the horn that belonged to",
      " the farmer sowing his corn that kept",
      " the rooster that crowed in the morn that woke",
      " the priest all shaven and shorn that married",
      " the man all tattered and torn that kissed",
      " the maiden all forlorn that milked",
      " that cow with the crumpled horn that tossed",
      " the dog that worried",
      " the cat that killed",
      " the rat that ate",
      " the malth that lay in",
      " the house that Jack built"
    };
  }

  public String revealTaleForDay(int dayValue){
    return this.tales[dayValue];
  }

  public String getPoetryForDay(int dayValue){
    String taleForDay = IntStream.range(this.tales.length - dayValue, this.tales.length)
    .mapToObj(day -> this.revealTaleForDay(day))
    .collect(Collectors.joining());
    return "This is".concat(taleForDay).concat(".");
  }

  public String getPoetryTale(){
    if((Boolean)this.flags.get(this.REVEAL_FOR_DAY)){
        poetry = new PoetryTaleForDay(this);
    }
    else if((Boolean)this.flags.get(this.RECITE)){
        poetry = new WholePoetry(this);
    }
    else{
        poetry = new NotPoetryProblem();
    }
    return poetry.revealPoetry();
  }
}
