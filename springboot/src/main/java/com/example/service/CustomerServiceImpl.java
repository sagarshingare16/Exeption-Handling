package com.example.service;

import com.example.exception.CustomerAlreadyExistsException;
import com.example.exception.NoSuchCustomerExistsException;
import com.example.model.Customer;
import com.example.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Customer getCustomer(Long id) {
        return customerRepository.findById(id).orElseThrow(()->
                new NoSuchCustomerExistsException("No customer present with "+id));
    }
    @Override
    public String addCustomer(Customer customer) {
        Optional<Customer> existingCustomer = customerRepository.findById(customer.getId());
        if(existingCustomer.isPresent()){
            throw new CustomerAlreadyExistsException("Customer already present!");
        }else {
            customerRepository.save(customer);
            return "Customer saved successfully!";
        }
    }
    @Override
    public String updateCustomer(Customer customer) {
        Customer existingCustomer = customerRepository.findById(customer.getId()).orElse(null);
        if(existingCustomer == null){
            throw new NoSuchCustomerExistsException("No such customer exits!");
        }else {
            existingCustomer.setName(customer.getName());
            existingCustomer.setAddress(customer.getAddress());
            customerRepository.save(customer);
            return "Customer details updated successfully!";
        }
    }
}
