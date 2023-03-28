package com.example.service.impl;

import com.example.service.ICalculatorService;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService implements ICalculatorService {
    public double calculator(double number1, double number2, double result, String calcul) {
        switch (calcul) {
            case "Addition(+)":
                result = number1 + number2;
                break;
            case "Subtraction(-)":
                result = number1 - number2;
                break;
            case "Multiplication(X)":
                result = number1 * number2;
                break;
            case "Division(/)":
                result = number1 / number2;
                break;
        }
        return result;
    }
}
