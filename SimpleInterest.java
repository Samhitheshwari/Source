package com.lulu.assessment;

public class SimpleInterest {

	public static void main(String[] args) {
		float principle, SimpleInterest;   
        principle = 12000;  
        int rate = 17; 
        int time = 4;  
        SimpleInterest  = (principle*rate*time)/100;   
        System.out.println("Total amount to be paid: " +SimpleInterest);  
        float amount= SimpleInterest+principle;
        System.out.println("Total amount to be paid after Loan duration ends "+amount);

	}

}
