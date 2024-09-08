package com.example.service;

import com.example.model.Customer;
import org.springframework.stereotype.Service;

@Service
public interface CustomerService {
    Customer getCustomer(Long id);
    String addCustomer(Customer customer);
    String updateCustomer(Customer customer);
}
