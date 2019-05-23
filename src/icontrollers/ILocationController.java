/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icontrollers;

import java.util.List;
import models.Location;

/**
 *
 * @author HP
 */
public interface ILocationController {
    
    public List<Location> getAll();

    public Location getById(String id);

    public List<Location> search(Object keyword);

    public boolean insert(String id, String street_address, String postal_code, String city, String state_province, String country_id);

    public boolean update(String id, String street_address, String postal_code, String city, String state_province, String country_id);

    public boolean deleteById(String id);
}
