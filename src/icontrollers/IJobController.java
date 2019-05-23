/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icontrollers;

import java.util.List;
import models.Job;

/**
 *
 * @author HP
 */
public interface IJobController {
    
    public List<Job> getAll();

    public Job getById(String id);

    public List<Job> search(Object keyword);

    public boolean insert(String id, String title, String min_salary, String max_salary);

    public boolean update(String id, String title, String min_salary, String max_salary);

    public boolean deleteById(String id);
}
