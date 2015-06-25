package org.hillel.it.easy.model.entity;

import java.util.Date;

public abstract class BaseEntity {
	private int id; 		// what about final?
	private Date createdOn;
	private Date lastEditedOn;
	private User createdBy;
	private User lastEditedBy;
	
	public Date getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
	public Date getLastEditedOn() {
		return lastEditedOn;
	}
	public void setLastEditedOn(Date lastEditedOn) {
		this.lastEditedOn = lastEditedOn;
	}
	public User getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(User createdBy) {
		this.createdBy = createdBy;
	}
	public User getLastEditedBy() {
		return lastEditedBy;
	}
	public void setLastEditedBy(User lastEditedBy) {
		this.lastEditedBy = lastEditedBy;
	}
	public int getID() {
		return id;
	}
	public void setID(int id) {
			this.id = id;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BaseEntity other = (BaseEntity) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
}
