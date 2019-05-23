/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import daos.RegionDAO;
import icontrollers.IRegionController;
import idaos.IRegionDAO;
import java.math.BigDecimal;
import java.util.List;
import models.Region;
import org.hibernate.SessionFactory;

/**
 *
 * @author HP
 */
public class RegionController implements IRegionController {

    private IRegionDAO rdao;

    public RegionController(SessionFactory factory) {
        rdao = new RegionDAO(factory);
    }

    @Override
    public List<Region> getAll() {
        return rdao.getAll();
    }

    @Override
    public Region getById(String id) {
        return rdao.getById(new BigDecimal(id));
    }

    @Override
    public List<Region> search(Object keyword) {
        return rdao.search(keyword);
    }

    @Override
    public String insert(String id, String name) {
        Region region = new Region(new BigDecimal(id), name);
        if (rdao.insert(region)) {
            return "Insert success";
        } else {
            return "Insert failed";
        }
    }

    @Override
    public String update(String id, String name) {
        Region region = new Region(new BigDecimal(id), name);
        if (rdao.update(region)) {
            return "Update success";
        } else {
            return "Update failed";
        }
    }

    @Override
    public String delete(String id) {
        if(rdao.deleteById(new BigDecimal(id))){
            return "Delete success";
        } else{
            return "Delete failed";
        }
    }
}
