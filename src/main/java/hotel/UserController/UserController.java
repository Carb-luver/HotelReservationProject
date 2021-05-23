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

@RestController
@RequestMapping (value = "/User" , produces = {"application/json"}, consumes = {"application/json"})
public class UserController {

    public long createUser(@JsonProperty @RequestBody CreateUserRequest request){
    	User user = new User(request);
    	UserService.createUser(user);
        return user.getId();
    }

    public User findUserById(@PathVariable long id) {
		User user = UserService.findUserById(id);
        return user;
    }
    
    public User findUserByPhone(@PathVariable String phone){
    	User user = UserService.findUserByPhone(phone);
        return user;
    }
    
    //@Async
    public List<User> findAllUsers() {
        List<User> userList = UserService.findAll();
        return userList;
    }
    
    public User changePassword(@PathVariable long id, @RequestParam String password){
    	
		User user = UserService.findUserById(id);
		user.setPassword(password);
		UserService.createUser(user);
    	return user;
    }
    
}
