package hotel.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import hotel.*;
import hotel.Repository.UserRepository;

@Service
public class CreateUserRequest {
    String phone;
    String password;
    String firstName;
    String lastName;
    UserRole role;
    
    public CreateUserRequest(String phone, String password, String firstName, String lastName, UserRole role) {
		this.phone = phone;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.role = role;
    }

	public String getPhone() {
		return phone;
	}

	public String getPassword() {
		return password;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public UserRole getRole() {
		return role;
	}

	protected void setPhone(String phone) {
		this.phone = phone;
	}

	protected void setPassword(String password) {
		this.password = password;
	}

	protected void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	protected void setLastName(String lastName) {
		this.lastName = lastName;
	}

	protected void setRole(UserRole role) {
		this.role = role;
	}
	
	
   
}
