package hotel.dto;

import hotel.*;

public class UpdateUserRequest {
    String phone;
    String password;
    String firstName;
    String lastName;
    UserRole role;
    
	public UpdateUserRequest(String phone, String password, String firstName, String lastName, UserRole role) {
		this.phone = phone;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.role = role;
	
	}

	public String getPhone() {
		return phone;
	}

	void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public UserRole getRole() {
		return role;
	}

	void setRole(UserRole role) {
		this.role = role;
	}
    
	
	
    
    
    
    
}

