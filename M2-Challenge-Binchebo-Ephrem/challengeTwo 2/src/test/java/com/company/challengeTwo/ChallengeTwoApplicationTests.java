package com.company.challengeTwo;

import com.company.challengeTwo.model.MathSolution;
import com.company.challengeTwo.model.Month;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.HashMap;
import java.util.Map;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ChallengeTwoApplicationTests {
    private MockMvc mockMvc;
    @Autowired
    private WebApplicationContext context;
    ObjectMapper objectMapper = new ObjectMapper();

    @Before
    public void setUp() {
        mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
    }
       //Mock Mvc Test For MathSolutionController
    @Test
	public void checkAddMathSolutionTestForAValidRequest() throws Exception {
		//Arrange
		MathSolution mathSolution = new MathSolution(25, 55);
		mathSolution.setAnswer(80);
		mathSolution.setOperation("add");

		String inputJson = objectMapper.writeValueAsString(mathSolution);
         //Act
		mockMvc.perform(MockMvcRequestBuilders.post("/math/add")             //Perform
						.content(inputJson)
						.contentType(MediaType.APPLICATION_JSON))
				.andDo(print())                                                         //Print
				.andExpect(status().isCreated())
				.andExpect(content().json(inputJson));                                  //Assert(status : )
	}

    @Test
    public void checkMissingOperandRequest_442Error_ForAddMathSolution() throws Exception {
		//Arrange
        Map<String, String> MathSolution = new HashMap<>();
        MathSolution.put("operan1", "44");


        String inputJson = objectMapper.writeValueAsString(MathSolution);
        //Act
        mockMvc.perform(MockMvcRequestBuilders.post("/math/add")         //Perform
                        .content(inputJson)
                        .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())                                                     //Print
                .andExpect(status().is4xxClientError());                            //Assert(status : )
    }

    @Test
    public void checkAddMathSolutionForNonIntOperand_442Error() throws Exception {
		//Arrange
        Map<String, String> map = new HashMap<>();
        map.put("operan1", "688");
        map.put("operan2", "mmm");

        String inputJson = objectMapper.writeValueAsString(map);

        //Act
        mockMvc.perform(MockMvcRequestBuilders.post("/math/add")             //Perform
                        .content(inputJson)
                        .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())                                                          //Print
                .andExpect(status().isUnprocessableEntity());                           //Assert(status : )
    }


    @Test
    public void checkSubtractMathSolutionTestForAValidRequest() throws Exception {
		//Arrange
        MathSolution mathSolution = new MathSolution(25, 55);
        mathSolution.setAnswer(-30);
        mathSolution.setOperation("subtract");

        String inputJson = objectMapper.writeValueAsString(mathSolution);
        //Act
        mockMvc.perform(MockMvcRequestBuilders.post("/math/subtract")        //Perform
                        .content(inputJson)
                        .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isCreated())                                      //Print
                .andExpect(content().json(inputJson));                                //Assert(status : )
    }

    @Test
    public void checkSubtractMathSolutionForNonIntOperand_442Error() throws Exception {
		//Arrange
        Map<String, String> map = new HashMap<>();
        map.put("operan1", "456");
        map.put("operan2", "uyu");

        String inputJson = objectMapper.writeValueAsString(map);
        //Act
        mockMvc.perform(MockMvcRequestBuilders.post("/math/subtract")          //Perform
                        .content(inputJson)
                        .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())                                                           //Print to console
                .andExpect(status().isUnprocessableEntity());                             //Assert( status: 200)
    }

    @Test
    public void checkMissingOperandRequest_442Error_ForSubtractMathSolution()throws Exception {
		//Arrange
        Map<String, String> MathSolution = new HashMap<>();
        MathSolution.put("operan1", "44");


        String inputJson = objectMapper.writeValueAsString(MathSolution);
        //Act
        mockMvc.perform(MockMvcRequestBuilders.post("/math/add")             //Perform
                        .content(inputJson)
                        .contentType(MediaType.APPLICATION_JSON))                      //Print
                .andDo(print())
                .andExpect(status().is4xxClientError());                              //Assert(status : )
    }

    @Test
    public void checkMultiplyMathSolutionTestForAValidRequest() throws Exception {
		//Arrange
        MathSolution mathSolution = new MathSolution(20, 25);
        mathSolution.setAnswer(500);
        mathSolution.setOperation("multiply");

        String inputJson = objectMapper.writeValueAsString(mathSolution);
         //Act
        mockMvc.perform(MockMvcRequestBuilders.post("/math/multiply")             //Perform
                        .content(inputJson)
                        .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())                                                       //Print
                .andExpect(status().isCreated())                                      //Assert
                .andExpect(content().json(inputJson));                               //Assert(status : )
    }

    @Test
    public void checkMissingOperandRequest_442Error_ForMultiplyMathSolution() throws Exception {
		//Arrange
        Map<String, String> MathSolution = new HashMap<>();
        MathSolution.put("operan1", "44");


        String inputAdd = objectMapper.writeValueAsString(MathSolution);

        //Act
        mockMvc.perform(MockMvcRequestBuilders.post("/math/multiply")         //Perform
                        .content(inputAdd)
                        .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())                                                         //Print
                .andExpect(status().is4xxClientError());                               //Assert(status : )
    }

    @Test
    public void checkMultiplyMathSolutionForNonIntOperand_442Error() throws Exception {
		//Arrange
        Map<String, String> map = new HashMap<>();
        map.put("operan1", "444");
        map.put("operan2", "uyu");

        String inputJson = objectMapper.writeValueAsString(map);
        //Act
        mockMvc.perform(MockMvcRequestBuilders.post("/math/multiply")         //Perform
                        .content(inputJson)
                        .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())                                                           //Print
                .andExpect(status().isUnprocessableEntity());                             //Assert(status : )
    }

    @Test
    public void checkDivideMathSolutionTestForAValidRequest() throws Exception {
		//Arrange
        MathSolution mathSolution = new MathSolution(40, 20);
        mathSolution.setAnswer(2);
        mathSolution.setOperation("divide");

        String inputJson = objectMapper.writeValueAsString(mathSolution);
        //Act
        mockMvc.perform(MockMvcRequestBuilders.post("/math/divide")        //Perform
                        .content(inputJson)
                        .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())                                                        //Print
                .andExpect(status().isCreated())
                .andExpect(content().json(inputJson));                                //Assert(status : )
    }

    @Test
    public void checkDivideMathSolutionForNonIntOperand_442Error() throws Exception {
		//Arrange
        Map<String, String> map = new HashMap<>();
        map.put("operan1", "hhh");
        map.put("operan2", "888");

        String inputJson = objectMapper.writeValueAsString(map);
       //Act
        mockMvc.perform(MockMvcRequestBuilders.post("/math/divide")            //Perform
                        .content(inputJson)
                        .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())                                                            //Print
                .andExpect(status().isUnprocessableEntity());                              //Assert(status : )
    }

    @Test
    public void checkMissingOperandRequest_442Error_ForDivideMathSolution() throws Exception {
		//Arrange
        Map<String, String> MathSolution = new HashMap<>();
        MathSolution.put("operan1", "44");


        String inputJson = objectMapper.writeValueAsString(MathSolution);
        //Act
        mockMvc.perform(MockMvcRequestBuilders.post("/math/add")             //Perform
                        .content(inputJson)
                        .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())                                                         //Print
                .andExpect(status().is4xxClientError());                                //Assert(status : )
    }

    @Test
    public void checkDivideByZeroReqNonInt_442Error_ForDivideMathSolution() throws Exception {
		//Arrange
        MathSolution mathSolution = new MathSolution(40, 0);
        String inputJson = objectMapper.writeValueAsString(mathSolution);
        //Act
        mockMvc.perform(MockMvcRequestBuilders.post("/math/divide")
                        .content(inputJson)
                        .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())                                                            //Print
                .andExpect(status().isUnprocessableEntity());                              //Assert(status : )
    }

	//Mock Mvc Test for MonthController

    @Test
    public void checkMonthForAValidRequest() throws Exception {

		// ARRANGE
		Month expectedMonth = new Month(2, "February");
		String inputJson = objectMapper.writeValueAsString(expectedMonth);
        //Act
		mockMvc.perform(get("/month/2"))  // ACT
				.andDo(print())
				.andExpect(status().isOk())            //Assert
				.andExpect(content().json(inputJson));  // ASSERT
	}


    @Test
    public void CheckMonthForInvalid_404Error() throws Exception {

        mockMvc.perform(get("/month/567"))
                .andDo(print())
                .andExpect(status().isUnprocessableEntity());

    }

	@Test
	public void checkMonthForRandomMonthRequest() throws Exception {

		mockMvc.perform(get("/randomMonth"))  // ACT
				.andDo(print())                          //Print
				.andExpect(status().isOk());            //Assert

	}

}

