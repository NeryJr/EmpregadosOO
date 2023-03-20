package entities;

public class Adress{

    private String email;
    private String phone;

    //Construtores
    public Adress(){}

    public Adress(String name, String phone) {
        this.email = name;
        this.phone = phone;
    }

    //Setter and Getters
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String name) {
        this.email = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}