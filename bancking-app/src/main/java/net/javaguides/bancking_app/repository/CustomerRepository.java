package net.javaguides.bancking_app.repository;

import net.javaguides.bancking_app.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
