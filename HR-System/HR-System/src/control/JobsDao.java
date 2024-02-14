/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;


import java.util.ArrayList;
import java.util.List;
import model.Jobs;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class JobsDao implements DAOService<Jobs> {
  private final SessionFactory session = HibernateUtil.getSessionFactory();
  
  private List<Jobs> dataJobs;
  
  public Session openSession() {
    return (Session)this.session.openSession();
  }
  
  public List<Jobs> getAllData() {
    try {
      Session sess = openSession();
      Query q = sess.createQuery("SELECT q FROM Jobs q ORDER BY q.jobId ASC");
      List<Jobs> data = q.list();
      sess.close();
      return data;
    } catch (HibernateException e) {
      return new ArrayList<>();
    } 
  }
  
  public boolean insertData(Jobs param) {
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
  
  public boolean updateData(Jobs param) {
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
  
  public boolean deleteData(Jobs param) {
    try {
      Session sess = openSession();
      param = (Jobs) sess.createQuery("SELECT q FROM Jobs q WHERE q.jobId = " + param.getJobId()).list().get(0);
      Transaction t = sess.beginTransaction();
      sess.delete(param);
      t.commit();
      sess.close();
      return true;
    } catch (HibernateException e) {
      return false;
    } 
  }
  
  public Jobs getData(int pk) {
    try {
      Session sess = openSession();
      Jobs data = (Jobs) sess.createQuery("SELECT q FROM Jobs q WHERE q.jobId = " + pk).list().get(0);
      return data;
    } catch (HibernateException e) {
      return new Jobs();
    } 
  }
}
