package idaos;

import java.util.List;
import models.Country;

/**
 * 
 * @author Sindi Yulia Wibowo
 */
public interface ICountryDAO {
    public List<Country> getAll();

    public Country getById(String id);

    public List<Country> search(Object keyword);

    public boolean insert(Country country);

    public boolean update(Country country);

    public boolean deleteById(String id);
}
