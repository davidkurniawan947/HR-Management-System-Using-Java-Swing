/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;


import java.util.ArrayList;
import java.util.List;
import model.Employees;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class EmployeeDao implements DAOService<Employees> {
  private final SessionFactory session = HibernateUtil.getSessionFactory();
  
  public Session openSession() {
    return (Session)this.session.openSession();
  }
  
  public List<Employees> getAllData() {
    try {
      Session sess = openSession();
      Query q = sess.createQuery("SELECT q FROM Employees q ORDER BY q.employeeId ASC");
      List<Employees> data = q.list();
      sess.close();
      return data;
    } catch (HibernateException e) {
      return new ArrayList<>();
    } 
  }
  
  public boolean insertData(Employees param) {
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
  
  public boolean updateData(Employees param) {
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
  
  public boolean deleteData(Employees param) {
    try {
      Session sess = openSession();
      param = (Employees) sess.createQuery("SELECT q FROM Employees q WHERE q.employeeId = " + param.getEmployeeId()).list().get(0);
      Transaction t = sess.beginTransaction();
      sess.delete(param);
      t.commit();
      sess.close();
      return true;
    } catch (HibernateException e) {
      return false;
    } 
  }
  
  public Employees getData(int pk) {
    try {
      Session sess = openSession();
      Employees data = (Employees) sess.createQuery("SELECT q FROM Employees q WHERE q.employeeId = " + pk).list().get(0);
      return data;
    } catch (HibernateException e) {
      return new Employees();
    } 
  }
}
