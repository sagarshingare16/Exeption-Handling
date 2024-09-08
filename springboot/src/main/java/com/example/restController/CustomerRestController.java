package com.example.restController;

import com.example.advice.ErrorResponse;
import com.example.exception.CustomerAlreadyExistsException;
import com.example.exception.NoSuchCustomerExistsException;
import com.example.model.Customer;
import com.example.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/customer")
public class CustomerRestController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/getCustomer/{id}")
    public Customer getCustomer(@PathVariable("id") Long id) {
        return customerService.getCustomer(id);
    }

    @PostMapping("/addCustomer")
    public String addCustomer(@RequestBody Customer customer) {
        return customerService.addCustomer(customer);
    }

    @PutMapping("/updateCustomer")
    public String updateCustomer(@RequestBody Customer customer) {
        return customerService.updateCustomer(customer);
    }

    /* Exception Handling */
    @ExceptionHandler(CustomerAlreadyExistsException.class)
    public ErrorResponse handleCustomerAlreadyExistsException(CustomerAlreadyExistsException ex, WebRequest request) {
        return new ErrorResponse(HttpStatus.CONFLICT.value(),
                ex.getMessage(), LocalDateTime.now(), request.getDescription(false));
    }
    @ExceptionHandler(NoSuchCustomerExistsException.class)
    public ErrorResponse handleNoSuchCustomerExistsException(NoSuchCustomerExistsException ex, WebRequest request) {
        return new ErrorResponse(HttpStatus.NOT_FOUND.value(),
                ex.getMessage(), LocalDateTime.now(), request.getDescription(false));
    }
}

