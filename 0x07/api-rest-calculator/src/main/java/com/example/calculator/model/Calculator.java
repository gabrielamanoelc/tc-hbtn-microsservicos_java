package com.example.calculator.model; import org.springframework.stereotype.Service; import java.time.LocalDate; import 
java.time.temporal.ChronoUnit; @Service public class Calculator {
    public Double sum(Double number1, Double number2) { if(number1 != null && number2 != null){ return number1 + number2;
        } else {
            throw new NullPointerException("Número 1 e número 2 são obrigatórios.");
        }
    }
    public Double sub(Double number1, Double number2) { if(number1 != null && number2 != null){ return number1 - number2;
        } else {
            throw new NullPointerException("Número 1 e número 2 são obrigatórios.");
        }
    }
    public Double divide (Double number1, Double number2) { if(number1 != null && number2 != null){ if(number1 != 0 && number2 != 0){ 
                return number1 / number2;
            } else {
                throw new ArithmeticException("Divisão por zero não é permitido.");
            }
        } else {
            throw new NullPointerException("Número 1 e número 2 são obrigatórios.");
        }
    }
    public Integer factorial(Integer factorial) { if(factorial == null){ throw new NullPointerException("Número é obrigatório.");
        }
        int f = factorial; while (factorial > 1) { f = f * (factorial - 1); factorial--;
        }
        return f;
        // Exemplos: Integer = 1 -> Binary = 1 Integer = 5 -> Binary = 101 Integer = 20 -> Binary = 10100
    }
    public Integer integerToBinary(Integer integer) { String binaryString = Integer.toBinaryString(integer); return 
        Integer.parseInt(binaryString);
    }
    public String integerToHexadecimal(Integer integer) { return Integer.toHexString(integer);
    }
    public int calculeDayBetweenDate(LocalDate date1, LocalDate date2) { return (int) date1.until(date2, ChronoUnit.DAYS);
    }
}
