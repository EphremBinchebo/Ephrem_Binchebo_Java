package com.company.challengeTwo.controller;

import com.company.challengeTwo.model.MathSolution;
import com.company.challengeTwo.model.Response;
import com.company.challengeTwo.service.MathSolutionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(value = "/math")
public class MathSolutionController {
    @Autowired
    private MathSolutionService mathSolutionService;

    @GetMapping()
    public List<MathSolution> getAllMathSolution() {
        List<MathSolution> maths = mathSolutionService.getAllMathSolution();
        return maths;
    }

    @PostMapping("/add")
    public Response createAddMathSolution(@RequestBody MathSolution mathSolution) {
        return mathSolutionService.addMathSolution(mathSolution);
    }
    @PostMapping("/subtract")
    public Response createSubtractMathSolution(@RequestBody MathSolution mathSolution){
        return mathSolutionService.subtractMathSolution(mathSolution);
    }
    @PostMapping("/multiply")
    public Response createMultiplyMathSolution(@RequestBody MathSolution mathSolution){
        return mathSolutionService.multiplyMathSolution(mathSolution);
    }
    @PostMapping("/divide")
    public Response createDivideMathSolution(@RequestBody MathSolution mathSolution){
        return mathSolutionService.divideMathSolution(mathSolution);
    }
}
