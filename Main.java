import java.util.ArrayList;
import java.util.Scanner;
import KT.Computer;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Computer> computerList = new ArrayList<>();
        while (true) {
            System.out.println("Hãy nhập ID của máy tính: ");
            int id = scanner.nextInt();
            System.out.println("Hãy nhập Manufacturer của máy tính: ");
            String manufacturer = scanner.next();
            scanner.nextLine();
            System.out.println("Hãy nhập Year của máy tính: ");
            int year = scanner.nextInt();
            System.out.println("Hãy nhập Price của máy tính: ");
            double price = scanner.nextDouble();
            Computer computer = new Computer(id, manufacturer, year, price);
            computerList.add(computer);
            System.out.println("Thông tin của máy tính Mới là: " + "\nID:" + id + "\nManufacturer:" + manufacturer + "\nYear:" + year + "\nPrice:" + price);
            for(Computer computer1 : computerList){
                computer1.DisplayInfo();
            }
        }
    }
}
