package com.cunsen.demo;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockServletContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

//@RunWith(SpringJUnit4ClassRunner.class)

@WebAppConfiguration
@RunWith(SpringRunner.class)
@SpringBootTest(classes = MockServletContext.class)
public class MybootApplicationTests {

	private MockMvc mvc;
	
	@Before
	public void setup(){
		mvc  = MockMvcBuilders.standaloneSetup(new HelloWorld()).build();
	}
	
	@Test
	public void contextLoads() throws Exception {
		RequestBuilder request = null;
		
		request = get("/hello");
		mvc.perform(request).andExpect(status().isOk())
							.andExpect(content().string(equalTo("helloworld")));
	}

}

