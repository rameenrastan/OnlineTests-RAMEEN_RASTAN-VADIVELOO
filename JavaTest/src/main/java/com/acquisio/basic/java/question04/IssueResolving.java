package com.acquisio.basic.java.question04;

/**
 * QUESTION 04: StackOverflow
 * This program crashes after throwing StackOverflowError exception:
 * Fix the factorial method.
 *
 * IMPORTANT: Add all missing javadoc that you think is necessary.
 */
public class IssueResolving {
    public static void main(String[] args) {
        IssueResolving instance = new IssueResolving();
        System.out.println(instance.factorial(7));
    }

    private int factorial(int n) {
        
        //base case
        if(n==1 || n==0){
        	
        	return 1;
        	
        }
        else{
        return n * factorial(n-1);
        }
    }

}
