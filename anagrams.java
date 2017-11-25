/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.ds;

import java.util.Arrays;

/**
 *
 * @author Mehak Beri
 */
public class anagrams {
    public static void main(String[] args)
{
	String inp1="anagram";
	String inp2="naaagrk";
	System.out.println(checkIfAnagram(inp1,inp2));

}
public static boolean checkIfAnagram(String s, String s2)
{
	String[] s_arr= s.toLowerCase().split("");
	String[] s2_arr= s2.toLowerCase().split("");
	Arrays.sort(s_arr);
	Arrays.sort(s2_arr);
	if(s_arr.length != s2_arr.length)
		return false;
	//for(int i=0; i<s_arr.length; i++)
	//{
		//if(!s_arr[i].equals(s2_arr[i]))
			//return false;
	//}
        //return true;
        return Arrays.equals(s_arr,s2_arr);
                
}

}
