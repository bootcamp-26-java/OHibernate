/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import daos.CountryDAO;
import idaos.ICountryDAO;
import icontrollers.ICountryController;
import java.math.BigDecimal;
import java.util.List;
import models.Country;
import models.Region;
import org.hibernate.SessionFactory;

/**
 *
 * @author HP
 */
public class CountryController implements ICountryController {

    private ICountryDAO cdao;

    public CountryController(SessionFactory factory) {
        cdao = new CountryDAO(factory);
    }

    @Override
    public List<Country> getAll() {
        return cdao.getAll();
    }

    @Override
    public Country getById(String id) {
        return cdao.getById(id);
    }

    @Override
    public List<Country> search(Object keyword) {
        return cdao.search(keyword);
    }

    @Override
    public String insert(String id, String name, String region) {
        Country country = new Country(id, name, new Region(new BigDecimal(region)));
        if (cdao.insert(country)) {
            return "Insert success";
        } else {
            return "Insert failed";
        }
    }

    @Override
    public String update(String id, String name, String region) {
       Country country = new Country(id, name, new Region(new BigDecimal(id)));
       country.setRegion(new Region(new BigDecimal(region)));
       if(cdao.update(country)){
           return "Update success";
       } else {
           return "Update failed";
       }
    }

    @Override
    public String delete(String id) {
        if(cdao.deleteById(id)){
            return "Delete success";
        } else{
            return "Delete failed";
        }
    }

}
