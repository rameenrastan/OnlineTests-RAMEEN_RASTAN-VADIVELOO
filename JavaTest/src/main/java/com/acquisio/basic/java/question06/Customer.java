package com.acquisio.basic.java.question06;

class Customer {
    String type; // enterprise, professional or private
    double monthlyFee;

    public Customer(String type, double monthlyFee) {
        this.type = type;
        this.monthlyFee = monthlyFee;
    }
    
    //method to add a customer without directly calling constructor (abstracts creation process)
    public Customer makeCustomer(String type, double monthleeFee){
    	
    	Customer customer = new Customer(type,monthleeFee);
    	return customer;
    	
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getMonthlyFee() {
        return monthlyFee;
    }

    public void setMonthlyFee(double monthlyFee) {
        this.monthlyFee = monthlyFee;
    }
}
