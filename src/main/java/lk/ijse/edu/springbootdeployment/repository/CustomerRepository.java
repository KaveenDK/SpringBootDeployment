package lk.ijse.edu.springbootdeployment.repository;

import lk.ijse.edu.springbootdeployment.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * --------------------------------------------
 * @Author Dimantha Kaveen
 * @GitHub: https://github.com/KaveenDK
 * --------------------------------------------
 * @Created 8/4/2025
 * @Project SpringBootDeployment
 * --------------------------------------------
 **/

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
