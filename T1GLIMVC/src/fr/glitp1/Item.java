/**
 * 
 */
package fr.glitp1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Yvanne & Olivier The Item
 */
public class Item implements IModel {

	private List<Poste> items; // Tableau d'observateurs.
	private String title;

	public Item(String title) {
		this.title = title;
		this.items = new ArrayList<Poste>();
	}

	public void addItem(Poste poste) {
		items.add(poste);
	}

	public void delItem(Poste poste) {
		items.remove(poste);
	}

	public String getTitle() {
		return title;
	}

	public Item(String title, List<Poste> items) {
		super();
		this.items = items;
	}
}
