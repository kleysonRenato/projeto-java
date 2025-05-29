import lombok. Getter; import lombok. Setter;
import java.util.Date;

@Getter @Setter 
class User{

private int id;

private String nameUser;
private String email;
private String password;
private RoleModel role; 
private Date createdAt;
private Date updatedAt;
private Date birthday;
}

public User(String newName, String newEmail, String newPassword, RoleModel newRole){
this.nameUser = newName;
this.email = newEmail;
this.password = newPassword;
this.role = newRole;
}

public void UpdateBirthday(Date newBirthDate){
this. birthday = newBirthDate;
}
