package com.mkdika.zkmvvmcrudhbjpa.service;

import com.mkdika.zkmvvmcrudhbjpa.entity.TbPerson;
import java.util.List;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 */
public interface AppService {
    
    public boolean save(Object obj);
    
    public boolean update(Object obj);

    public boolean delete(Object obj);
    
    public List<TbPerson> getTbPersons();
    
    public TbPerson getTbPersonById(String id);
    
}
