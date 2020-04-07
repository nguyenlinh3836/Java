package ADFII;

public class Student {
    private int id;
    private String Name;
    private String Address;
    private String phone;
    public Student(int id , String Name, String Address, String phone){
        this.id = id;
        this.Name = Name;
        this.Address = Address;
        this.phone = phone;
    }
    public Student(){};

    public int getId() {
        return id;
    }

    public String getName() {
        return Name;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return Address;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setAddress(String address) {
        Address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", Address='" + Address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
