package org.hillel.it.easy.model.entity;

import java.util.Date;

public abstract class BaseEntity {
	private final int id;
	private Date createdOn;
	private Date lastEditedOn;
	private User createdBy;
	private User lastEditedBy;

}
