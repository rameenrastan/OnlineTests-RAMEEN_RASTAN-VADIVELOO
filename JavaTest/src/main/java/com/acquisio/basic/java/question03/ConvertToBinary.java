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
       instance.convertToBinary(17);
    }

    private void convertToBinary(int val) {
    	
    	if(val > 0){
    		
    		convertToBinary(val/2);
    		
    		System.out.print(val % 2 + "");
    		
    	}
    }
}

