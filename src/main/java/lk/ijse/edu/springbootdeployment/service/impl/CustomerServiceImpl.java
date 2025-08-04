package lk.ijse.edu.springbootdeployment.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import lk.ijse.edu.springbootdeployment.dto.CustomerDTO;
import lk.ijse.edu.springbootdeployment.entity.Customer;
import lk.ijse.edu.springbootdeployment.repository.CustomerRepository;
import lk.ijse.edu.springbootdeployment.service.CustomerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * --------------------------------------------
 * @Author Dimantha Kaveen
 * @GitHub: https://github.com/KaveenDK
 * --------------------------------------------
 * @Created 8/4/2025
 * @Project SpringBootDeployment
 * --------------------------------------------
 **/

@Slf4j
@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;
    private final ObjectMapper objectMapper;

    @Override
    public CustomerDTO saveCustomer(CustomerDTO customer) {
        Customer customerEntity = objectMapper.convertValue(customer, Customer.class);
        Customer savedCustomerEntity = customerRepository.save(customerEntity);
        return objectMapper.convertValue(savedCustomerEntity, CustomerDTO.class);
    }
}
