package net.karinaI.ems.repository;

import net.karinaI.ems.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository <Employee, Long> {
}
