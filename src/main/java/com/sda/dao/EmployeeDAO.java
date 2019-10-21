package com.sda.dao;

import com.sda.entities.Employee;
import com.sda.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;


import org.hibernate.query.Query;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {

    public List<Employee> getEmployeesList(){
        Session session = HibernateUtils.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        List<Employee> employeeList = new ArrayList<>();
        try {
            String sql = "from Employee";
            Query query = session.createQuery(sql, Employee.class);
            employeeList = query.list();
        } catch (Exception e) {
            e.printStackTrace();
        }
        transaction.commit();
        session.close();
        return employeeList;
    }


}
