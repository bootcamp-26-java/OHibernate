/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import daos.RegionDAO;
import idaos.IRegionDAO;
import java.math.BigDecimal;
import models.Country;
import models.Department;
import models.Employee;
import models.Location;
import models.Region;
import org.hibernate.SessionFactory;

/**
 *
 * @author HP
 */
public class OHibernate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SessionFactory factory = HibernateUtil.getSessionFactory();
        System.out.println(factory);

        /*-------------------------------------------------------------------------------------------
        Manual Test DAO Region
         */
        IRegionDAO irdao = new RegionDAO(factory);

        /*        getAll         */
        for (Region region : irdao.getAll()) {
            System.out.println("Region " + region.getId() + " - " + region.getName());
            System.out.println("-----------------------------------------------");
            for (Country country : region.getCountryList()) {
                System.out.println(country.getId() + "(" + country.getName() + ")"
                        + ", " + country.getRegion().getName());
                for (Location location : country.getLocationList()) {
                    System.out.println("-> " + location.getId() + ", " + location.getStreetAddress() + ", "
                            + location.getPostalCode() + ", " + location.getCity() + " city, "
                            + location.getStateProvince() + ", " + location.getCountry().getName());
                    for (Department department : location.getDepartmentList()) {
                        System.out.println("         "+department.getId()+", "+department.getName()+", "
                                + department.getLocation().getCity());
                        for (Employee employee : department.getEmployeeList()) {
                            System.out.println("             "+employee.getFirstName()+" "+employee.getLastName()+", "+employee.getJob().getTitle());
                        }  
                        
                    }
                }
                System.out.println("");
            }
            System.out.println("-----------------------------------------------");
        }

        /*        getById        */
        System.out.println(irdao.getById(new BigDecimal(1)).getId());
        System.out.println(irdao.getById(new BigDecimal(1)).getName());


        /*        search        */
//        System.out.println(irdao.search(1));
//        for (Region region : irdao.search(1)) {
//            System.out.println(region.getId()+" "+region.getName());  
//        }

//        System.out.println();

        /*        Insert        */
//        Region region1 = new Region(new BigDecimal(31),"My Region");
//        System.out.println(irdao.insert(region1));

        /*        Update        */
        Region region2 = new Region(new BigDecimal(31),"My Regions 1");
        System.out.println(irdao.update(region2));

        /*        Delete       */
        System.out.println(irdao.deleteById(new BigDecimal(31)));

    }
}
