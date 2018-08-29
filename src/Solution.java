import java.io.*;
import java.util.*;

public final class Solution implements Closeable, AutoCloseable
{
  void Solve() throws NumberFormatException, IOException
  {
    // TODO: Coding here
  }

  private final FastScanner input;
  private final PrintWriter output;

  Solution()
  {
    input = new FastScanner(System.in);
    output = new PrintWriter(System.out);
  }

  public static void main(String[] args) throws IOException
  {
    try (Solution solution = new Solution())
    {
      solution.Solve();
    }
  }

  @Override
  public void close()
  {
    output.flush();
    output.close();
  }

  @SuppressWarnings("unused")
  class FastScanner
  {
    private static final int bufferSize = 64 * 1024;
    private final BufferedReader reader;
    private StringTokenizer tokenizer;

    FastScanner(InputStream inputStream)
    {
      this.reader = new BufferedReader(new InputStreamReader(inputStream), bufferSize);
    }

    String nextToken() throws IOException
    {
      while (tokenizer == null || !tokenizer.hasMoreTokens())
      {
        String line = reader.readLine();
        if (line == null)
        {
          tokenizer = null;
          return null;
        }
        tokenizer = new StringTokenizer(line);
      }
      return tokenizer.nextToken();
    }

    int[] readIntArray(int n) throws IOException
    {
      int[] a = new int[n];
      for (int i = 0; i < n; i++)
      {
        a[i] = nextInt();
      }
      return a;
    }

    long[] readLongArray(int n) throws IOException
    {
      long[] a = new long[n];
      for (int i = 0; i < n; i++)
      {
        a[i] = nextLong();
      }
      return a;
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
