package net.karinaI.ems.service.impl;

import lombok.AllArgsConstructor;
import net.karinaI.ems.dto.EmployeeDto;
import net.karinaI.ems.repository.EmployeeRepository;
import net.karinaI.ems.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        return null;
    }
}
