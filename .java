import java.util.*;
import java.lang.*;
import java.io.*;

class Hello {
	public static void main (String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String str12313=sc.nextLine();
		while(n>0)
		{
		    n--;
		    String str1=sc.nextLine();
		    check(str1);
		}
	}
   public static void check(String str)
     {
         if(str.length()<=1)
         {
             System.out.println(str);
             return;
         }
         String n=new String();
         int count=0;
         for(int i=0;i<str.length();i++)
         {
             while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1))
             {
                 if(i<str.length()-2 &&str.charAt(i)!=str.charAt(i+2))
                 {
                   i=i+2;
                 }
                 else
                 {
                   i++;
                 }
                 count++;
             }
             if(i!=str.length()-1)
             {
               n=n+str.charAt(i);
             }
             else
             {
                 if(i==str.length()-1 && str.charAt(i)!=str.charAt(i-1))
                 {
                   n=n+str.charAt(i);
                 }
             }
         }
         if(count>0)
         {
          check(n);
         }
         else
         {
            System.out.println(n);
         }
     }
}
