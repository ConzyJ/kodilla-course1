package manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CompanyDaoTestSuite {

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    @Test
    void testNamedQueries() {
        // Given
        Employee emp1 = new Employee("John", "Smith");
        Employee emp2 = new Employee("Stephanie", "Clarckson");
        Company comp1 = new Company("Software Machine");
        Company comp2 = new Company("SoftHouse");

        emp1.getCompanies().add(comp1);
        comp1.getEmployees().add(emp1);

        emp2.getCompanies().add(comp2);
        comp2.getEmployees().add(emp2);

        companyDao.save(comp1);
        companyDao.save(comp2);

        employeeDao.save(emp1);
        employeeDao.save(emp2);

        // When
        List<Employee> smiths = employeeDao.retrieveEmployeeByLastname("Smith");
        List<Company> softCompanies = companyDao.retrieveCompanyByThreeFirstLetters("Sof");

        // Then
        try {
            assertEquals(1, smiths.size());
            assertEquals(2, softCompanies.size());
        } finally {
            // Clean up
            companyDao.delete(comp1);
            companyDao.delete(comp2);
            employeeDao.delete(emp1);
            employeeDao.delete(emp2);
        }
    }
}
