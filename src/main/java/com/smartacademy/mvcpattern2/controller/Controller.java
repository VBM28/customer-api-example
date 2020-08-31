package com.smartacademy.mvcpattern2.controller;

import com.smartacademy.mvcpattern2.model.addcustomer.AddCustomerRequest;
import com.smartacademy.mvcpattern2.model.addcustomer.AddCustomerResponse;
import com.smartacademy.mvcpattern2.model.getcustomer.GetCustomerResponse;
import com.smartacademy.mvcpattern2.model.updatecustomer.UpdateCustomerRequest;
import com.smartacademy.mvcpattern2.model.updatecustomer.UpdateCustomerResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.util.Optional;
@RestController
public interface Controller {
        //testing another push
    @GetMapping("/getCustomer")
    GetCustomerResponse getCustomers(@RequestParam Optional<Integer> customerId,
                                     @RequestParam Optional<String> phoneNumber,
                                     HttpServletResponse httpServletResponse);

    @PostMapping("/addCustomer")
    AddCustomerResponse addCustomer(@RequestBody @Valid AddCustomerRequest addCustomerRequest,
                                    HttpServletResponse response);

    @PutMapping("/updateCustomer")
    ResponseEntity<?> updateCustomer(@RequestBody UpdateCustomerRequest customerRequest);
}
