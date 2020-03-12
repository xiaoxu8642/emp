package com.bjsxt.jpa01.dao;

import com.bjsxt.jpa01.pojo.Emp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * @author xu
 * @DATE 2019 -09-17-20:41
 **/
@Repository
public interface EmpDao extends JpaRepository<Emp,Integer>,
        JpaSpecificationExecutor<Emp> {
}
