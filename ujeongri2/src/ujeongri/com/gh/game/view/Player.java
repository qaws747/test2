package ujeongri.com.gh.main.view;

import java.util.ArrayList;

public class Player {
	
	private int hp;
	private int location;
	private String itemList;
	
	public Player(int hp, int location, String itemList) {
		super();
		this.hp = hp;
		this.location = location;
		this.itemList = itemList;
	}

	public int getHp() {
		return hp;
	}

	public int getLocation() {
		return location;
	}

	public String getItemList() {
		return itemList;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public void setLocation(int location) {
		this.location = location;
	}

	public void setItemList(String itemList) {
		this.itemList = itemList;
	}

	
	@Override
	public String toString() {
		return "Player [hp=" + hp + ", itemList=" + itemList + "]";
	}
	
	
	
	

}