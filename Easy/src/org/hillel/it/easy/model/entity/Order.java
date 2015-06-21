package org.hillel.it.easy.model.entity;

import java.util.Date;

public class Order extends BaseEntity {
	private ShoppingCart basket;
	private float totalCost;
	private int weight; // grams
	private int dimention; // dm3
	private boolean paymentConfirmed; // needed?
	private Date payedOn;
	private User user;
	private OrderStatus status; // enum 
	private String shippingCompany;
	private String trackingNumber;
    // orderNumber or just use ID?
	
	public ShoppingCart getBasket() {
		return basket;
	}
	public void setBasket(ShoppingCart basket) {
		this.basket = basket;
	}
	public float getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(float totalCost) {
		this.totalCost = totalCost;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getDimention() {
		return dimention;
	}
	public void setDimention(int dimention) {
		this.dimention = dimention;
	}
	public boolean isPaymentConfirmed() {
		return paymentConfirmed;
	}
	public void setPaymentConfirmed(boolean paymentConfirmed) {
		this.paymentConfirmed = paymentConfirmed;
	}
	public Date getPayedOn() {
		return payedOn;
	}
	public void setPayedOn(Date payedOn) {
		this.payedOn = payedOn;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public OrderStatus getStatus() {
		return status;
	}
	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	public String getShippingCompany() {
		return shippingCompany;
	}
	public void setShippingCompany(String shippingCompany) {
		this.shippingCompany = shippingCompany;
	}
	public String getTrackingNumber() {
		return trackingNumber;
	}
	public void setTrackingNumber(String trackingNumber) {
		this.trackingNumber = trackingNumber;
	}

	
}
