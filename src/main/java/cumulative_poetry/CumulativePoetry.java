package cumulative_poetry;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import poetry.*;
import static constants.Constants.*;

public class CumulativePoetry{
  public HashMap<String, Object> flags;
  public Poetry poetry;

  public CumulativePoetry(HashMap<String, Object> flags){
    this.flags = flags;
  }

  public String revealTaleForDay(int dayValue){
    return TALES[dayValue];
  }

  public String getPoetryForDay(int dayValue){
    String taleForDay = IntStream.range(TALES.length - dayValue, TALES.length)
    .mapToObj(day -> this.revealTaleForDay(day))
    .collect(Collectors.joining());
    return "This is".concat(taleForDay).concat(".");
  }

  public String getPoetryTale(){
    if((Boolean)this.flags.get(REVEAL_FOR_DAY)){
        poetry = new PoetryTaleForDay();
    }
    else if((Boolean)this.flags.get(RECITE)){
        poetry = new WholePoetry();
    }
    else{
        poetry = new NotPoetryProblem();
    }
    return poetry.revealPoetry(this);
  }
}
