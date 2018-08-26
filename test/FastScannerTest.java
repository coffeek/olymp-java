import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class FastScannerTest
{
  @Test
  void nextToken1() throws IOException
  {
    String data = "asdf f 0f0f $DDD$ _ \t asdf_f \t";

    FastScanner scanner = new FastScanner(new ByteArrayInputStream(data.getBytes()));

    assertEquals("asdf", scanner.nextToken());
    assertEquals("f", scanner.nextToken());
    assertEquals("0f0f", scanner.nextToken());
    assertEquals("$DDD$", scanner.nextToken());
    assertEquals("_", scanner.nextToken());
    assertEquals("asdf_f", scanner.nextToken());
    assertNull(scanner.nextToken());
  }

  @Test
  void nextToken2() throws IOException
  {
    String data = "\nasdf\r\n \"1234\" w \t   w ";

    FastScanner scanner = new FastScanner(new ByteArrayInputStream(data.getBytes()));

    assertEquals("asdf", scanner.nextToken());
    assertEquals("\"1234\"", scanner.nextToken());
    assertEquals("w", scanner.nextToken());
    assertEquals("w", scanner.nextToken());
    assertNull(scanner.nextToken());
  }

  @Test
  void nextInt() throws IOException
  {
    String data = " -1\n1 2\t 3\r\n -4  004";

    FastScanner scanner = new FastScanner(new ByteArrayInputStream(data.getBytes()));

    assertEquals(-1, scanner.nextInt());
    assertEquals(1, scanner.nextInt());
    assertEquals(2, scanner.nextInt());
    assertEquals(3, scanner.nextInt());
    assertEquals(-4, scanner.nextInt());
    assertEquals(4, scanner.nextInt());
  }

  @Test
  void nextLong() throws IOException
  {
    String data = " 12345678910111213\t -9876543210123 000";

    FastScanner scanner = new FastScanner(new ByteArrayInputStream(data.getBytes()));

    assertEquals(12345678910111213L, scanner.nextLong());
    assertEquals(-9876543210123L, scanner.nextLong());
    assertEquals(0L, scanner.nextLong());
  }

  @Test
  void nextDouble() throws IOException
  {
    String data = "-0.64999e10 11\r\n 50.00004";

    FastScanner scanner = new FastScanner(new ByteArrayInputStream(data.getBytes()));

    assertEquals(-0.64999e10, scanner.nextDouble());
    assertEquals(11.0, scanner.nextDouble());
    assertEquals(50.00004, scanner.nextDouble());
  }

  @Test
  void nextLine() throws IOException
  {
    String data = "\r\n asdf d\t\n\"'d\n";

    FastScanner scanner = new FastScanner(new ByteArrayInputStream(data.getBytes()));

    assertEquals("", scanner.nextLine());
    assertEquals(" asdf d\t", scanner.nextLine());
    assertEquals("\"'d", scanner.nextLine());
    assertNull(scanner.nextLine());
  }
}