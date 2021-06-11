package tech.getArrays.employeemanager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.getArrays.employeemanager.model.Employee;

import javax.swing.text.html.Option;
import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    void deleteEmployeeById(Long id);

    Optional<Employee> findEmployeeById(Long id);
}
