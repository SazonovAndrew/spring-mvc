package web.model;


public class Car {
    String model;
    int yearOfCreation;
    int price;

    public Car(String model, int yearOfCreation, int price) {
        this.model = model;
        this.yearOfCreation = yearOfCreation;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfCreation() {
        return yearOfCreation;
    }

    public void setYearOfCreation(int yearOfCreation) {
        this.yearOfCreation = yearOfCreation;
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
                "model='" + model + '\'' +
                ", yearOfCreation=" + yearOfCreation +
                ", price=" + price +
                '}';
    }

}
