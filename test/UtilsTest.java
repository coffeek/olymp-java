import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilsTest
{
  @Test
  void reverse()
  {
    char[] a = {'a', 'b', 'c'};

    Utils.reverse(a);

    char[] expected = {'c', 'b', 'a'};
    assertArrayEquals(expected, a);
  }

  @Test
  void reverse1()
  {
    char[] a = {'a', 'b', 'c'};

    Utils.reverse(a, 1, 2);

    char[] expected = {'a', 'c', 'b'};
    assertArrayEquals(expected, a);
  }

  @Test
  void reverse2()
  {
    char[] a = {'a'};

    Utils.reverse(a, 0, 0);

    char[] expected = {'a'};
    assertArrayEquals(expected, a);
  }

  @Test
  void smod()
  {
  }

  @Test
  void mpow()
  {
  }
}