package com.company.challengeTwo.service;

import com.company.challengeTwo.model.MathSolution;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class MathSolutionService {
    private List<MathSolution> mathSolutionList = new ArrayList<>(Arrays.asList(
            new MathSolution(10, 23)
    ));

    public List<MathSolution> getAllMathSolution() {
        return mathSolutionList;
    }

    public MathSolution addMathSolution(MathSolution mathSolution) {
        mathSolution.setOperation("add");
        int ans = mathSolution.getOperan1() + mathSolution.getOperan2();
        mathSolution.setAnswer(ans);
        mathSolutionList.add(mathSolution);
        return mathSolution;
    }
    public MathSolution subtractMathSolution(MathSolution mathSolution) {
        mathSolution.setOperation("subtract");
        int ans = mathSolution.getOperan1() - mathSolution.getOperan2();
        mathSolution.setAnswer(ans);
        mathSolutionList.add(mathSolution);
        return mathSolution;
    }
    public MathSolution multiplyMathSolution(MathSolution mathSolution) {

        mathSolution.setOperation("multiply");
        int ans = mathSolution.getOperan1() * mathSolution.getOperan2();
        mathSolution.setAnswer(ans);
        mathSolutionList.add(mathSolution);
        return mathSolution;
    }
    public MathSolution divideMathSolution (MathSolution mathSolution){
        mathSolution.setOperation("divide");
        int ans = mathSolution.getOperan1() / mathSolution.getOperan2();
        mathSolution.setAnswer(ans);
        mathSolutionList.add(mathSolution);
        return mathSolution;
    }
}
