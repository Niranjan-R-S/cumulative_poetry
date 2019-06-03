package poetry;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import cumulative_poetry.CumulativePoetry;

public class WholePoetry implements Poetry{
  public CumulativePoetry getPoetryTale;

  public WholePoetry(CumulativePoetry getPoetryTale){
      this.getPoetryTale = getPoetryTale;
  }

  public String revealPoetry() {
    String wholePoem = IntStream.range(this.getPoetryTale.MIN_DAY_LIMIT, this.getPoetryTale.tales.length)
    .mapToObj(dayValue -> {
      final String taleForDay = this.getPoetryTale.getPoetryForDay(dayValue + 1);
      return String.format("Day %d -\n", dayValue + 1).concat(taleForDay + "\n");
    }).collect(Collectors.joining());
    return wholePoem;
  }
}
