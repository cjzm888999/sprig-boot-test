package com.bdcom.hibernate.service;
import javax.annotation.Resource;

import com.bdcom.hibernate.bean.Demo;
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

@Transactional
    public void save(Demo demo){
            demoRepository.save(demo);
            }
}