package task1;

import java.util.Objects;

public class Notebook {

    private Double ramCapacity;
    private Double hardDiskCapacity;
    private Double screenSize;
    private String color;
    private Double weight;
    private String manufacturer;

    private Double price;

    public Notebook(Double ramCapacity, Double hardDiskCapacity, Double screenSize, String color, Double weight, String manufacturer, Double price) {
        this.ramCapacity = ramCapacity;
        this.hardDiskCapacity = hardDiskCapacity;
        this.screenSize = screenSize;
        this.color = color;
        this.weight = weight;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getRamCapacity() {
        return ramCapacity;
    }

    public void setRamCapacity(Double ramCapacity) {
        this.ramCapacity = ramCapacity;
    }

    public Double getHardDiskCapacity() {
        return hardDiskCapacity;
    }

    public void setHardDiskCapacity(Double hardDiskCapacity) {
        this.hardDiskCapacity = hardDiskCapacity;
    }

    public Double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(Double screenSize) {
        this.screenSize = screenSize;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "ram capacity=" + ramCapacity +
                ", hard disk capacity=" + hardDiskCapacity +
                ", screen size=" + screenSize +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                ", manufacturer='" + manufacturer + '\'' +
                ", price='" + price + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notebook notebook = (Notebook) o;
        return Objects.equals(ramCapacity, notebook.ramCapacity)
                && Objects.equals(hardDiskCapacity, notebook.hardDiskCapacity)
                && Objects.equals(screenSize, notebook.screenSize)
                && Objects.equals(color, notebook.color)
                && Objects.equals(weight, notebook.weight)
                && Objects.equals(manufacturer, notebook.manufacturer)
                && Objects.equals(price, notebook.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ramCapacity, hardDiskCapacity, screenSize, color, weight, manufacturer, price);
    }
}
