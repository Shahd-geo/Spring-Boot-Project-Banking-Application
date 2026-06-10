package net.javaguides.bancking_app.services;

import net.javaguides.bancking_app.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServices {
    @Autowired
    private CustomerRepository customerRepository;
}
