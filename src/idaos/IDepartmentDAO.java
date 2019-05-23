/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idaos;

import java.math.BigDecimal;
import java.util.List;
import models.Department;

/**
 *
 * @author Sindi Yulia Wibowo
 */
public interface IDepartmentDAO {

    public List<Department> getAll();

    public Department getById(Short id);

    public List<Department> search(Object keyword);

    public boolean insert(Department department);

    public boolean update(Department department);

    public boolean deleteById(Short id);

}

