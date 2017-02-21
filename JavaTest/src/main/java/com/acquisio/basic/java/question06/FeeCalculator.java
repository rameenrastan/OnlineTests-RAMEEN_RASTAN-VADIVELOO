package com.acquisio.basic.java.question06;

public class FeeCalculator {
    static double sumFeesWithMargin(Customer ... customers) {
        double monthlyFees = 0.0d;
        for (Customer c : customers) {
        	
        	//switch statement is much more efficient than for loops for discrete/individual values
        	switch(c.type){
        	
        	case "enterprise":
        		
        		monthlyFees += c.monthlyFee * 1.10d;
        		break;
        		
        	
        	case "professional": 
        		
        		monthlyFees += c.monthlyFee * 1.20d;
        		break;
        		
        	
        	case "private":
        		
        		monthlyFees += c.monthlyFee * 1.30d;
        		break;
        		
        	
        	//it is now much easier to add new types of customers	
        	}
        	}
        

        return monthlyFees;
    }
}
