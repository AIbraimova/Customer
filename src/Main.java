import javax.imageio.IIOException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IIOException {
        Customer customer1 = new Customer("Aiperi","Ibraimova","Kyrgyzstan", LocalDate.of(1995,1,1),"rtdwzugbu");
        Customer customer2 = new Customer("Aigerim","Baktybekova","Kazakstan",LocalDate.of(2000,10,24),"ftgzhu");
        Customer customer3 = new Customer("Tachmina","Nurkulbekova","Russia",LocalDate.of(1998,1,28),"xdcftgvb");
        Customer customer = new Customer();
        Customer [] customers = {customer1,customer2,customer3};

        while (true) {
            int number = new Scanner(System.in).nextInt();
            switch (number) {
                case 1:
                    for (Customer customer5 : customers) {
                        System.out.println(customer5.ageOfCustomer(customer) + " " + customer5.getName());
                    }
                    break;
                case 2:
                    System.out.println(Arrays.toString(customer.sameCountryCustomers(customers)));
                    break;
                case 3:
                    System.out.println(Arrays.toString(customer.sortCountry(customers)));
                    break;
                case 4:
                    System.out.println(Arrays.toString(customer.getAllCustomer(customers)));
                    break;
                default:
                    System.out.println("");

            }
        }

     /**   try { FileWriter fileWriter = new FileWriter("fileforpractice");
            fileWriter.write("Customer деген класс тузунуз.Полерерин толтурунуз аты, фамилиясы,туулган олкосу,туулган жылы,почтасы болсун.Дагы бир service деген интерфейс ачып аны анын ичине 4 метод жазыныз." +
                   "1-кардардын жашын кайтаруучу метод жазыныз,2-мамлекети окшош кардарларды кайтарыныз,3-кардарлардын мамлекетин сорттоп чыгарыныз,4-баардык кардарларды кайтаруучу метод жазыныз." +
                    "Ал интерфейсти Customer клласына impliments кылып методдорго логикасын жазыныз.Mainдан жазган логиканызды иштетиниз");
         fileWriter.close();
            FileReader fileReader = new FileReader("fileforpractice");
            Scanner scanner = new Scanner(fileReader);
            while (scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
            fileReader.close();

        } catch (IOException e) {
            System.out.println("File not found!");
        }**/

    }
}