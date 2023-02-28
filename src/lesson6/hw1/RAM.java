package lesson6.hw1;

public class RAM {
    String name;
    int capacity;

    public RAM() {
    }

    public RAM(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "RAM " +
                "(name='" + name +
                "', capacity=" + capacity +
                ")";
    }
}