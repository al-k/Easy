package org.hillel.it.easy.persistance.inmemory;

import java.util.ArrayList;
import java.util.List;

import org.hillel.it.easy.model.entity.BaseEntity;

public class InMemoryBaseRepository<T extends BaseEntity> {
	protected List<T> dBase = new ArrayList<>();
	static private int currentID;

	public boolean add(T item) {
		if (item == null) {
			return false;
		}
		if (-1 == dBase.indexOf(item)) {
			item.setID(currentID + 1);
			if (dBase.add(item)) {
				currentID++;
				return true;
			}
		}
		return false;
	}

	public boolean update(T item) {
		if (item == null) {
			return false;
		}
		int itemIndex = dBase.indexOf(item);
		if (-1 != itemIndex) {
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
