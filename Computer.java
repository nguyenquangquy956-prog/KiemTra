package KT;
public class Computer {
    private int ID;
    private String Manufacturer;
    private int Year;
    private double Price;
    public int getID() {
        return ID;
    }
    public String getManufacturer() {
        return Manufacturer;
    }
    public int getYear() {
        return Year;
    }
    public double getPrice() {
        return Price;
    }
    public void setID(int iD) {
        ID = iD;
    }
    public void setManufacturer(String manufacturer) {
        Manufacturer = manufacturer;
    }
    public void setYear(int year) {
        Year = year;
    }
    public void setPrice(double price) {
        Price = price;
    }
    public Computer(int iD, String manufacturer, int year, double price) {
        ID = iD;
        Manufacturer = manufacturer;
        Year = year;
        Price = price;
    }
    public void DisplayInfo(){
        System.out.println("Thông tin của máy tính là: " + "\nID:" + this.ID + "\nManufacturer:" + this.Manufacturer + "\nYear:" + this.Year + "\nPrice:" + this.Price + "\n---------------------------------------------------------");
    }
}
