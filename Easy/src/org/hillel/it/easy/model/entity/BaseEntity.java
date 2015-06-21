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
//		if (this.id == 0) {
//			this.id = id;
//		}
	}
}
