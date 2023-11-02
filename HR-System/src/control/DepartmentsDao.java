/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;


import java.util.ArrayList;
import java.util.List;
import model.Departments;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class DepartmentsDao implements DAOService<Departments> {
  private final SessionFactory session = HibernateUtil.getSessionFactory();
  
  private List<Departments> dataDepartments;
  
  public Session openSession() {
    return (Session)this.session.openSession();
  }
  
  public List<Departments> getAllData() {
    try {
      Session sess = openSession();
      Query q = sess.createQuery("SELECT q FROM Departments q ORDER BY q.departmentId ASC");
      List<Departments> data = q.list();
      sess.close();
      return data;
    } catch (HibernateException e) {
      return new ArrayList<>();
    } 
  }
  
  public boolean insertData(Departments param) {
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
  
  public boolean updateData(Departments param) {
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
  
  public boolean deleteData(Departments param) {
    try {
      Session sess = openSession();
      param = (Departments) sess.createQuery("SELECT q FROM Departments q WHERE q.departmentId = " + param.getDepartmentId()).list().get(0);
      Transaction t = sess.beginTransaction();
      sess.delete(param);
      t.commit();
      sess.close();
      return true;
    } catch (HibernateException  e) {
      return false;
    } 
  }
  
  public Departments getData(int pk) {
    try {
      Session sess = openSession();
      Departments data = (Departments) sess.createQuery("SELECT q FROM Departments q WHERE q.departmentId = " + pk).list().get(0);
      return data;
    } catch (HibernateException e) {
      return new Departments();
    } 
  }
}