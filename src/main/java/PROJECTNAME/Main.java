package PROJECTNAME;

import static briefj.CommandLineUtils.*;
import static briefj.BriefIO.*;
import tutorialj.Tutorial;

import com.beust.jcommander.Parameter;

/**
 * # PROJECTNAME
 * 
 * Installing from source
 * ----------------------
 * 
 * Requires: gradle, git, eclipse
 * 
 * - Clone the repository
 * - Type ``gradle eclipse`` from the root of the repository
 * - From eclipse:
 *   - ``Import`` in ``File`` menu
 *   - ``Import existing projects into workspace``
 *   - Select the root
 *   - Deselect ``Copy projects into workspace`` to avoid having duplicates
 * - You can call PROJECTNAME.Main from the command line via ``./PROJECTNAME``
 *   - Move the executable ``PROJECTNAME`` to a PATH folder (or add this folder to PATH)
 *   to have access from anywhere
 *   - Changes done via eclipse will be reflected right away
 */
@Tutorial(startTutorial = "README.md")
public class Main implements Runnable
{
  @Parameter(names = "--input", required = true)
  private String input;
  
  public static void main(String [] args)
  {
    start(new Main(), args);
  }

  @Override
  public void run()
  {
    System.out.println("Hello world");
    for (String line : readLines(input))
      System.out.println(line);
  }
}