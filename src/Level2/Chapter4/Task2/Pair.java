package Level2.Chapter4.Task2;

public class Pair <T, U> {
    private T goods;
    private U mark;

    public Pair(T goods, U mark) {
        this.goods = goods;
        this.mark = mark;
    }

    public T getGoods() {
        return goods;
    }

    public U getMark() {
        return mark;
    }

    /*@Override
    public String toString() {
        return "Pair{" +
                "goods=" + goods +
                ", mark=" + mark +
                '}';
    }*/
}
