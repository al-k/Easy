package org.hillel.it.easy.model.entity;

import java.util.Date;

public class Order extends BaseEntity {
	private Basket basket;
	private float totalCost;
	private int weight; // grams
	private int dimention; // dm3
	private boolean paymentConfirmed; // needed?
	private Date payedOn;
	private User user;
	private int status; //enum? 
	private int paymentMethod; //enum? 
	private String shippingCompany;
	private String trackingNumber;
    // orderNumber or just use ID?

}
