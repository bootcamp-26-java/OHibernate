package idaos;

import java.math.BigDecimal;
import java.util.List;
import models.Region;

/**
 * 
 * @author Sindi Yulia Wibowo
 */
public interface IRegionDAO {

    public List<Region> getAll();

    public Region getById(BigDecimal id);

    public List<Region> search(Object keyword);

    public boolean insert(Region region);

    public boolean update(Region region);

    public boolean deleteById(BigDecimal id);

}
