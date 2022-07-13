package com.company.challengeTwo.controller;

import com.company.challengeTwo.model.MathSolution;
import com.company.challengeTwo.service.MathSolutionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
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
    @ResponseStatus(HttpStatus.CREATED)
    public @Valid MathSolution createAddMathSolution(@RequestBody @Valid MathSolution mathSolution) {
        return mathSolutionService.addMathSolution(mathSolution);

    }
    @PostMapping("/subtract")
    @ResponseStatus(HttpStatus.CREATED)
    public @Valid MathSolution  createSubtractMathSolution(@RequestBody MathSolution mathSolution){
        return mathSolutionService.subtractMathSolution(mathSolution);
    }
    @PostMapping("/multiply")
    @ResponseStatus(HttpStatus.CREATED)
    public  MathSolution  createMultiplyMathSolution(@RequestBody MathSolution mathSolution){
        return mathSolutionService.multiplyMathSolution(mathSolution);
    }
    @PostMapping("/divide")
    @ResponseStatus(HttpStatus.CREATED)
    public @Valid MathSolution createDivideMathSolution(@RequestBody MathSolution mathSolution){
        return mathSolutionService.divideMathSolution(mathSolution);
    }
}
