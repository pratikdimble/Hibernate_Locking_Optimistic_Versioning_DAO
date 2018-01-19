package com.pratik.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;



@Entity
@Table(name="BankAccount_Lock_Opt")

public class BankAccount {

	private int id;
    private String name;
    private float balance;
    private int version;
    
    @Id
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	
	@Version
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	@Override
	public String toString() {
		return "BankAccount [id=" + id + ", name=" + name + ", balance=" + balance + ", version=" + version + "]";
	}

	 
    


}
