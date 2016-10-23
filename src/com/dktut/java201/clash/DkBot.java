package com.dktut.java201.clash;

public class DkBot extends AbstractBot implements Player {
	public int id;
	
	@Override
	public int getId() {
		return id;
	}
	
	public DkBot(int id) {
		this.id = id;
	}
}
