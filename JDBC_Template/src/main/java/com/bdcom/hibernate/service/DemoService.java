package com.bdcom.hibernate.service;
import javax.annotation.Resource;

import com.bdcom.hibernate.bean.Demo;
import com.bdcom.hibernate.dao.DemoDao;
import com.bdcom.hibernate.dao.DemoRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * 提供Demo服务类.
 * @author jjl
 *
 */
@Service
public class DemoService {

@Resource
private DemoRepository demoRepository;
@Resource
private DemoDao demoDao;
public Demo getById(long id){
        //demoRepository.findOne(id);//在demoRepository可以直接使用findOne进行获取.
        return demoDao.getById(id);
    }

@Transactional
    public void save(Demo demo){
            demoRepository.save(demo);
            }
}