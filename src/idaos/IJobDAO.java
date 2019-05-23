/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idaos;

import java.util.List;
import models.Job;

/**
 *
 * @author HP
 */
public interface IJobDAO {

    public List<Job> getAll();

    public Job getById(String id);

    public List<Job> search(Object keyword);

    public boolean insert(Job job);

    public boolean update(Job job);

    public boolean deleteById(String id);
}
