package lk.ijse.edu.springbootdeployment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
public class CustomerController {
    @GetMapping
    public String getCustomer () {
        return "Customer data retrieved successfully!";
    }
}
