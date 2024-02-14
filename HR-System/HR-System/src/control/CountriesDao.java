/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;
import java.util.ArrayList;
import java.util.List;
import model.Countries;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class CountriesDao implements DAOService<Countries> {
  private final SessionFactory session = HibernateUtil.getSessionFactory();
  
  private List<Countries> dataCountries;
  
  public Session openSession() {
    return (Session)this.session.openSession();
  }
  
  public List<Countries> getAllData() {
    try {
      Session sess = openSession();
      Query q = sess.createQuery("SELECT q FROM Countries q ORDER BY q.countryId ASC");
      List<Countries> data = q.list();
      sess.close();
      return data;
    } catch (HibernateException e) {
      return new ArrayList<>();
    } 
  }
  
  public boolean insertData(Countries param) {
    try {
      Session sess = openSession();
      Transaction t = sess.beginTransaction();
      sess.save(param);
      t.commit();
      sess.close();
      return true;
    } catch (HibernateException e) {
      return false;
    } 
  }
  
  public boolean updateData(Countries param) {
    try {
      Session sess = openSession();
      Transaction t = sess.beginTransaction();
      sess.merge(param);
      t.commit();
      sess.close();
      return true;
    } catch (HibernateException e) {
      return false;
    } 
  }
  
  public boolean deleteData(Countries param) {
    try {
      Session sess = openSession();
      param = (Countries) sess.createQuery("SELECT q FROM Countries q WHERE q.countryId = " + param.getCountryId()).list().get(0);
      Transaction t = sess.beginTransaction();
      sess.delete(param);
      t.commit();
      sess.close();
      return true;
    } catch (HibernateException e) {
      return false;
    } 
  }
  
  public Countries getData(int pk) {
    try {
      Session sess = openSession();
      Countries data = (Countries) sess.createQuery("SELECT q FROM Countries q WHERE q.countryId = " + pk).list().get(0);
      return data;
    } catch (HibernateException e) {
      return new Countries();
    } 
  }
}