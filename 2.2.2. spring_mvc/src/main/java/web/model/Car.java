package web.model;

public class Car {
    private String name;
    private int yearOfCreate;
    private int price;
    private long id;

    public Car() {
    }
    public Car(long id, String name, int yearOfCreate, int price) {
        this.id = id;
        this.name = name;
        this.yearOfCreate = yearOfCreate;
        this.price = price;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getYearOfCreate() {
        return yearOfCreate;
    }
    public void setYearOfCreate(int yearOfCreate) {
        this.yearOfCreate = yearOfCreate;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", yearOfCreate=" + yearOfCreate +
                ", price=" + price +
                '}';
    }
}
