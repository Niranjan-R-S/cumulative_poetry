package cumulative_poetry;
import java.util.*;

public class App{
  List<String> flags;
  final String REVEAL_FOR_DAY = "--reveal-for-day";
  final String RECITE = "--recite";
  final String DAY_VALUE = "for_which_day";

  App(String[] args){
    flags = Arrays.asList(args);
  }

  public HashMap<String, Object> parseArgs(){
    HashMap<String, Object> arguments = new HashMap<String, Object>();
    arguments.put(this.REVEAL_FOR_DAY, this.flags.contains(this.REVEAL_FOR_DAY));
    arguments.put(this.RECITE, this.flags.contains(this.RECITE));
    arguments.put(this.DAY_VALUE, this.flags.contains(this.REVEAL_FOR_DAY) ? "" + this.flags.get(this.flags.indexOf(this.REVEAL_FOR_DAY) + 1) : "0");
    return arguments;
  }

  public String getPoetryTale(){
    CumulativePoetry poetry = new CumulativePoetry(this.parseArgs());
    String finalPoetry = poetry.getPoetryTale();
    System.out.println(finalPoetry);
    return finalPoetry;
  }

  public static void main(String[] args) {
      App app = new App(args);
      String finalPoetry = app.getPoetryTale();
  }
}
