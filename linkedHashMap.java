/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.ds;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author Mehak Beri
 */
public class linkedHashMap {
    public static void main(String[] args){
    int[] arr = {1,2,3,10,3,2,1,4,56};
		LinkedHashMap<Integer, Integer> frequency= new LinkedHashMap<>();
		for(int i=0; i<arr.length; i++)
		{
			frequency.put(arr[i],frequency.getOrDefault(arr[i],0)+1);
		}
		for(Map.Entry<Integer,Integer> e: frequency.entrySet())
		{
			System.out.println("The frequency for "+e.getKey()+" is: "+e.getValue());
		}
                frequency.putIfAbsent(4,11);
                frequency.putIfAbsent(34,1);
                for(Integer j: frequency.keySet())
                {
                    System.out.println(j+":"+frequency.get(j));
                }
    }
}
