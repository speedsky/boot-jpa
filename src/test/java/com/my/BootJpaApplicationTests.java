package com.my;



import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.my.dao.EmpRepository;
import com.my.domain.Emp;



@RunWith(SpringRunner.class)
@SpringBootTest
public class BootJpaApplicationTests {

	@Test
	public void contextLoads() {
	}
	@Autowired
	private EmpRepository  empRepository;
	
	@Test
	public void testSave() {
		Emp emp = new Emp();
		emp.setName("张三");
		emp.setGender("男");
		emp.setTelephone("1346666677777");
		emp.setAddress("武汉洪山");

		empRepository.save(emp);
	}
}
