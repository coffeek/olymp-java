import org.junit.jupiter.api.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest
{
  @Test
  void case1() throws IOException
  {
//    assertEquals("2 2 7 7\n" + "1 1 2 2\n" + "5 5 5 5", getResult("3\n" + "4\n" + "7 2 2 7\n" + "8\n" + "2 8 1 4 8 2 1 5\n" + "5\n" + "5 5 5 5 5"));
  }

  private static String trimRight(String s)
  {
    int i = s.length() - 1;
    while (i >= 0 && s.charAt(i) <= ' ')
    {
      i--;
    }
    return s.substring(0, i + 1);
  }

  private String getResult(String inputData) throws IOException
  {
    System.setIn(new ByteArrayInputStream(inputData.getBytes()));
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    System.setOut(new PrintStream(output));

    try (Solution solution = new Solution())
    {
      solution.Solve();
    }

    return trimRight(output.toString());
  }
}