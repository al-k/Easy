package org.hillel.it.easy.model.entity;

import java.awt.List;
import java.util.Date;

public class Basket {
	private final int id;
	private int status;
	private List booksList; // ?
	private float amount;
	private int weight; // grams
	private int dimention; // dm3
	private Date lastEditedOn;
	private User lastEditedBy;

}