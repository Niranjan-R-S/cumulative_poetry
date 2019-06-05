package poetry_application;
import java.util.*;
import cumulative_poetry.*;
import constants.Constants;
import java.util.stream.*;
import com.google.devtools.common.options.OptionsParser;

public class App{
  public ApplicationFlags flags;

  public App(String[] args){
      this.flags = this.parseArgs(args);
  }

  public ApplicationFlags parseArgs(String[] args){
    OptionsParser parser = OptionsParser.newOptionsParser(ApplicationFlags.class);
    parser.parseAndExitUponError(args);
    ApplicationFlags options = parser.getOptions(ApplicationFlags.class);
    return options;
  }

  public List<String> getPoetryTale(){
    CumulativePoetry poetry = new CumulativePoetry(this.flags);
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
