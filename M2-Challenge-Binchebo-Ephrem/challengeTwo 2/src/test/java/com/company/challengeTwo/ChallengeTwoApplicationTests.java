package com.company.challengeTwo;
import com.company.challengeTwo.model.MathSolution;
import com.company.challengeTwo.model.Response;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
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
	public void setUp(){
		mockMvc=MockMvcBuilders.webAppContextSetup(context).build();
	}
	@Test
	public void checkAddMathSolutionTestForValidRequest() throws Exception{
		MathSolution math = new MathSolution();
		math.setOperan1(5);
		math.setOperan2(6);
		math.setOperation("add");


		String JsonRequest = objectMapper.writeValueAsString(math);
		MvcResult result = mockMvc.perform(post("/math/add").content(JsonRequest).contentType(MediaType.APPLICATION_JSON_VALUE))
				.andExpect(status().isOk()).andReturn();
		String resultContext = result.getResponse().getContentAsString();
		Response response = objectMapper.readValue(resultContext, Response.class);
		Assert.assertTrue(response.isStatus() == Boolean.TRUE);
	}
	@Test
	public void checkAddMathSolutionTestForInvalidRequest() throws Exception{
		MathSolution math = new MathSolution();
		math.setOperan1(8);
		math.setOperan2(7);
		math.setOperation("xx");


		String JsonRequest = objectMapper.writeValueAsString(math);
		MvcResult result = mockMvc.perform(post("/math/add").content(JsonRequest).contentType(MediaType.APPLICATION_JSON_VALUE))
				.andExpect(status().isOk()).andReturn();
		String resultContext = result.getResponse().getContentAsString();
		Response response = objectMapper.readValue(resultContext, Response.class);
		Assert.assertTrue(response.isStatus() == Boolean.FALSE);
	}

	@Test
	public void checkSubtractMathSolutionTestForValidRequest() throws Exception{
		MathSolution math = new MathSolution();
		math.setOperan1(33);
		math.setOperan2(76);
		math.setOperation("subtract");


		String JsonRequest = objectMapper.writeValueAsString(math);
		MvcResult result = mockMvc.perform(post("/math/subtract").content(JsonRequest).contentType(MediaType.APPLICATION_JSON_VALUE))
				.andExpect(status().isOk()).andReturn();
		String resultContext = result.getResponse().getContentAsString();
		Response response = objectMapper.readValue(resultContext, Response.class);
		Assert.assertTrue(response.isStatus() == Boolean.TRUE);
	}

	@Test
	public void checkSubtractMathSolutionTestForInValidRequest() throws Exception{
		MathSolution math = new MathSolution();
		math.setOperan1(60);
		math.setOperan2(78);
		math.setOperation("fxs");


		String JsonRequest = objectMapper.writeValueAsString(math);
		MvcResult result = mockMvc.perform(post("/math/subtract").content(JsonRequest).contentType(MediaType.APPLICATION_JSON_VALUE))
				.andExpect(status().isOk()).andReturn();
		String resultContext = result.getResponse().getContentAsString();
		Response response = objectMapper.readValue(resultContext, Response.class);
		Assert.assertTrue(response.isStatus() == Boolean.FALSE);
	}
	@Test
	public void checkMultiplyMathSolutionTestForValidRequest() throws Exception{
		MathSolution math = new MathSolution();
		math.setOperan1(8);
		math.setOperan2(45);
		math.setOperation("multiply");


		String JsonRequest = objectMapper.writeValueAsString(math);
		MvcResult result = mockMvc.perform(post("/math/multiply").content(JsonRequest).contentType(MediaType.APPLICATION_JSON_VALUE))
				.andExpect(status().isOk()).andReturn();
		String resultContext = result.getResponse().getContentAsString();
		Response response = objectMapper.readValue(resultContext, Response.class);
		Assert.assertTrue(response.isStatus() == Boolean.TRUE);
	}

	@Test
	public void checkMultiplyMathSolutionTestForInValidRequest() throws Exception{
		MathSolution math = new MathSolution();
		math.setOperan1(8);
		math.setOperan2(45);
		math.setOperation("mul");


		String JsonRequest = objectMapper.writeValueAsString(math);
		MvcResult result = mockMvc.perform(post("/math/multiply").content(JsonRequest).contentType(MediaType.APPLICATION_JSON_VALUE))
				.andExpect(status().isOk()).andReturn();
		String resultContext = result.getResponse().getContentAsString();
		Response response = objectMapper.readValue(resultContext, Response.class);
		Assert.assertTrue(response.isStatus() == Boolean.FALSE);
	}
	@Test
	public void checkDivideMathSolutionTestForValidRequest() throws Exception{
		MathSolution math = new MathSolution();
		math.setOperan1(5);
		math.setOperan2(6);
		math.setOperation("divide");


		String JsonRequest = objectMapper.writeValueAsString(math);
		MvcResult result = mockMvc.perform(post("/math/divide").content(JsonRequest).contentType(MediaType.APPLICATION_JSON_VALUE))
				.andExpect(status().isOk()).andReturn();
		String resultContext = result.getResponse().getContentAsString();
		Response response = objectMapper.readValue(resultContext, Response.class);
		Assert.assertTrue(response.isStatus() == Boolean.TRUE);
	}
	@Test
	public void checkDivideMathSolutionTestForInValidRequest() throws Exception{
		MathSolution math = new MathSolution();
		math.setOperan1(5);
		math.setOperan2(0);
		math.setOperation("divide");


		String JsonRequest = objectMapper.writeValueAsString(math);
		MvcResult result = mockMvc.perform(post("/math/divide").content(JsonRequest).contentType(MediaType.APPLICATION_JSON_VALUE))
				.andExpect(status().isOk()).andReturn();
		String resultContext = result.getResponse().getContentAsString();
		Response response = objectMapper.readValue(resultContext, Response.class);
		Assert.assertTrue(response.isStatus() == Boolean.FALSE);
	}

	@Test
	public void checkDivideMathSolutionTestForDividedByZero() throws Exception{
		MathSolution math = new MathSolution();
		math.setOperan1(5);
		math.setOperan2(0);
		math.setOperation("divide");


		String JsonRequest = objectMapper.writeValueAsString(math);
		MvcResult result = mockMvc.perform(post("/math/divide").content(JsonRequest).contentType(MediaType.APPLICATION_JSON_VALUE))
				.andExpect(status().isOk()).andReturn();
		String resultContext = result.getResponse().getContentAsString();
		Response response = objectMapper.readValue(resultContext, Response.class);
		Assert.assertTrue(response.isStatus() == Boolean.FALSE);
	}
}
