package control;

import java.util.List;
import org.hibernate.Session;

public interface DAOService<E> {
  Session openSession();
  
  List<E> getAllData();
  
  boolean insertData(E paramE);
  
  boolean updateData(E paramE);
  
  boolean deleteData(E paramE);
  
  E getData(int paramI);
}

