/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idaos;

import java.util.List;
import models.Employee;

/**
 *
 * @author HP
 */
public interface IEmployeeDAO {

    public List<Employee> getAll();

    public Employee getById(int id);

    public List<Employee> search(Object keyword);

    public boolean insert(Employee employee);

    public boolean update(Employee employee);

    public boolean deleteById(int id);
}
