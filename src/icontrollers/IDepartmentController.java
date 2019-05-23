/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icontrollers;

import java.util.List;
import models.Department;

/**
 *
 * @author HP
 */
public interface IDepartmentController {
    
    public List<Department> getAll();

    public Department getById(String id);

    public List<Department> search(Object keyword);

    public boolean insert(String id, String name, String manager_id, String location_id);

    public boolean update(String id, String name, String manager_id, String location_id);

    public boolean deleteById(String id);
    
}
