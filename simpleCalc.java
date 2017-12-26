import java.io.*;
import java.util.*;

/*
You are building an educational website and want to create a simple calculator for students to use. For now, the calculator will only allow addition and subtraction of positive integers.

Given an expression string usi4ng the "+" and "-" operators like "5+16-2", write a function to parse the string and evaluate the result.

Sample input/output:
"6+9-12" => 3
"1+2-3+4-5+6-7" => -2

 */

class Solution {
  public static void main(String[] args) {
      String expression = "6+9-12";
      char[] exprArr= expression.toCharArray();
      List<Integer> numbers= new ArrayList<>();
      List<Character> operands= new ArrayList<>();
      for(int i=0; i<exprArr.length;i++)
      {
        if(exprArr[i]=='+')
        {
             operands.add('+');
             System.out.println("added sum op");
        }
        else if(exprArr[i]=='-')
        {
          operands.add('-'); 
          System.out.println("added minus op");
        }
        else
        {
          String num= Character.toString(exprArr[i]);
          while((i+1<exprArr.length)&&((exprArr[i+1]!='+')&&(exprArr[i+1]!='-')))
                {
                  String addToNum= Character.toString(exprArr[i+1]);
                  num=num+addToNum;
                  i=i+1;
                     
                }
          numbers.add(Integer.valueOf(num));
          System.out.println("added number"+num);
        }
        
      }
        
                
         int numlen=0;  
         int opidx=0;
         int ans=0;
    int num2=0;
         int num1= numbers.get(0);
        while(numlen<numbers.size())
                {
                
                 for(int j=0; j<numbers.size();j++)
                {
                  
                   
                   if((j+1)<numbers.size())
                   {
                     
                     numlen++;
                  if(operands.get(opidx)=='+')
                  {
                    
                    
                    num2= numbers.get(j+1);
                     j=j+1;
                    ans=num1+num2;
                    System.out.println("num1: "+num1+" num2: "+num2);
                    System.out.println("ans at op + is: "+ans);
                    num1=ans;
                    j=j+1;
                    System.out.println(j);
                    opidx++;
                  }
                  else{
                   
                    
                    num2= numbers.get(j+1);
                    j=j+1;
                    ans=num1-num2;
                    System.out.println("num1: "+num1+" num2: "+num2);
                    System.out.println("ans at op - is: "+ans);
                    num1=ans;
                    j=j+1;
                    opidx++;
                    System.out.println(j);
                  }
                     
                   }
                  
                }
                  
                
                  numlen++;
                  
                }
                
                System.out.println(ans);
        
      
    
  }
}

