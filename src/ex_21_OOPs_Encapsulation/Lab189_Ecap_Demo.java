package ex_21_OOPs_Encapsulation;

public class Lab189_Ecap_Demo {

    public static void main(String[] args) {
        VWOLogin vwoLogin = new VWOLogin("admin", "pass123");
        System.out.println(vwoLogin.password);
        vwoLogin.password = "345";
        System.out.println(vwoLogin.password);


        GoodVWOLogin vwoLogin1 = new GoodVWOLogin("admin", "pwd123");
//        System.out.println(vwoLogin1.password);
//        System.out.println(vwoLogin1.username);

        vwoLogin1.setUsername("Pramod");
        System.out.println(vwoLogin1.getUsername());

        System.out.println(vwoLogin1.getPassword());

        vwoLogin1.setPassword("12345",false);
        System.out.println(vwoLogin1.getPassword());



    }


}

class VWOLogin {
    public String username;
    public String password;

    VWOLogin(String usr, String pwd) {
        this.username = usr;
        this.password = pwd;
    }

}

class GoodVWOLogin {


    private String username; // Instance Variable | Data variable | Attribute | Fields |  properties | member variables
    private String password;

    public GoodVWOLogin(String usr, String pwd) {
        this.username = username;
        this.password = password;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password, boolean isAdmin) {
        if (isAdmin) {
            this.password = password;
        }else{
            System.out.println("Not allowed to change the password!");
        }
    }


}