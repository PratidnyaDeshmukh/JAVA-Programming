import java.util.*;
class BinaryString
{
  public static void main (String args[])
  {
    Scanner sc = new Scanner (System.in);
    System.out.println ("Enter String=");
    String str = sc.next ();
    StrBinary sb = new StrBinary ();
    boolean b = sb.isBinary (str);
    if (b == true)
      System.out.println (1);
    else
        System.out.println (0);
  }
}
class StrBinary
{
  boolean isBinary (String str)
  {
    char ch[] = str.toCharArray ();
    int i;
    for (i = 0; i < str.length (); i++)
    {
	   if (ch[i] != '0' && ch[i] != '1')
	   {
	      return false;
	   }
    }
    return true;
  }
}
