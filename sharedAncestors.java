import java.io.*;
import java.util.*;
import java.util.stream.*;

class Solution {

  public static boolean haveSharedAncestor(List<List<Integer>> pairs, int nodeA, int nodeB) {
    // IMPLEMENTATION GOES HERE
    HashMap<Integer,ArrayList<Integer>> h= new HashMap<Integer,ArrayList<Integer>>();
    for(List<Integer> l: pairs)
    {
          System.out.println("considering pair: "+l);
          if(h.containsKey(l.get(1)))
             {   
            System.out.println("already intialized key: "+l.get(1)+" has val: "+h.get(l.get(1)));
            ArrayList<Integer> temp= h.get(l.get(1));
            temp.add(l.get(0));
            System.out.println("added val "+temp);
            h.put(l.get(1),temp); 
            System.out.println("key: "+l.get(1)+" val: "+temp);
             }
             else
             {
              
              h.put(l.get(1),new ArrayList<Integer>());
                ArrayList<Integer> temp2= h.get(l.get(1));
            temp2.add(l.get(0));
               h.put(l.get(1),temp2);
               System.out.println("initialized: key: "+l.get(1)+" val: "+temp2);
             }
             
             
    }
    ArrayList<Integer> a_anc= new ArrayList<Integer>();
    ArrayList<Integer> b_anc= new ArrayList<Integer>();
    
    a_anc= listAnc(nodeA,h,a_anc);
    b_anc= listAnc(nodeB, h,b_anc);
    
    System.out.println(a_anc);
    System.out.println(b_anc);
    
    for(Integer t: a_anc)
             {
               if(b_anc.contains(t))
               {
                 return true;
               }
             }
      
      
    return false;
  }
             
  public static ArrayList<Integer> listAnc(int node, HashMap<Integer, ArrayList<Integer>> h, ArrayList<Integer> ans){
    
    if(h.get(node)==null)
    {
      System.out.println("returning "+ ans);
      return ans; 
    }
    else
    {
       for(Integer i: h.get(node))
       {
          ans.add(i); 
          System.out.println("inside rec, "+ ans);
          listAnc(i,h,ans);
       }
    }
    return ans;
    
  }


  // START TEST CASES
  //
  // You can add test cases below. Each test case should be an instance of Test
  // constructed with:
  //
  // Test(String name, List<List<Integer>> pairs, int nodeA, int nodeB, boolean expectedOutput);
  //

  private static final List<Test> tests = Arrays.asList(
    new Test(
      // name
      "sample input #1",
      // pairs
      Arrays.asList(
        Arrays.asList(1, 3),
        Arrays.asList(2, 3),
        Arrays.asList(3, 6),
        Arrays.asList(5, 6),
        Arrays.asList(5, 7),
        Arrays.asList(4, 5),
        Arrays.asList(4, 8),
        Arrays.asList(8, 9)
      ),
      // nodeA
      3,
      // nodeB
      8,
      // expectedOutput
      false
    ), 
    new Test(
      // name
      "sample input #2",
      // pairs
      Arrays.asList(
        Arrays.asList(1, 3),
        Arrays.asList(2, 3),
        Arrays.asList(3, 6),
        Arrays.asList(5, 6),
        Arrays.asList(5, 7),
        Arrays.asList(4, 5),
        Arrays.asList(4, 8),
        Arrays.asList(8, 9)
      ),
      // nodeA
      5,
      // nodeB
      8,
      // expectedOutput
      true
    ), 
    new Test(
      // name
      "sample input #3",
      // pairs
      Arrays.asList(
        Arrays.asList(1, 3),
        Arrays.asList(2, 3),
        Arrays.asList(3, 6),
        Arrays.asList(5, 6),
        Arrays.asList(5, 7),
        Arrays.asList(4, 5),
        Arrays.asList(4, 8),
        Arrays.asList(8, 9)
      ),
      // nodeA
      6,
      // nodeB
      8,
      // expectedOutput
      true
    )
  );


  // END TEST CASES
  // DO NOT MODIFY BELOW THIS LINE

  private static class Test {

    public String name;
    public List<List<Integer>> pairs;
    public int nodeA;
    public int nodeB;
    public boolean expectedOutput;

    public Test(String name, List<List<Integer>> pairs, int nodeA, int nodeB, boolean expectedOutput) {
      this.name = name;
      this.pairs = pairs;
      this.nodeA = nodeA;
      this.nodeB = nodeB;
      this.expectedOutput = expectedOutput;
    }
  }

  private static boolean equalOutputs(boolean a, boolean b) {
    return a == b;
  }

  public static void main(String[] args) {
    int passed = 0;
    for (Test test : tests) {
      try {
        System.out.printf("==> Testing %s...\n", test.name);
        boolean actualOutput = haveSharedAncestor(test.pairs, test.nodeA, test.nodeB);
        if (equalOutputs(actualOutput, test.expectedOutput)) {
          System.out.println("PASS");
          passed++;
        } else {
          System.out.println("FAIL");
          System.out.printf("Expected output: %s\n", test.expectedOutput);
          System.out.printf("Actual output: %s\n", actualOutput);
        }
      } catch (Exception e) {
        System.out.println("FAIL");
        System.out.println(e);
      }
    }
    System.out.printf("==> Passed %d of %d tests\n", passed, tests.size());
  }
}
