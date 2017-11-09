package level3;
import java.io.*;
import java.util.*;

public class MakeHash
{
	public static int n;
	public static HashSet set = new HashSet();
	 public static String a[]=new String[100000];
	 public static int count=0;

    public void permute(String str, int l, int r)
    {
        if (l == r)
            {
            	a[count++]=str;
            }
        else
        {
            for (int i = l; i <= r; i++)
            {
                str = swap(str,l,i);
                permute(str, l+1, r);
                str = swap(str,l,i);
            }
        }
    }

    public String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

    public static boolean spellCheck(String s)throws IOException
     {	
		if(set == null) 
			return false;
		return set.contains(s);
     }		


		
}