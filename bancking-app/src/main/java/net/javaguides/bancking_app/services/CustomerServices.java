package net.javaguides.bancking_app.services;

import net.javaguides.bancking_app.entity.Customer;
import net.javaguides.bancking_app.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServices {
    @Autowired
    private CustomerRepository customerRepository;

    //Add Customer
    public Customer addCustomer(Customer customer){
        return customerRepository.save(customer);
    }
    //Get All Customers - FIND ALL
    public List<Customer> getAllCustomers(){
        return customerRepository.findAll();
    }
    //Get Customer By ID-FIND BY ID
    public Customer getCustomerById(Integer id){
        return customerRepository.findById(id).orElse(null);
    }

    //Find Customer by Name

    public List<Customer> getCustomerByName(String customerName){
        return customerRepository.findByCustomerName(customerName);
    }
    //Update Customer
    public Customer updateCustomer(Integer id , Customer customer){

        Customer existingCustomer = customerRepository.findById(id).orElse(null);

        if(existingCustomer != null){

            existingCustomer.setCustomerName(customer.getCustomerName());
            existingCustomer.setAccountNumber(customer.getAccountNumber());
            existingCustomer.setBalance(customer.getBalance());
            existingCustomer.setEmail(customer.getEmail());
            existingCustomer.setPhoneNumber(customer.getPhoneNumber());

            return customerRepository.save(existingCustomer);
        }

        return null;
    }
    //Delete Customer
    public Boolean deleteCustomer(Integer id){
        Customer customer = customerRepository.findById(id).orElse(null);
        if(customer != null){
            customerRepository.deleteById(id);
            return true;
        }

        return false;
    }

}
