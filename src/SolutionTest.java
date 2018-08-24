import org.junit.jupiter.api.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest
{
  @Test
  void case1() throws IOException
  {
//    assertEquals("qwerty", getResult("qwerty"));
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

    Solution solution = new Solution();
    solution.Solve();

    return trimRight(output.toString());
  }
}