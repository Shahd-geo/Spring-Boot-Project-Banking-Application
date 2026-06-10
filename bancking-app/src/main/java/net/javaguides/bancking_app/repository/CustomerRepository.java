package net.javaguides.bancking_app.repository;

import net.javaguides.bancking_app.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
    List<Customer> findByCustomerName(String customerName);

}
