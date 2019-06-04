package poetry;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import cumulative_poetry.CumulativePoetry;
import static constants.Constants.*;

public class WholePoetry implements Poetry{

  public String revealPoetry(CumulativePoetry getPoetryTale) {
    String wholePoem = IntStream.range(MIN_DAY_LIMIT, TALES.length)
    .mapToObj(dayValue -> {
      final String taleForDay = getPoetryTale.getPoetryForDay(dayValue + 1);
      return String.format("Day %d -\n", dayValue + 1).concat(taleForDay + "\n");
    }).collect(Collectors.joining());
    return wholePoem;
  }
}
