/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author MSI
 */
@Entity
@Table(name = "jobs")
@NamedQueries({
    @NamedQuery(name = "Jobs.findAll", query = "SELECT j FROM Jobs j"),
    @NamedQuery(name = "Jobs.findByJobId", query = "SELECT j FROM Jobs j WHERE j.jobId = :jobId"),
    @NamedQuery(name = "Jobs.findByJobTitle", query = "SELECT j FROM Jobs j WHERE j.jobTitle = :jobTitle"),
    @NamedQuery(name = "Jobs.findByMinSalary", query = "SELECT j FROM Jobs j WHERE j.minSalary = :minSalary"),
    @NamedQuery(name = "Jobs.findByMaxSalary", query = "SELECT j FROM Jobs j WHERE j.maxSalary = :maxSalary")})
public class Jobs implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "job_id")
    private Integer jobId;
    @Basic(optional = false)
    @Column(name = "job_title")
    private String jobTitle;
    @Basic(optional = false)
    @Column(name = "min_salary")
    private double minSalary;
    @Basic(optional = false)
    @Column(name = "max_salary")
    private double maxSalary;
    @OneToMany(cascade = {CascadeType.ALL}, mappedBy = "jobId", fetch = FetchType.LAZY)
    private List<Employees> employeesList;

    public Jobs() {
    }

    public Jobs(Integer jobId) {
        this.jobId = jobId;
    }

    public Jobs(Integer jobId, String jobTitle, double minSalary, double maxSalary) {
        this.jobId = jobId;
        this.jobTitle = jobTitle;
        this.minSalary = minSalary;
        this.maxSalary = maxSalary;
    }

    public Integer getJobId() {
        return jobId;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(double minSalary) {
        this.minSalary = minSalary;
    }

    public double getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(double maxSalary) {
        this.maxSalary = maxSalary;
    }

    public List<Employees> getEmployeesList() {
        return employeesList;
    }

    public void setEmployeesList(List<Employees> employeesList) {
        this.employeesList = employeesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (jobId != null ? jobId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Jobs)) {
            return false;
        }
        Jobs other = (Jobs) object;
        if ((this.jobId == null && other.jobId != null) || (this.jobId != null && !this.jobId.equals(other.jobId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Jobs[ jobId=" + jobId + " ]";
    }
    
}
