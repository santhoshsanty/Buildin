package creationof.santy.app.buildin;

/**
 * Created by santh on 12/5/2017.
 */

public class UserInformation {
    private String name;
    private String email;
    private String pass;
    private String phone_num;
    private String city;

    public  UserInformation(){

    }

    public UserInformation(String name,String email,String password, String phone_num,String city) {
        this.name = name;
        this.email = email;
        this.pass = password;
        this.phone_num = phone_num;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String password) {
        this.pass = password;
    }

    public String getPhone_num() {
        return phone_num;
    }

    public void setPhone_num(String phone_num) {
        this.phone_num = phone_num;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

}
