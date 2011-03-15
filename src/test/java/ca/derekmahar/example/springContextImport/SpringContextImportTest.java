package ca.derekmahar.example.springContextImport;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ca.derekmahar.example.springContextImport.bean.A;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class SpringContextImportTest {
	
	@Resource
	private A a;
	
	@Test
	public void runA() throws Exception {
		a.run();
	}
}
