package poetry;
import cumulative_poetry.CumulativePoetry;
import java.util.*;

public class NotPoetryProblem implements Poetry{
  public List<String> revealPoetry(CumulativePoetry poetry){
    List<String> poems = new ArrayList();
    poems.add("Please enter a specific operation");
    return poems;
  }
}
