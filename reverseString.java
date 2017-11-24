/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.ds;

/**
 *
 * @author Mehak Beri
 */
public class reverseString {
    public static void main(String[] args)
{
	String in= "abcd abcd";
	String reversed= reverseString(in);
	System.out.println(reversed);

}

public static String reverseString(String s)
{
	int low=0;
	int high=s.length()-1;
	while((low<high))
	{
		s= swap(s, low, high);
		++low;
		--high;
	}
        
        return s;
}

public static String swap(String s, int low, int high)
{
	char l= s.charAt(low);
	char h= s.charAt(high);
	String s1= s.substring(0,low); 
               
	String mid=s.substring(low+1, high);
        
	String s2= s.substring(high+1,s.length());
        
	String ans= s1+h+mid+l+s2;
        
	return ans;
}

}
