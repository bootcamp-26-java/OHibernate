/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icontrollers;

import java.util.List;
import models.Employee;

/**
 *
 * @author HP
 */
public interface IEmployeeController {

    public List<Employee> getAll();

    public Employee getById(String id);

    public List<Employee> search(Object keyword);

    public boolean insert(String id, String first_name, String last_name,
            String email, String phone_number, String hire_date, String job_id,
            String salary, String commission_pct, String manager_id, String department_id);

    public boolean update(String id, String first_name, String last_name,
            String email, String phone_number, String hire_date, String job_id,
            String salary, String commission_pct, String manager_id, String department_id);

    public boolean deleteById(String id);
}
