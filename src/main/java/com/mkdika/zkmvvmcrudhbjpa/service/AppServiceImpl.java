package com.mkdika.zkmvvmcrudhbjpa.service;

import com.mkdika.zkmvvmcrudhbjpa.entity.TbPerson;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 */
@Service("appService")
@Transactional(readOnly = true, rollbackFor = Exception.class)
public class AppServiceImpl implements AppService {

    @Autowired
    private SessionFactory sessionFactory;

    public final Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    @Transactional(readOnly = false)
    public boolean save(Object obj) {
        getCurrentSession().saveOrUpdate(obj);
        return true;
    }

    @Override
    @Transactional(readOnly = false)
    public boolean update(Object obj) {
        getCurrentSession().update(obj);
        return true;
    }

    @Override
    @Transactional(readOnly = false)
    public boolean delete(Object obj) {
        getCurrentSession().delete(obj);
        return true;
    }

    @Override
    public List<TbPerson> getTbPersons() {
        List<TbPerson> list = getCurrentSession().createQuery("from TbPerson a order by a.firstname").list();
        return list;
    }

    @Override
    public TbPerson getTbPersonById(String id) {
        TbPerson t = (TbPerson) getCurrentSession().get(TbPerson.class, id);
        return t;
    }
}
