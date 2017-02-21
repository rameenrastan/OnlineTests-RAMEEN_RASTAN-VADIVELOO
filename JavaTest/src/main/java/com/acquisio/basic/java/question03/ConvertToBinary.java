package com.acquisio.basic.java.question03;

/**
 * QUESTION 03: ToBinary
 * Write a recursive function that allows converting a
 * integer number into a binary number.
 * For example, with the value 22, the method should return "10110"
 * <p>
 * If you need more classes, simply define them inline.
 *
 * IMPORTANT: Add all missing javadoc that you think is necessary.
 */
public class ConvertToBinary {

    public static void main(String[] args) {
        ConvertToBinary instance = new ConvertToBinary();
        System.out.println(instance.convertToBinary(17));
    }

    private String convertToBinary(int val) {
    	
    	//base case
    	if(val==0){
    		
    		return "";
    		
    	}
    	//recursive call (val%2 will return 1 for odd numbers and 0 for even numbers), append this to string 
    	//then divide by two and repeat the call
    	else{
    		
    		return convertToBinary(val/2) + Integer.toString(val % 2); 
    		
    	}
    }
}

