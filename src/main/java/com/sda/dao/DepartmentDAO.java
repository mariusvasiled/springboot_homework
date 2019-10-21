package com.sda.dao;

import com.sda.entities.Department;
import com.sda.entities.Manager;
import com.sda.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;

public class DepartmentDAO {
    public List<Department> getDepartmentsList(){
        Session session = HibernateUtils.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        List<Department> departmentList = new ArrayList<>();
        try {
            String sql = "from Manager";
            Query query = session.createQuery(sql, Manager.class);
            departmentList = query.list();
        }catch (Exception e){
            e.printStackTrace();
        }

        transaction.commit();
        session.close();
        return departmentList;
    }
}
