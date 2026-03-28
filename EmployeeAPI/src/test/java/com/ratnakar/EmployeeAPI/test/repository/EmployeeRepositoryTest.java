package com.ratnakar.EmployeeAPI.test.repository;

import com.ratnakar.EmployeeAPI.model.Employee;
import com.ratnakar.EmployeeAPI.repository.EmployeeRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

@DataJpaTest // @DataJpaTest is used in Spring Boot to test only the JPA (repository) layer by loading a lightweight context with in-memory database support and excluding other components.
public class EmployeeRepositoryTest {
    @Autowired
    private EmployeeRepository employeeRepository;

    // JUnit test for Save Employee Operation
    @Test
    public void saveEmployeeDataTest(){
        // Given (Precondition Or SetUp) : Employee Object is given to the JpaRepository
        Employee employee = new Employee();
        employee.setEmployee_id("ABC123");
        employee.setEmployee_name("Avinash");
        employee.setJob_role("SoftwareDeveloper");
        // When (Action or the behaviour that we will Test) : JpaRepository inserted the Employee data in the DB using save() method
        Employee savedEmployee = employeeRepository.save(employee);
        // Then (Verify the Output) : Return the Saved Employee Object from DB
        Assertions.assertThat(savedEmployee).isNotNull();
        Assertions.assertThat(savedEmployee.getEmployee_id()).isEqualTo("ABC123");
    }
}
