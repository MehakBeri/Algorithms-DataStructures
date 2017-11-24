/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.ds;

import static java.lang.reflect.Array.set;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.stream.Collectors;

/**
 *
 * @author Mehak Beri
 */
public class removeDuplicateChars {
    public static void main(String[] args)
{
	String test="abc";
        String[] a= test.split("");
	LinkedHashSet<Character> hset= new LinkedHashSet<>();
        LinkedHashSet<String> hset2= new LinkedHashSet<>();
	for(int i=0; i<test.length();++i)
	{
		hset.add((Character)test.charAt(i));
                hset2.add(a[i]);
	}
//Character[] c= set.toArray(new Character[hset.size()]);
ArrayList<Character> ar= new ArrayList<>(hset);
//char[] c= ar.toArray();
String listString = ar.stream().map(Object::toString)
                        .collect(Collectors.joining(""));  //to convert arraylist to string
String answerByMethod2= String.join("", hset2);
String nondup= String.valueOf(ar);  //to convert array of chars to string
System.out.println(listString);
System.out.println(answerByMethod2);
}

}
