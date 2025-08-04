package lk.ijse.edu.springbootdeployment.controller;

import lk.ijse.edu.springbootdeployment.dto.ApiResponse;
import lk.ijse.edu.springbootdeployment.dto.CustomerDTO;
import lk.ijse.edu.springbootdeployment.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * --------------------------------------------
 * @Author Dimantha Kaveen
 * @GitHub: https://github.com/KaveenDK
 * --------------------------------------------
 * @Created 8/4/2025
 * @Project SpringBootDeployment
 * --------------------------------------------
 **/

@RestController
@RequestMapping("/api/v1/customer")
@RequiredArgsConstructor
@CrossOrigin
public class CustomerController {
    private final CustomerService customerService;

    @GetMapping
    public String getCustomer () {
        return "Customer data retrieved successfully!";
    }

    @PostMapping
    public ResponseEntity<ApiResponse<CustomerDTO>> saveCustomer(@RequestBody CustomerDTO customer) {
        return new ResponseEntity<>(new ApiResponse<>(
                200,
                "Customer saved successfully",
                customerService.saveCustomer(customer)
        ), HttpStatus.CREATED);

    }
}
