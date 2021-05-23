package hotel.dto;

import hotel.*;

public class UpdateUserRequest {
    String phone;
    String password;
    String firstName;
    String lastName;
    UserRole role;
    
	public UpdateUserRequest(CreateUserRequest request, String phone, String password, String firstName, String lastName, UserRole role) {
		this.phone = phone;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.role = role;
		
		request.setPhone(phone);
		request.setPassword(password); 
		request.setFirstName(firstName);
		request.setLastName(lastName);
		request.setRole(role);	
	}
    
	
    
    
    
    
}

