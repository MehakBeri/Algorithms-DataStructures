/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.ds;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Mehak Beri
 */
public class sets {
    public static void main(String[] args)
{
	Set<Integer> s= new HashSet<>();
	s.add(10);
	s.add(5);
	s.add(1);
        s.add(15);
	s.add(50);
	s.add(0);
	
	Iterator<Integer> it= s.iterator();
        System.out.println("hash set");
	while(it.hasNext())
	{
		
		System.out.println(it.next());
	}
        
        List<Integer> l= new ArrayList<>(s);
        System.out.println("Hashet to list conversion: "+l);
        Set<Integer> a= new LinkedHashSet<>();
	a.add(10);
	a.add(5);
	a.add(1);
        a.add(15);
	a.add(50);
	a.add(0);
	
	Iterator<Integer> it1= a.iterator();
        System.out.println("linked hash set");
	while(it1.hasNext())
	{
		
		System.out.println(it1.next());
	}
        
         Set<Integer> b= new TreeSet<>();
	b.add(10);
	b.add(5);
	b.add(1);
        b.add(15);
	b.add(50);
	b.add(0);
	
	Iterator<Integer> it2= b.iterator();
        System.out.println("tree set");
	while(it2.hasNext())
	{
		
		System.out.println(it2.next());
	}


}

}
