package com.spring.rest.demo.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;
import org.springframework.test.context.web.WebAppConfiguration;

import com.spring.rest.demo.config.AppTestConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppTestConfig.class, loader = AnnotationConfigContextLoader.class)
@TestExecutionListeners({TransactionalTestExecutionListener.class,
    DependencyInjectionTestExecutionListener.class})
//@WebAppConfiguration
// @TransactionConfiguration(defaultRollback = true)
// @Transactional
// @ActiveProfiles("dev")
public class UserServiceImplTest {

	/*@Autowired
	private UserService userService;*/

	@Test
    public void test() {}
	
	//@Test
	public void testFindAllUsers() {
		/*List<UserModel> users = userService.findAllUsers();
		if (users != null) {
			System.out.println("users="+users);
		} else {
			System.out.println("No user exist----------");
		}*/
	}

}
