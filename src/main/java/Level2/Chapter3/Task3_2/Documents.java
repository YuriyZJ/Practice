package Level2.Chapter3.Task3_2;

public class Documents {
    private final int ID;
    private String text;

    public Documents(int id, String text) {
        this.ID = id;
        this.text = text;
    }

    public int getID() {
        return ID;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Documents{" +
                "ID=" + ID +
                ", text='" + text + '\'' +
                '}';
    }
}
