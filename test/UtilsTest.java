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

  @Test
  void lowerBound1()
  {
    int[] a = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

    assertEquals(0, Utils.lowerBound(a, 0, 9, 0));
    assertEquals(1, Utils.lowerBound(a, 0, 9, 1));
    assertEquals(2, Utils.lowerBound(a, 0, 9, 2));
    assertEquals(3, Utils.lowerBound(a, 0, 9, 3));
    assertEquals(4, Utils.lowerBound(a, 0, 9, 4));
    assertEquals(5, Utils.lowerBound(a, 0, 9, 5));
    assertEquals(6, Utils.lowerBound(a, 0, 9, 6));
    assertEquals(7, Utils.lowerBound(a, 0, 9, 7));
    assertEquals(8, Utils.lowerBound(a, 0, 9, 8));
    assertEquals(9, Utils.lowerBound(a, 0, 9, 9));
  }

  @Test
  void lowerBound2()
  {
    int[] a = {1, 1, 1, 1, 4, 6, 6, 7, 9, 9};

    assertEquals(0, Utils.lowerBound(a, 0, 9, 1));
    assertEquals(4, Utils.lowerBound(a, 0, 9, 4));
    assertEquals(5, Utils.lowerBound(a, 0, 9, 6));
    assertEquals(7, Utils.lowerBound(a, 0, 9, 7));
    assertEquals(8, Utils.lowerBound(a, 0, 9, 9));

    assertEquals(0, Utils.lowerBound(a, 0, 2, 1));
    assertEquals(4, Utils.lowerBound(a, 4, 6, 4));
    assertEquals(5, Utils.lowerBound(a, 4, 6, 6));
    assertEquals(8, Utils.lowerBound(a, 8, 9, 9));
    assertEquals(9, Utils.lowerBound(a, 9, 9, 9));
  }
}