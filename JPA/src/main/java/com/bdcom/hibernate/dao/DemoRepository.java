package com.bdcom.hibernate.dao;


import com.bdcom.hibernate.bean.Demo;
import org.springframework.data.repository.CrudRepository;

/*   这是一个接口，没有具体的实现，这就是JPA
     * 在CrudRepository自带常用的crud方法.
     * 这样一个基本dao就写完了.
     */
    public interface DemoRepository extends CrudRepository<Demo, Long> {

    }

