/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.util.ArrayList;
import java.util.List;
import model.Locations;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class LocationsDao implements DAOService<Locations> {
  private final SessionFactory session = HibernateUtil.getSessionFactory();
  
  private List<Locations> dataLocations;
  
  public Session openSession() {
    return (Session)this.session.openSession();
  }
  
  public List<Locations> getAllData() {
    try {
      Session sess = openSession();
      Query q = sess.createQuery("SELECT q FROM Locations q ORDER BY q.locationId ASC");
      List<Locations> data = q.list();
      sess.close();
      return data;
    } catch (HibernateException e) {
      return new ArrayList<>();
    } 
  }
  
  public boolean insertData(Locations param) {
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
  
  public boolean updateData(Locations param) {
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
  
  public boolean deleteData(Locations param) {
    try {
      Session sess = openSession();
      param = (Locations) sess.createQuery("SELECT q FROM Locations q WHERE q.locationId = " + param.getLocationId()).list().get(0);
      Transaction t = sess.beginTransaction();
      sess.delete(param);
      t.commit();
      sess.close();
      return true;
    } catch (HibernateException e) {
      return false;
    } 
  }
  
  public Locations getData(int pk) {
    try {
      Session sess = openSession();
      Locations data = (Locations) sess.createQuery("SELECT q FROM Locations q WHERE q.locationId = " + pk).list().get(0);
      return data;
    } catch (HibernateException e) {
      return new Locations();
    } 
  }
}

