package Level1.TaskOOP1;

import java.util.Objects;

public class User {
    private int ID;
    private String nameU;

    public User(){

    }

    public User(int ID, String name){
        this.ID = ID;
        this.nameU = name;
    }

    public int getID(){
        return ID;
    }

    public void setID(int ID){
        this.ID = ID;
    }

    public String getNameU() {
        return nameU;
    }

    public void setNameU(String nameU) {
        this.nameU = nameU;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return ID == user.ID && Objects.equals(nameU, user.nameU);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, nameU);
    }
}
