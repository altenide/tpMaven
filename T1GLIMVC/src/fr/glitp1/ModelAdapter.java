package fr.glitp1;

import java.util.Observable;

public class ModelAdapter extends Observable implements IModel
{

	@Override
	public void addItem() {
		System.out.println("Add Item");
		
	}

	
	
	
}
