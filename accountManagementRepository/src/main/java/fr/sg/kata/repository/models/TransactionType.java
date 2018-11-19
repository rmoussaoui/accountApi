package fr.sg.kata.repository.models;

public enum TransactionType {
	
	D ("Deposit")
	,W ("Withdrawal");
	
	private String name;
	
	TransactionType(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}

}
