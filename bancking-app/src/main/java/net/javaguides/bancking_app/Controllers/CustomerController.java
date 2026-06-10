package net.javaguides.bancking_app.Controllers;

import net.javaguides.bancking_app.entity.Customer;
import net.javaguides.bancking_app.repository.CustomerRepository;
import net.javaguides.bancking_app.services.CustomerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")

public class CustomerController {
    @Autowired
    CustomerServices customerServices;
    @PostMapping("add")
    public Customer addCustomer(@RequestBody Customer customer){
        return customerServices.addCustomer(customer);
    }
    @GetMapping("getAll")
    public List<Customer> getAllCustomers(){
        return customerServices.getAllCustomers();
    }
    @GetMapping("getById")
    public Customer getCustomerById(@RequestParam Integer id){
        return customerServices.getCustomerById(id);
    }
    @GetMapping("getByName")
    public List<Customer> getCustomerByName(@RequestParam String customerName){
        return customerServices.getCustomerByName(customerName);
    }
    @PutMapping("update")
    public Customer updateCustomer(@RequestBody Customer customer, @RequestParam Integer id){
        return customerServices.updateCustomer(id, customer);
    }
    @DeleteMapping("deleteById")
    public Boolean deleteCustomer(@RequestParam Integer id){
        return customerServices.deleteCustomer(id);
    }



}


