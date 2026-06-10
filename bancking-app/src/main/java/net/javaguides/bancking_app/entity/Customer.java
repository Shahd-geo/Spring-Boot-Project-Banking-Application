package net.javaguides.bancking_app.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer customerId;
    @NotBlank(message = "Customer name cannot be empty")
    private String customerName;

    @NotBlank(message = "Account number cannot be empty")
    @Column(unique = true)
    private String accountNumber;

    @PositiveOrZero(message = "Balance cannot be negative")
    private Double balance;

    @Email(message = "Invalid email format")
    private String email;
    private String phoneNumber;
}
