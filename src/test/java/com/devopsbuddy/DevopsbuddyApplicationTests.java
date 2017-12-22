package com.devopsbuddy;

import com.devopsbuddy.web.i18n.I18NService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
//@SpringApplicationConfiguration(classes =DevopsbuddyApplication.class)
//@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
public class DevopsbuddyApplicationTests {

	@Autowired
	private I18NService i18NService;

	@Test
	public void testMessageByLocaleService() throws Exception {
		String expectedResult ="Bootstrap starter template";
		String messageId ="index.main.callouts";
		String actual = i18NService.getMessage(messageId);

	}

}
