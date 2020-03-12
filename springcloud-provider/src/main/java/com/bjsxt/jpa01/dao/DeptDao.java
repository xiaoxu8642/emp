package com.bjsxt.jpa01.dao;

import com.bjsxt.jpa01.pojo.Dept;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author xu
 * @DATE 2019 -09-17-20:42
 **/
@Repository
public interface DeptDao extends JpaRepository<Dept,Integer> {
}
