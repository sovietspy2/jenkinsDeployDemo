package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import static org.assertj.core.api.Assertions.*;


import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class DemoApplicationTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void contextLoads() throws Exception {
       mockMvc.perform(MockMvcRequestBuilders.get("/test")
               .accept(MediaType.APPLICATION_JSON))
               .andExpect(status().isOk())
               .andReturn();
    }

    @Test
    void otherTest() throws Exception {
        MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get("/test")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andReturn();

        String data = result.getResponse().getContentAsString();
        System.out.println(data);
        assertThat(data).isEqualTo("Hello there! General Kenobi!");
    }

}
