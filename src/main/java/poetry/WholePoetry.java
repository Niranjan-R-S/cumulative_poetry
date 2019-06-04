package poetry;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import cumulative_poetry.CumulativePoetry;
import static constants.Constants.*;
import java.util.*;

public class WholePoetry implements Poetry{

  public List<String> revealPoetry(CumulativePoetry poetry) {
    List<String> poems = IntStream.range(MIN_DAY_LIMIT, TALES.length)
    .mapToObj(dayValue -> poetry.getPoetryForDay(dayValue + 1))
    .collect(Collectors.toList());
    return poems;
  }
}
