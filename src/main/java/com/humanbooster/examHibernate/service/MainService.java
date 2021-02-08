package com.humanbooster.examHibernate.service;

import com.humanbooster.examHibernate.dao.MainDao;
import com.humanbooster.examHibernate.model.Car;
import com.humanbooster.examHibernate.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.persistence.Query;
import java.util.List;

public class MainService implements MainDao {

    private SessionFactory sf;

    public MainService(){
        this.sf = HibernateUtil.getSessionFactory();
    }

    @Override
    public List listAllBrands() {
        Session session = this.sf.getCurrentSession();
        session.beginTransaction();

        String hql = "SELECT COUNT() AS count, marque\n" +
                "FROM car\n" +
                "GROUP BY car.marque";

        Query query = session.createQuery(hql);

        List result = query.getResultList();

        session.close();

        return result;
    }

    @Override
    public Integer countAllVehicles() {
        Session session = this.sf.getCurrentSession();
        session.beginTransaction();

        String hql = "SELECT COUNT(*) FROM `car`";

        Query query = session.createQuery(hql);

        List result = query.getResultList();

        session.close();

        return (Integer) result.get(1);
    }

    @Override
    public List listColorsWithCars() {

        Session session = this.sf.getCurrentSession();
        session.beginTransaction();

        String hql = "SELECT COUNT(*), color.libelle FROM color_car LEFT JOIN color on color_car.color_id = color.id GROUP BY color.libelle";

        Query query = session.createQuery(hql);

        List result = query.getResultList();

        session.close();

        return result;
    }

    @Override
    public List<Car> lastTenVehicles() {
        Session session = this.sf.getCurrentSession();
        session.beginTransaction();

        String hql = "SELECT * FROM `car` \n" +
                "ORDER BY `car`.`date_ajout`  DESC LIMIT 10";

        Query query = session.createQuery(hql);

        List result = query.getResultList();

        session.close();

        return result;
    }
}
