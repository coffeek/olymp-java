import java.io.*;
import java.util.StringTokenizer;

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