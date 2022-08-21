package com.oop.encapsulation;

public class Account {
	private int accountNo;
    private String accountName;
    private String accountAddress;
    
    public Account(int accountNo, String accountName, String accountAddress){
            this.accountNo = accountNo;
            this.accountName = accountName;
            this.accountAddress = accountAddress;
    }
    
    public void setAccountNo(int accountNo){
        this.accountNo = accountNo;
    }
    
    public void setAccountName(String accountName){
        this.accountName = accountName;
    }
    
    public void setAccountAddress(String accountAddress){
        this.accountAddress = accountAddress;
    }
    
    public void displayAccount(){
        System.out.println("Account No: " + accountNo);
        System.out.println("Account Name: " + accountName);
        System.out.println("Account Address: " + accountAddress);
    }

}
