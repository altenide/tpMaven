package fr.glitp1;

import java.util.Observable;
import java.util.Observer;

public class ModelAdapter extends Observable implements IModel {

	private Item item;

	public void addItem(Poste poste) {
		item.addItem(poste);
	}

	public Item getItem() {
		return item;
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delItem(Poste poste) {
		item.delItem(poste);

	}

	@Override
	public synchronized void addObserver(Observer o) {
		// TODO Auto-generated method stub
		super.addObserver(o);
	}

	@Override
	public synchronized void deleteObserver(Observer o) {
		// TODO Auto-generated method stub
		super.deleteObserver(o);
	}

	@Override
	public void notifyObservers(Object arg) {
		// TODO Auto-generated method stub
		super.notifyObservers(arg);
	}

}
