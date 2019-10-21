package com.sda.dao;

import com.sda.entities.Manager;
import com.sda.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;

public class ManagerDAO {

    public List<Manager> getManagersList(){
        Session session = HibernateUtils.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        List<Manager> managerList = new ArrayList<>();
        try {
            String sql = "FROM Manager";
            Query query = session.createQuery(sql, Manager.class);
            managerList = query.list();
        }catch (Exception e){
            e.printStackTrace();
        }

        transaction.commit();
        session.close();
        return managerList;
    }

}
