package KT;
public class Computer {
    private int id;
    private String manufacturer;
    private int year;
    private double price;
    public Computer(int id, String manufacturer, int year, double price) {
        this.id = id;
        this.manufacturer = manufacturer;
        this.year = year;
        this.price = price;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getId() {
        return id;
    }
    public String getManufacturer() {
        return manufacturer;
    }
    public int getYear() {
        return year;
    }
    public double getPrice() {
        return price;
    }
    public void displayInfo(){
        System.out.println("Thông tin của máy tính là: " + "\nID:" + this.id + "\nManufacturer:" + this.manufacturer + "\nYear:" + this.year + "\nPrice:" + this.price + "\n---------------------------------------------------------");
    }
}
