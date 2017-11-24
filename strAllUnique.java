/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.ds;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Mehak Beri
 */
public class strAllUnique {
    public static void main(String[] args)
{
	String input1="abcbcbabc";
String input2="abs";
System.out.println(isUniqueChars(input1));
System.out.println(isUnique(input2));
}

public static boolean isUnique(String input1)
{
	HashMap<Character,Integer> hmap= new HashMap<>();
for(int i=0; i<input1.length(); i++)
{
        Character c= input1.charAt(i);
	hmap.put(c,hmap.getOrDefault(c,0)+1);
}
for(Map.Entry<Character,Integer> e: hmap.entrySet())
{
	if(e.getValue()>1)
	return false;
}
return true;
}

//method given in book

public static boolean isUniqueChars(String str)
{
    int checker=0;
    for(int i=0; i<str.length();++i)
    {
        int val=str.charAt(i)-'a';
        System.out.println("value for "+str.charAt(i)+" is: "+val);
        System.out.println("l<<val: ");
        System.out.println(1<<val);
        System.out.println("l>>val: ");
        System.out.println(1>>val);
        System.out.println(checker&(1<<val));
        if((checker&(1<<val))>0) return false;
        checker |= (1<<val);
        System.out.println("updated checker value: "+checker);
    }
    return true;
}

}
