package com.example.demo.Models;

//This is just a comment to show that the code has changed.

public class Calculator {
    private double leftOperand;
    private double rightOperand;
    private double middleOperand; //NEW
    private String operator;
    boolean triple;

    public Calculator(double leftOperand, double rightOperand, String operator) {
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
        this.operator = operator;
        this.triple = false;
    }
    
    //NEW constructor for 3 operands
    public Calculator(double leftOperand, double middleOperand, double rightOperand, String operator) {
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
        this.middleOperand = middleOperand;
        this.operator = operator;
        this.triple = true;
    }
    
    
    public double getLeftOperand() {
        return leftOperand;
    }

    public void setLeftOperand(double leftOperand) {
        this.leftOperand = leftOperand;
    }

    public double getRightOperand() {
        return rightOperand;
    }

    public void setRightOperand(double rightOperand) {
        this.rightOperand = rightOperand;
    }

    //NEW
    public double getMiddleOperand() {
        return middleOperand;
    }

    //NEW
    public void setMiddleOperand(double middleOperand) {
        this.middleOperand = middleOperand;
    }
    
    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public double calculateResult() {
        double result = 0;
        if (!triple) { //NEW
            switch(this.operator) {
                case "+":
                    result = this.leftOperand + this.rightOperand;
                    break;
                case "-":
                    result = this.leftOperand - this.rightOperand;
                    break;
                case "*":
                    result = this.leftOperand * this.rightOperand;
                    break;
                case "/":
                    result = this.leftOperand / this.rightOperand;
                    break;
                case "^":
                    result = Math.pow(this.leftOperand,this.rightOperand);
                    break;
                case "%":
                    result = this.leftOperand % this.rightOperand;
                    break;
                case "3":
                    result = Math.pow(this.leftOperand, 3);
                    break;
                default:
                    result = 0;
            }
        } else { //NEW else block.
            switch(this.operator) {
                case "+":
                    result = this.leftOperand + this.middleOperand + this.rightOperand;
                    break;
                case "-":
                    result = this.leftOperand - this.middleOperand - this.rightOperand;
                    break;
                case "*":
                    result = this.leftOperand * this.middleOperand * this.rightOperand;
                    break;
                default:
                    result = 0;
            }
        }

        return result;
    }
}
