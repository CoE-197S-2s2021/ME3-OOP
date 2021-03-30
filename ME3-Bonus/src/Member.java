abstract public class Member {

    protected String name;
    protected String phone;
    protected String email;

    public void setName(String newName){ name = newName; }
    public String getName(){ return name; }

    public void setPhone(String newPhone){ phone = newPhone; }
    public String getPhone(){ return phone; }

    public void setEmail(String newEmail){ email = newEmail; }
    public String getEmail(){ return email; }
}
