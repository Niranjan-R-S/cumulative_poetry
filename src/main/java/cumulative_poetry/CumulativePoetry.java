package cumulative_poetry;
import poetry_application.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import poetry.*;
import static constants.Constants.*;

public class CumulativePoetry{
  public ApplicationFlags flags;
  public Poetry poetry;

  public CumulativePoetry(ApplicationFlags flags){
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

  public List<String> getPoetryTale(){
    if(! this.flags.revealForDay.equals("")){
        poetry = new PoetryTaleForDay();
    }
    else if(this.flags.recite){
        poetry = new WholePoetry();
    }
    else{
        poetry = new NotPoetryProblem();
    }
    return poetry.revealPoetry(this);
  }
}
