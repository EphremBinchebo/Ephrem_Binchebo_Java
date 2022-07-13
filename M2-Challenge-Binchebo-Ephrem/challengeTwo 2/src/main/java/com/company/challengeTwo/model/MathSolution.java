package com.company.challengeTwo.model;

import java.util.Objects;

public class MathSolution {
    private Integer operan1;
    private Integer operan2;
    private String operation;
    private int answer;

    public MathSolution() {
    }

    public MathSolution(Integer operan1, Integer operan2) {
        this.operan1 = operan1;
        this.operan2 = operan2;
    }

    public Integer getOperan1() {
        return operan1;
    }

    public void setOperan1(Integer operan1) {
        this.operan1 = operan1;
    }

    public Integer getOperan2() {
        return operan2;
    }

    public void setOperan2(Integer operan2) {
        this.operan2 = operan2;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MathSolution)) return false;
        MathSolution that = (MathSolution) o;
        return answer == that.answer && Objects.equals(operan1, that.operan1) && Objects.equals(operan2, that.operan2) && Objects.equals(operation, that.operation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operan1, operan2, operation, answer);
    }

    @Override
    public String toString() {
        return "MathSolution{" +
                "operan1=" + operan1 +
                ", operan2=" + operan2 +
                ", operation='" + operation + '\'' +
                ", answer=" + answer +
                '}';
    }
}
