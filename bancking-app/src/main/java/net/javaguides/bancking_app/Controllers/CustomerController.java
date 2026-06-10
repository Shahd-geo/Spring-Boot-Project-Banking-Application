package net.javaguides.bancking_app.Controllers;

import net.javaguides.bancking_app.entity.Customer;
import net.javaguides.bancking_app.repository.CustomerRepository;
import net.javaguides.bancking_app.services.CustomerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")

public class CustomerController {
    @Autowired
    CustomerServices customerServices;
    @PostMapping("add")
    public Customer addCustomer(@RequestBody Customer customer){
        return customerServices.addCustomer(customer);
    }

}


