package application;
import java.util.*;
import cumulative_poetry.*;
import constants.Constants;

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

  public String getPoetryTale(){
    CumulativePoetry poetry = new CumulativePoetry(this.parseArgs());
    String finalPoetry = poetry.getPoetryTale();
    return finalPoetry;
  }

  public static void main(String[] args) {
      App app = new App(args);
      System.out.println(app.getPoetryTale());
  }
}
