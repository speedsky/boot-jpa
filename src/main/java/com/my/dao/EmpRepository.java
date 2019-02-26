package com.my.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.my.domain.Emp;


/**
 * 参数一：需要映射的实体
 * 参数二：实体里面的OID的类型 
 *
 */
public interface EmpRepository extends JpaRepository<Emp, Integer>,JpaSpecificationExecutor<Emp>{
	
	//查询name(驼峰式名称)
	List<Emp> findByName(String name);
	List<Emp> findByNameAndGender(String name,String gender);
	List<Emp> findByTelephoneLike(String telphone);
	
	@Query("from Emp where name = ?1 ")
	List<Emp> queryName(String name);
	
	@Query(value="select * from t_emp where name = ?1 ",nativeQuery=true)
	List<Emp> queryName2(String name);
	
	@Query("update Emp set address = ?1 where id = ?2 ")
	@Modifying // 进行修改操作
	void updateAddressById(String address,Integer id);
}
