/**
 *
 * QUESTION 3
 *
 * Mark Alexander
 *
 * 20112145
 *
 * COMP503
 *
 * */

import java.util.ArrayList;
import java.util.Collections;

public class FruitListModel {

	private ArrayList<String> fruits;
	private int amountRemoved;

	public int getAmountRemoved() {
		return this.amountRemoved;
	}


	public void setAmountRemoved(int amountRemoved) {
		this.amountRemoved = amountRemoved;
	}


	public FruitListModel(){
		this.fruits = new ArrayList<String>();
	}


	public void removeFruit(int index)
	{
		if((index >= 0)&(index < this.fruits.size()))
		{
			this.fruits.remove(index);
			this.amountRemoved++;
		}
	}

	public void addFruit(String fruitName) {
		this.fruits.add(fruitName);
		Collections.sort(this.fruits);
	}

	public String[] toList() {

		String[] pArray = new String[this.fruits.size()];

		for(int i=0;i<pArray.length;i++)
		{
			pArray[i] = this.fruits.get(i);
		}

		return pArray;
	}

	public int getSize() {
		return this.fruits.size();
	}

	public boolean contains(String inputText)
	{
		return fruits.contains(inputText);
	}







}
