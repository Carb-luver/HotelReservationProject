package hotel;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="users")
public class User implements Serializable {

    @Id
    @Column(name="ID")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long Id;

    @Column(name="Phone", columnDefinition="VARCHAR", nullable = false)
    private String phone;

    @Column(name="Password", columnDefinition="VARCHAR", nullable = false)
    private String password;

    @Column(name="FirstName", columnDefinition="VARCHAR", nullable = false)
    private String firstName;

    @Column(name="LastName", columnDefinition="VARCHAR", nullable = false)
    private String lastName;

    @Enumerated (EnumType.ORDINAL)
    @Column(name="Role", columnDefinition="BIGINT", nullable = false)
    private UserRole role;

    public User(String phone, String password, String firstName, String lastName, UserRole role) {
        this.phone = phone;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
    }
<<<<<<< Updated upstream
    
    public long getId() {
=======

	public User() {

	}

	public long getId() {
>>>>>>> Stashed changes
        return Id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

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

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }
}