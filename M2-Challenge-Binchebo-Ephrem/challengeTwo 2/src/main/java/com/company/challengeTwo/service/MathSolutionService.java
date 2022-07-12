package com.company.challengeTwo.service;

import com.company.challengeTwo.model.MathSolution;
import com.company.challengeTwo.model.Response;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.Double.NaN;

@Service
public class MathSolutionService {
    private List<MathSolution> mathSolutionList = new ArrayList<>(Arrays.asList(
            new MathSolution(10, 23, "add", 30)
    ));

    public List<MathSolution> getAllMathSolution() {
        return mathSolutionList;
    }

    public Response addMathSolution(MathSolution mathSolution) {
        if (mathSolution.getOperation().equals("add") && !((double)mathSolution.getOperan1() == NaN) && !((double)mathSolution.getOperan1() == NaN)){
            mathSolution.setOperation("add");
            int ans = mathSolution.getOperan1() + mathSolution.getOperan2();
            mathSolution.setAnswer(ans);
            mathSolutionList.add(mathSolution);
            return new Response("The result of two operand: " + mathSolution.getAnswer()
                    +", & total size: " + mathSolutionList.size(), Boolean.TRUE);
        } else {
            return new Response("InvalidRequest: ", Boolean.FALSE);
        }
    }

    public Response subtractMathSolution(MathSolution mathSolution){
        if (mathSolution.getOperation().equals("subtract")) {
            mathSolution.setOperation("subtract");
            int ans = mathSolution.getOperan1() - mathSolution.getOperan2();
            mathSolution.setAnswer(ans);
            mathSolutionList.add(mathSolution);
            return new Response("The result of two operand: " + mathSolution.getAnswer()
                    +", & total size: " + mathSolutionList.size(), Boolean.TRUE);
        } else {
            return new Response("InvalidRequest: ", Boolean.FALSE);
        }
    }

    public Response multiplyMathSolution(MathSolution mathSolution) {
        if (mathSolution.getOperation().equals("multiply")) {
            mathSolution.setOperation("multiply");
            int ans = mathSolution.getOperan1() * mathSolution.getOperan2();
            mathSolution.setAnswer(ans);
            mathSolutionList.add(mathSolution);
            return new Response("The result of two operand: " + mathSolution.getAnswer()
                    +", & total size: " + mathSolutionList.size(), Boolean.TRUE);
        } else {
            return new Response("InvalidRequest: ", Boolean.FALSE);
        }
    }
    public Response divideMathSolution (MathSolution mathSolution){
        if (mathSolution.getOperation().equals("divide") && mathSolution.getOperan2() != 0) {
            mathSolution.setOperation("divide");
            int ans = mathSolution.getOperan1() / mathSolution.getOperan2();
            mathSolution.setAnswer(ans);
            mathSolutionList.add(mathSolution);
            return new Response("The result of two operand: " + mathSolution.getAnswer()
                    +", & total size: " + mathSolutionList.size(), Boolean.TRUE);
        } else {
            return new Response("InvalidRequest: ", Boolean.FALSE);
        }

    }
}
