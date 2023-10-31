/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.util.ArrayList;
import java.util.List;
import model.Countries;
import model.Locations;
import model.Regions;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class RegionsDao implements DAOService<Regions> {
  private final SessionFactory session = HibernateUtil.getSessionFactory();
  
  private List<Regions> dataRegions;
  
  public Session openSession() {
    return (Session)this.session.openSession();
  }
  
  public List<Regions> getAllData() {
    try {
      Session sess = openSession();
      Query q = sess.createQuery("SELECT q FROM Regions q ORDER BY q.regionId ASC");
      List<Regions> data = q.list();
      sess.close();
      return data;
    } catch (HibernateException e) {
      return new ArrayList<>();
    } 
  }
  
  public boolean insertData(Regions param) {
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
  
  public boolean updateData(Regions param) {
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
  
  public boolean deleteData(Regions param) {
    try {
      Session sess = openSession();
      param = (Regions) sess.createQuery("SELECT q FROM Regions q WHERE q.regionId = " + param.getRegionId()).list().get(0);
      Transaction t = sess.beginTransaction();
      sess.delete(param);
      t.commit();
      sess.close();
      return true;
    } catch (HibernateException e) {
      return false;
    } 
  }
  
  public Regions getData(int pk) {
    try {
      Session sess = openSession();
      Regions data = (Regions) sess.createQuery("SELECT q FROM Regions q WHERE q.regionId = " + pk).list().get(0);
      return data;
    } catch (HibernateException e) {
      return new Regions();
    } 
  }
  
  public List<Countries> getAllDataCountries(int pk) {
    try {
      Session sess = openSession();
      Query q = sess.createQuery("SELECT q FROM Countries q WHERE q.regionId = " + pk);
      List<Countries> data = q.list();
      sess.close();
      return data;
    } catch (HibernateException e) {
      return new ArrayList<>();
    } 
  }
  
  public List<Locations> getAllDataLocations(int pk) {
    try {
      Session sess = openSession();
      Query q = sess.createQuery("SELECT q FROM Locations q WHERE q.countryId = " + pk);
      List<Locations> data = q.list();
      sess.close();
      return data;
    } catch (HibernateException e) {
      return new ArrayList<>();
    } 
  }
}
