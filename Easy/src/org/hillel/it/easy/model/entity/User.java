package org.hillel.it.easy.model.entity;

public class User extends BaseEntity {
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	private String email;
	private String password;
	private UserRole role; //enum
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public UserRole getRole() {
		return role;
	}
	public void setRole(UserRole role) {
		this.role = role;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
            return true;
        if (obj == null)
            return false;
//        if (getClass() != obj.getClass())
//            return false;
        if (!(obj instanceof User))
        	return false;
        User user = (User) obj;
        return email == user.email;  // maybe egetEmail() ????
	}
	
	@Override
	public int hashCode() {
		int result = 77;
		return result = 7 * result + (email == null ? 0 : email.hashCode());
	}

}
