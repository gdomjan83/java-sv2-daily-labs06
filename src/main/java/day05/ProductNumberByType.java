package day05;

public class ProductNumberByType {
    private Type type;
    private int count = 1;

    public ProductNumberByType(Type type) {
        this.type = type;
    }

    public Type getType() {
        return type;
    }

    public int getCount() {
        return count;
    }

    public void addCount() {
        count++;
    }
}
