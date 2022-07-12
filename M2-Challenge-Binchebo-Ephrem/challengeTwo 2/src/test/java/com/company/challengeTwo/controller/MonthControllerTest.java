package com.company.challengeTwo.controller;

import com.company.challengeTwo.model.Month;
import com.company.challengeTwo.service.MonthService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(MonthController.class)
public class MonthControllerTest {


    @Autowired
    private MockMvc mockMvc;
    @MockBean
    private MonthService monthService;

    private ObjectMapper mapper = new ObjectMapper();

    @Test
    public void shouldReturnAllMonthsInCollection() throws Exception {
        // ARRANGE
        mockMvc.perform(get("/month"))  // ACT
                .andDo(print())
                .andExpect(status().isOk());  // ASSERT
    }

    @Test
    public void shouldReturnMonthsByMonthNumberInCollection() throws Exception {

//        Month outputMonth = new Month();
//        outputMonth.setNumber(1);
//        outputMonth.setName("January");

       // String outputJson = mapper.writeValueAsString(outputMonth);
        // ARRANGE
        mockMvc.perform(get("/month/1"))
                .andDo(print())
                .andExpect(status().isOk())                     // ASSERT that we got back 200 OK.
                .andExpect(jsonPath("$.name").value("January"));
                // .andExpect(jsonPath("$.album").isNotEmpty());
               // .andExpect(content().json(outputJson));         // ASSERT that what we're expecting is what we got back.
    }
}