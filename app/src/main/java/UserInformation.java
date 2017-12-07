/**
 * Created by santh on 12/5/2017.
 */

public class UserInformation {

        private String name;
        private String email;
        private String password;
        private String phone_num;
        private String city;

        public UserInformation(){

        }

        public UserInformation(String name,String email,String password, String phone_num,String city) {
            this.name = name;
            this.email = email;
            this.password=password;
            this.phone_num = phone_num;
            this.city = city;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPhone_num() {
            return phone_num;
        }

        public void setPhone_num(String phone_num) {
            this.phone_num = phone_num;
        }

}
