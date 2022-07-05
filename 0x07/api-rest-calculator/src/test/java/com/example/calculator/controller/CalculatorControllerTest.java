package com.example.calculator.controller; import com.example.calculator.model.Calculator; import static 
org.junit.jupiter.api.Assertions.*; import org.junit.jupiter.api.Test; import org.junit.jupiter.api.extension.ExtendWith; import static 
org.mockito.Mockito.*; import org.springframework.beans.factory.annotation.Autowired; import 
org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest; import org.springframework.boot.test.mock.mockito.MockBean; import 
org.springframework.test.context.junit.jupiter.SpringExtension; import org.springframework.test.web.servlet.MockMvc; import 
org.springframework.test.web.servlet.MvcResult; import org.springframework.test.web.servlet.RequestBuilder; import java.time.LocalDate; 
import java.util.List; import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*; 
@ExtendWith(SpringExtension.class) @WebMvcTest(CalculatorController.class) public class CalculatorControllerTest {
    @Autowired private MockMvc mvc; @MockBean private Calculator calculator; @Test void messageWelcome() throws Exception { 
        RequestBuilder request = get("/calculator/welcome"); MvcResult result = mvc.perform(request).andReturn(); assertEquals("Bem 
        vindo à CALCULATOR API REST.", result.getResponse().getContentAsString());
    }
    @Test void addNumbers() throws Exception { when(calculator.sum(5D, 2D)).thenReturn(7.0); RequestBuilder request = 
        get("/calculator/addNumbers")
                .param("number1", "5") .param("number2", "2"); MvcResult result = mvc.perform(request).andReturn(); assertEquals(200, 
        result.getResponse().getStatus()); assertEquals("7.0", result.getResponse().getContentAsString());
    }
    @Test void subNumbers() throws Exception { when(calculator.sum(5D,2D)).thenReturn(3.0); RequestBuilder request = 
        get("/calculator/subNumbers")
                .param("number1", "5") .param("number2", "2"); MvcResult result = mvc.perform(request).andReturn(); assertEquals(200, 
        result.getResponse().getStatus()); assertEquals(result.getResponse().getContentAsString(), 
        result.getResponse().getContentAsString());
    }
    @Test void divideNumbers() throws Exception { when(calculator.divide(6D,2D)).thenReturn(3.0); RequestBuilder request = 
        get("/calculator/divideNumbers")
                .param("number1", "6") .param("number2", "2"); MvcResult result = mvc.perform(request).andReturn(); 
        System.out.println(result.getResponse().getContentAsString()); assertEquals(200, result.getResponse().getStatus()); 
        assertEquals("3.0", result.getResponse().getContentAsString());
    }
    @Test void factorial() throws Exception { when(calculator.factorial(5)).thenReturn(120); RequestBuilder request = 
        get("/calculator/factorial")
                .param("factorial", "5"); MvcResult result = mvc.perform(request).andReturn(); 
        System.out.println(result.getResponse().getContentAsString()); assertEquals(200, result.getResponse().getStatus()); 
        assertEquals("120", result.getResponse().getContentAsString());
    }
    @Test void calculeDayBetweenDate() throws Exception { when(calculator.calculeDayBetweenDate(LocalDate.of(2020, 3, 15), 
                LocalDate.of(2020, 3, 29))).thenReturn(14);
        RequestBuilder request = get("/calculator/calculeDayBetweenDate") .param("localDate1", "2020-03-15") .param("localDate2", 
                "2020-03-29");
        MvcResult result = mvc.perform(request).andReturn(); System.out.println(result.getResponse().getContentAsString()); 
        assertEquals(200, result.getResponse().getStatus()); assertEquals("14", result.getResponse().getContentAsString());
    }
    @Test void integerToBinary() throws Exception { when(calculator.integerToBinary(6)).thenReturn(110); RequestBuilder request = 
        get("/calculator/integerToBinary")
                .param("number1", "6"); MvcResult result = mvc.perform(request).andReturn(); 
        System.out.println(result.getResponse().getContentAsString()); assertEquals(200, result.getResponse().getStatus()); 
        assertEquals("110", result.getResponse().getContentAsString());
    }
    @Test void integerToHexadecimal() throws Exception { when(calculator.integerToHexadecimal(6)).thenReturn("6"); RequestBuilder 
        request = get("/calculator/integerToHexadecimal")
                .param("number1", "6"); MvcResult result = mvc.perform(request).andReturn(); 
        System.out.println(result.getResponse().getContentAsString()); assertEquals(200, result.getResponse().getStatus()); 
        assertEquals("6", result.getResponse().getContentAsString());
    }
}
