public interface Service {
    int ageOfCustomer(Customer customer);
    Customer[] sameCountryCustomers (Customer [] customers)throws RuntimeException;
    Country[] sortCountry(Customer[] customers);
    Customer [] getAllCustomer (Customer [] customers);
}
