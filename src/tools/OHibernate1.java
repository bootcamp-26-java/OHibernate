package tools;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.math.BigDecimal;
import models.Country;
import models.Department;
import models.Employee;
import models.Location;
import models.Region;
import org.hibernate.SessionFactory;

/**
 *
 * @author Sindi Yulia Wibowo
 */
public class OHibernate_ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SessionFactory factory = HibernateUtil.getSessionFactory();
        System.out.println(factory);
        /*        Manual Test       */
        //        ILocationController ilc = new LocationController(factory);
        //        ILocationDAO ildao = new LocationDAO(factory);
        NewLocationDAO nldao = new NewLocationDAO(factory);
        NewDAO<Region> ldao= new NewDAO(factory, Region.class);
        NewDAO<Department> dDao = new NewDAO<>(factory, Department.class);
//        System.out.println(ldao.saveOrDelete(new Region(new BigDecimal(35), "JAUH BANGET"), true));
        
//        for (Region region : ldao.getData("")) {
//            System.out.println(region.getId());
//            System.out.println(region.getName());
//        }

        for (Department department : dDao.getData("A")) {
            System.out.println(department.getName());
            System.out.println(department.getManager().getLastName());
        }
        
//        for (Location location : ndao.getdata(new Location(), "")) {
//            System.out.println(location.getCity() +", "+location.getStreetAddress()+", "+location.getPostalCode()+", "+location.getId());
//        }
        
        
                /*        Search         */ //        for (Location location1 : ilc.search("1")) {
                //            System.out.println(location1.getCity() +", "+location1.getId()+", "
                //                    +location1.getStreetAddress()+", "+location1.getPostalCode()+", "
                //                    +location1.getStateProvince()
                //                    +","+location1.getCountry().getId()
    



        /*        Insert        */
//       Location location2 = new Location(new Short("5000"), "Vileparles", "57561", "Bombay", "Oxford", new Country("CN"));
//       System.out.println(ildao.insert(location2));
//        Location location3 = new Location(new Short("5000"), "Vileparles update", "57561", "Bombay", "Oxford", new Country("CN"));
//        System.out.println(ildao.update(location3));


        /*        Update        */
//        Region region2 = new Region(new BigDecimal(31), "My Regions 1");
//        System.out.println(irdao.update(region2));

        /*        Delete       */
//        System.out.println(irdao.deleteById(new BigDecimal(31)));
//        for (Location location : ildao.getAll()) {
//            System.out.println(location.getId()+", "+location.getStreetAddress()+", "+location.getCity()+", "
//                    +location.getPostalCode()+", "+location.getStateProvince()+", "
//                    +location.getCountry().getId());
//        }

        /*        getAll         */
//        for (Region region : irdao.getAll()) {
//            System.out.println("Region " + region.getId() + " - " + region.getName());
//            System.out.println("-----------------------------------------------");
//            for (Country country : region.getCountryList()) {
//                System.out.println(country.getId() + "(" + country.getName() + ")"
//                        + ", " + country.getRegion().getName());
//                for (Location location : country.getLocationList()) {
//                    System.out.println("-> " + location.getId() + ", " + location.getStreetAddress() + ", "
//                            + location.getPostalCode() + ", " + location.getCity() + " city, "
//                            + location.getStateProvince() + ", " + location.getCountry().getName());
//                    for (Department department : location.getDepartmentList()) {
//                        System.out.println("         " + department.getId() + ", " + department.getName() + ", "
//                                + department.getLocation().getCity());
//                        for (Employee employee : department.getEmployeeList()) {
//                            System.out.println("             " + employee.getFirstName() + " " + employee.getLastName()
//                                    + ", " + employee.getJob().getTitle() + "," + employee.getManager().getFirstName());
//                        }
//                    }
//                }
//                System.out.println("");
//            }
//            System.out.println("-----------------------------------------------");
//        }
//        for (Location location2 : ilc.getAll()) {
//            System.out.println(location2.getId() + ", " + location2.getStreetAddress() + ", " + location2.getPostalCode()
//                    + ", " + location2.getCity() + ", " + location2.getStateProvince() + ", " + location2.getCountry().getName());
//        }
//    }

        /*        getById        */
//        Location location = ilc.getById("1000");
//        System.out.println(location.getId() + " - " + location.getStreetAddress());
    }
}
