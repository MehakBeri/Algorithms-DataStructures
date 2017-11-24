/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.ds;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *to avoid concurrent modification exception
 * 
 * An element of a HashSet is supposed to have a stable hashCode, but you are mutating them as you iterate over the outer set. That fails in unpredictable, but documented ways.
 * @author Mehak Beri
 */
public class arraylist_dynamicDeletion {
    public static void main(String[] args)
{
	List<String> arrlist= new ArrayList<>();
	arrlist.add("tom");
        arrlist.add("cat");
        arrlist.add("is");
        arrlist.add("fun");
        
        System.out.println("array list: "+arrlist);
        
        ArrayList<Integer> a= new ArrayList<>();
        a.add(1);
        a.add(5);
        a.add(10);
        a.add(20);
        
        System.out.println("before: "+a);
        //unpredictable cz does not delete 20. in order to add an element dynamically, clone the list, add new elements and thn copy the list one to list two using addAll
        Iterator<Integer> it= a.iterator(); 
        while(it.hasNext())
        {
            Integer current= it.next();
            System.out.println("current: "+current);
            if(current>5)
            {
                a.remove(current);
            }
        }
        System.out.println("after: "+a);
}

}
