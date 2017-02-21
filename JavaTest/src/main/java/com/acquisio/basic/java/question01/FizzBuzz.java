package com.acquisio.basic.java.question01;

/**
 * QUESTION 01: FizzBuzz
 * You have a program that receives a value, which we assume is a positive
 * integer. You need to loop on all integer value between 0 and the value
 * received. Ex.: If you receive 50, you must loop from 0 to 50.
 * <p>
 * The program must follow those rules:
 * - Must not print anything if the value cannot be divided by itself.
 * - Must print ‘Fizz’ if the value can be divided by 3.
 * - Must print ‘Buzz’ if the value can be divided by 5.
 * - Otherwise, print the current integer value in the loop.
 *
 * IMPORTANT: Add all missing javadoc that you think is necessary.
 */
public class FizzBuzz {
    public static void main(String[] args) {
        FizzBuzz main = new FizzBuzz();
        main.fizzBuzz(50);
    }

    private void fizzBuzz(int maxValue) {
       //loops through every integer value between 0 and the input value
    	for(int i=0; i<=maxValue; i++){
    		
    		//0 is the only value not divisble by itself, and therefore skip to next iteration
    		if(i == 0){
    			
    			//skips to next iteration (does not print)
    			continue;
    			
    		} 
    		//print "Fizz" if divisible by 3
    		if(i % 3 == 0){
    			
    			System.out.println("Fizz");
    			
    			
    		}
    		//print "Buzz" if divisible by 5
    		else if(i % 5 == 0){
    			
    			System.out.println("Buzz");
    		}
    		//else print current value
    		else{
    			
    			
    			System.out.println(i);
    			
    		}
    		
    		
    		
    	}
    }
}
