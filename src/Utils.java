@SuppressWarnings("unused")
class Utils
{
  public static void reverse(char[] a)
  {
    reverse(a, 0, a.length - 1);
  }

  public static void reverse(char[] a, int startIndex, int endIndex)
  {
    int l = startIndex;
    int r = endIndex;
    while (l < r)
    {
      char t = a[l];
      a[l] = a[r];
      a[r] = t;
      l++;
      r--;
    }
  }

  public int smod(int a, int m)
  {
    int t = a % m;
    if (t < 0)
      return m - t;
    return t;
  }

  public int mpow(long a, int n, int m)
  {
    a %= m;
    long result = 1;
    while (n > 0)
    {
      if (n % 2 != 0)
      {
        result = (result * (a % m)) % m;
        n--;
      }
      else
      {
        a = (a * a) % m;
        n /= 2;
      }
    }
    return (int) result;
  }
}
