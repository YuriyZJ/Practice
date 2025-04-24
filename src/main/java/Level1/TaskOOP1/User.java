package Level1.TaskOOP1;

import java.util.Objects;

public class User {
    private int ID;
    private String name;

    public User(){

    }

    public User(int ID, String name){
        this.ID = ID;
        this.name = name;
    }

    public int getID(){
        return ID;
    }

    public void setID(int ID){
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return ID == user.ID && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, name);
    }
}
