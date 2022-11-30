import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Customer implements Service {
    String name;
    String surname;
    String placeOfBirth;
    LocalDate yearOfBirth;
    String email;
    private Country country;

    public Customer(String name, String surname, String placeOfBirth,LocalDate yearOfBirth, String email) {
        this.name = name;
        this.surname = surname;
        this.placeOfBirth = placeOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.email = email;
    }

    public Customer() {

    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public LocalDate getYearOfBirth() {
        return yearOfBirth;
    }

    public String getEmail() {
        return email;
    }



    @Override
    public int ageOfCustomer(Customer customers) {
        int num = LocalDate.now().getYear()-yearOfBirth.getYear();
        return num;
    }

    @Override
    public Customer[] sameCountryCustomers(Customer[] customers) throws RuntimeException {
            String country =new Scanner(System.in).nextLine();
            if (!country.matches("[a-zA-Za-яА-Я]*")){
                throw new RuntimeException("Write the country name! Please!");
            }
            int counter=0;
            for (Customer customer : customers) {
                if(customer.country.name().equals(country.toUpperCase())){
                    counter++;
                }
            }
            int index=0;
            Customer []customers1 =new Customer[counter];
            for (Customer customer : customers) {
                if(customer.country.name().equals(country.toUpperCase())){
                    customers1[index]=customer;
                    index++;
                }

            }
            return customers1;
    }




    @Override
        public Country[] sortCountry(Customer[] customers) {
            Country[] countries = new Country[customers.length];
            int index = 0;
            for (Customer customer : customers) {
                countries[index] = customer.country;
                index++;
            }
            Arrays.sort(countries);
            return countries;
        }

    @Override
    public Customer[] getAllCustomer(Customer[] customers) {
        return customers;
    }


    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", placeOfBirth='" + placeOfBirth + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", email='" + email + '\'' +
                ", country=" + country +
                '}';
    }
}



