package org.hillel.it.easy.persistance.inmemory;

import java.util.ArrayList;
import java.util.List;

import org.hillel.it.easy.model.entity.BaseEntity;

public class InMemoryBaseRepository<T extends BaseEntity> {
	protected List<T> dBase = new ArrayList<>();
	static private int currentID;

	/**
	 * @param item to be appended to this list
	 * @return true if item is added, false if item already exist in List
	 */
	public boolean add(T item) {
		if (dBase.indexOf(item) == -1) {
			item.setID(++currentID);
			return dBase.add(item);
		}
		return false;
	}

	/**
	 * @param item replace existing element in the list 
	 * @return false if item is in the list, true if item is replaced
	 */
	public boolean update(T item) {
		int itemIndex = dBase.indexOf(item);
		if (itemIndex != -1) {
			dBase.set(itemIndex, item);
			return true;
		}
		return false;
	}

	public T getByID(int id) {
		for (T item : dBase) {
			if (id == item.getID()) {
				return item;
			}
		}
		return null;
	}

	public boolean delete(T item) {
		return dBase.remove(item);
	}

}
