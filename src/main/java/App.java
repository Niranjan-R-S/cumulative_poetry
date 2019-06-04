package app;
import java.util.*;
import cumulative_poetry.*;
import constants.Constants;
import java.util.stream.*;

public class App{
  List<String> flags;

  App(String[] args){
    flags = Arrays.asList(args);
  }

  public HashMap<String, Object> parseArgs(){
    HashMap<String, Object> arguments = new HashMap<String, Object>();
    arguments.put(Constants.REVEAL_FOR_DAY, this.flags.contains(Constants.REVEAL_FOR_DAY));
    arguments.put(Constants.RECITE, this.flags.contains(Constants.RECITE));
    arguments.put(Constants.DAY_VALUE, this.flags.contains(Constants.REVEAL_FOR_DAY) ? "" + this.flags.get(this.flags.indexOf(Constants.REVEAL_FOR_DAY) + 1) : "0");
    return arguments;
  }

  public List<String> getPoetryTale(){
    CumulativePoetry poetry = new CumulativePoetry(this.parseArgs());
    return poetry.getPoetryTale();
  }

  public void revealPoetry(List<String> poems){
    if(poems.size() > 1){
      poems.stream().forEach(poemForDay -> {
        System.out.println(String.format("Day %d -\n", poems.indexOf(poemForDay) + 1).concat(poemForDay + "\n"));
      });
      return;
    }
    System.out.println(poems.get(0));
  }

  public static void main(String[] args) {
      App app = new App(args);
      app.revealPoetry(app.getPoetryTale());
  }
}
