package hotel.UserController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonProperty;

import hotel.*;
import hotel.UserRepository.UserRepository;
import hotel.UserService.UserService;
import hotel.dto.CreateUserRequest;
import hotel.dto.UpdateUserRequest;

@RestController
public class UserController {
	
	@RequestMapping("/user/createUser")
    public long createUser(@JsonProperty @RequestBody CreateUserRequest request){
    	User user = new User(request);
    	UserService.createUser(user);
        return user.getId();
    }

	@RequestMapping("/user/findUserById")
    public User findUserById(@PathVariable long id) {
		User user = UserService.findUserById(id);
        return user;
    }
	
	@RequestMapping("/user/findUserByPhone")
    public User findUserByPhone(@PathVariable String phone){
    	User user = UserService.findUserByPhone(phone);
        return user;
    }
    
	@RequestMapping("/user/findAllUsers")
    public List<User> findAllUsers() {
        List<User> userList = UserService.findAll();
        return userList;
    }
    
	@RequestMapping("/user/changePassword")
    public User changePassword(@PathVariable long id, @RequestParam String password){
		User user = UserService.findUserById(id);
		user.setPassword(password);
		UserService.createUser(user);
    	return user;
    }
	
	User changeUserInfo(@PathVariable long id, @RequestBody UpdateUserRequest request){
		User user = findUserById(id);
		user.setFirstName(request.getFirstName());
		user.setLastName(request.getLastName());
		user.setPassword(request.getPassword());
		user.setPhone(request.getPhone());
		user.setRole(request.getRole());
		return user;
	}
    
}
