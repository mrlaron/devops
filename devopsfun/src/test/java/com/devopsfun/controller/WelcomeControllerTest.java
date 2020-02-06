package com.devopsfun.controller;

import com.devopsfun.DemoApplication;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.junit.matchers.JUnitMatchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringJUnit4ClassRunner.class)
@AutoConfigureMockMvc
@SpringBootTest(classes={DemoApplication.class})
@WebAppConfiguration
 public class WelcomeControllerTest {



    private MockMvc mockMvc;
    @Autowired
    private WebApplicationContext context;


    @Before
    public void setUp ()  {
         mockMvc = MockMvcBuilders.webAppContextSetup(context).build();

    }

    @Test
    public void welcome() throws Exception {


        System.out.println(model().attributeExists("course"));
      mockMvc.perform(get("/")).
                 andExpect(status().isOk()).
                 andExpect(model().attributeExists("course"));// match("devops");

      //  mockMvc.perform(get("/")).andExpect(status().isOk());

    }

    @Test
    public void contextLoads() {
    }
}