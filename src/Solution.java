import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.StringTokenizer;

public final class Solution
{
  void Solve() throws NumberFormatException, IOException
  {
    // TODO: Coding here
  }

  private final FastScanner input;
  private final PrintStream output;

  Solution()
  {
    input = new FastScanner(System.in);
    output = System.out;
  }

  public static void main(String[] args) throws IOException
  {
    Solution solution = new Solution();
    solution.Solve();
  }

  @SuppressWarnings("unused")
  class FastScanner
  {
    private final BufferedReader reader;
    private StringTokenizer tokenizer;

    FastScanner(InputStream inputStream)
    {
      this.reader = new BufferedReader(new InputStreamReader(inputStream));
    }

    String nextToken() throws IOException
    {
      while (tokenizer == null || !tokenizer.hasMoreTokens())
        tokenizer = new StringTokenizer(reader.readLine());
      return tokenizer.nextToken();
    }

    int nextInt() throws NumberFormatException, IOException
    {
      return Integer.parseInt(nextToken());
    }

    long nextLong() throws NumberFormatException, IOException
    {
      return Long.parseLong(nextToken());
    }

    double nextDouble() throws NumberFormatException, IOException
    {
      return Double.parseDouble(nextToken());
    }

    String nextLine() throws IOException
    {
      tokenizer = null;
      return reader.readLine();
    }
  }
}
