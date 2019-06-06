package application_flags;
import com.google.devtools.common.options.Option;
import com.google.devtools.common.options.OptionsBase;
import java.util.*;

public class ApplicationFlags extends OptionsBase {

  @Option(
      name = "help",
      abbrev = 'h',
      help = "Prints usage info.",
      defaultValue = "true"
    )
  public boolean help;

  @Option(
    name = "reveal-for-day",
    help = "Reveal tale for day",
    defaultValue = ""
    )
  public String revealForDay;

  @Option(
      name = "recite",
      help = "Recites whole poem",
      defaultValue = "false"
    )
  public boolean recite;
}
