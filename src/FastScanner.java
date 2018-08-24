import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class FastScanner
{
  private final BufferedReader reader;
  private StringTokenizer tokenizer;

  public FastScanner(InputStream inputStream)
  {
    this.reader = new BufferedReader(new InputStreamReader(inputStream));
  }

  public String nextToken() throws IOException
  {
    while (tokenizer == null || !tokenizer.hasMoreElements())
      tokenizer = new StringTokenizer(reader.readLine());
    return tokenizer.nextToken();
  }

  public int nextInt() throws NumberFormatException, IOException
  {
    return Integer.parseInt(nextToken());
  }

  public long nextLong() throws NumberFormatException, IOException
  {
    return Long.parseLong(nextToken());
  }

  public double nextDouble() throws NumberFormatException, IOException
  {
    return Double.parseDouble(nextToken());
  }

  public String nextLine() throws IOException
  {
    tokenizer = null;
    return reader.readLine();
  }
}
