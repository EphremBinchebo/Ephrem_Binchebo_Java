package com.company.challengeTwo.model;

import java.util.Objects;

public class MathSolution {
    private int operan1;
    private int operan2;
    private String operation;
    private int answer;

    public MathSolution() {
    }

    public MathSolution(int operan1, int operan2, String operation, int answer) {
        this.operan1 = operan1;
        this.operan2 = operan2;
        this.operation = operation;
        this.answer = answer;
    }

    public int getOperan1() {
        return operan1;
    }

    public void setOperan1(int operan1) {
        this.operan1 = operan1;
    }

    public int getOperan2() {
        return operan2;
    }

    public void setOperan2(int operan2) {
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
        return operan1 == that.operan1 && operan2 == that.operan2 && answer == that.answer && Objects.equals(operation, that.operation);
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
