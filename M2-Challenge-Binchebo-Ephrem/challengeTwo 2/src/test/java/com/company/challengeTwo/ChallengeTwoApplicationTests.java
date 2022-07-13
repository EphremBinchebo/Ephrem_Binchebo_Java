package com.company.challengeTwo;
import com.company.challengeTwo.model.MathSolution;
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

	@Test
	public void checkAddMathSolutionTestForAValidRequest() throws Exception {
		MathSolution mathSolution = new MathSolution(25, 55);
		mathSolution.setAnswer(80);
		mathSolution.setOperation("add");

		String outputJson = objectMapper.writeValueAsString(mathSolution);

		mockMvc.perform(MockMvcRequestBuilders.post("/math/add")
						.content(outputJson)
						.contentType(MediaType.APPLICATION_JSON))
				.andDo(print())
				.andExpect(status().isCreated())
				.andExpect(content().json(outputJson));
	}

	@Test
	public void missingOperandReqNonInt442ErrorForAddMathSolution() throws Exception {
		Map<String, String> MathSolution = new HashMap<>();
		MathSolution.put("operan1", "44");


		String inputAdd = objectMapper.writeValueAsString(MathSolution);

		mockMvc.perform(MockMvcRequestBuilders.post("/math/add")
						.content(inputAdd)
						.contentType(MediaType.APPLICATION_JSON))
				.andDo(print())
				.andExpect(status().is4xxClientError());
	}

	@Test
	public void AddOperandReqNonInt442Error() throws Exception {
		Map<String, String> map = new HashMap<>();
		map.put("operan1", "688");
		map.put("operan2", "mmm");

		String inputJson = objectMapper.writeValueAsString(map);

		mockMvc.perform(MockMvcRequestBuilders.post("/math/add")
						.content(inputJson)
						.contentType(MediaType.APPLICATION_JSON))
				.andDo(print())
				.andExpect(status().isUnprocessableEntity());
	}


	@Test
	public void checkSubtractMathSolutionTestForAValidRequest() throws Exception {
		MathSolution mathSolution = new MathSolution(25, 55);
		mathSolution.setAnswer(-30);
		mathSolution.setOperation("subtract");

		String outputJson = objectMapper.writeValueAsString(mathSolution);

		mockMvc.perform(MockMvcRequestBuilders.post("/math/subtract")
						.content(outputJson)
						.contentType(MediaType.APPLICATION_JSON))
				.andDo(print())
				.andExpect(status().isCreated())
				.andExpect(content().json(outputJson));
	}

	@Test
	public void subtractOperandReqNonInt442Error() throws Exception {
		Map<String, String> map = new HashMap<>();
		map.put("operan1", "456");
		map.put("operan2", "uyu");

		String inputJson = objectMapper.writeValueAsString(map);

		mockMvc.perform(MockMvcRequestBuilders.post("/math/subtract")
						.content(inputJson)
						.contentType(MediaType.APPLICATION_JSON))
				.andDo(print())
				.andExpect(status().isUnprocessableEntity());
	}

	@Test
	public void missingOperandReqNonInt442ErrorForSubtractMathSolution() throws Exception {
		Map<String, String> MathSolution = new HashMap<>();
		MathSolution.put("operan1", "44");


		String inputAdd = objectMapper.writeValueAsString(MathSolution);

		mockMvc.perform(MockMvcRequestBuilders.post("/math/add")
						.content(inputAdd)
						.contentType(MediaType.APPLICATION_JSON))
				.andDo(print())
				.andExpect(status().is4xxClientError());
	}

	@Test
	public void checkMultiplyMathSolutionTestForAValidRequest() throws Exception {
		MathSolution mathSolution = new MathSolution(20, 25);
		mathSolution.setAnswer(500);
		mathSolution.setOperation("multiply");

		String outputJson = objectMapper.writeValueAsString(mathSolution);

		mockMvc.perform(MockMvcRequestBuilders.post("/math/multiply")
						.content(outputJson)
						.contentType(MediaType.APPLICATION_JSON))
				.andDo(print())
				.andExpect(status().isCreated())
				.andExpect(content().json(outputJson));
	}

	@Test
	public void missingOperandReqNonInt442ErrorForMultiplyMathSolution() throws Exception {
		Map<String, String> MathSolution = new HashMap<>();
		MathSolution.put("operan1", "44");


		String inputAdd = objectMapper.writeValueAsString(MathSolution);

		mockMvc.perform(MockMvcRequestBuilders.post("/math/multiply")
						.content(inputAdd)
						.contentType(MediaType.APPLICATION_JSON))
				.andDo(print())
				.andExpect(status().is4xxClientError());
	}

	@Test
	public void multiplyOperandReqNonInt442Error() throws Exception {
		Map<String, String> map = new HashMap<>();
		map.put("operan1", "444");
		map.put("operan2", "uyu");

		String inputJson = objectMapper.writeValueAsString(map);

		mockMvc.perform(MockMvcRequestBuilders.post("/math/multiply")
						.content(inputJson)
						.contentType(MediaType.APPLICATION_JSON))
				.andDo(print())
				.andExpect(status().isUnprocessableEntity());
	}

	@Test
	public void checkDivideMathSolutionTestForAValidRequest() throws Exception {
		MathSolution mathSolution = new MathSolution(40, 20);
		mathSolution.setAnswer(2);
		mathSolution.setOperation("divide");

		String outputJson = objectMapper.writeValueAsString(mathSolution);

		mockMvc.perform(MockMvcRequestBuilders.post("/math/divide")
						.content(outputJson)
						.contentType(MediaType.APPLICATION_JSON))
				.andDo(print())
				.andExpect(status().isCreated())
				.andExpect(content().json(outputJson));
	}

	@Test
	public void divideOperandReqNonInt442Error() throws Exception {
		Map<String, String> map = new HashMap<>();
		map.put("operan1", "hhh");
		map.put("operan2", "888");

		String inputJson = objectMapper.writeValueAsString(map);

		mockMvc.perform(MockMvcRequestBuilders.post("/math/divide")
						.content(inputJson)
						.contentType(MediaType.APPLICATION_JSON))
				.andDo(print())
				.andExpect(status().isUnprocessableEntity());
	}

	@Test
	public void missingOperandReqNonInt442ErrorForDivideMathSolution() throws Exception {
		Map<String, String> MathSolution = new HashMap<>();
		MathSolution.put("operan1", "44");


		String inputAdd = objectMapper.writeValueAsString(MathSolution);

		mockMvc.perform(MockMvcRequestBuilders.post("/math/add")
						.content(inputAdd)
						.contentType(MediaType.APPLICATION_JSON))
				.andDo(print())
				.andExpect(status().is4xxClientError());
	}

	@Test
	public void divideByZeroReqNonInt442Error() throws Exception {
		MathSolution mathSolution = new MathSolution(40, 0);


		String outputJson = objectMapper.writeValueAsString(mathSolution);

		mockMvc.perform(MockMvcRequestBuilders.post("/math/divide")
						.content(outputJson)
						.contentType(MediaType.APPLICATION_JSON))
				.andDo(print())
				.andExpect(status().isUnprocessableEntity());
	}
	@Test
	public void checkMonthForAValidRequest() throws Exception {

		mockMvc.perform(get("/month/567"))
				.andDo(print())
				.andExpect(status().isUnprocessableEntity());

	}


	@Test
	public void monthNotReturned404Error() throws Exception {

		mockMvc.perform(get("/month/567"))
				.andDo(print())
				.andExpect(status().isUnprocessableEntity());

	}
}

