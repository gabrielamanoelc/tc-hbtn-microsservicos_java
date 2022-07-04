package com.song.MegaSenaAPI; import org.springframework.web.bind.annotation.GetMapping; import 
org.springframework.web.bind.annotation.RequestMapping; import org.springframework.web.bind.annotation.RestController; import 
java.util.ArrayList; import java.util.List; import java.util.Random; @RestController @RequestMapping(value="/megasena") public class 
MegaSenaController {
    @GetMapping("/simpleMessageWelcome") public String mensagemBoasVindas() { return "Bem vindo a API REST para geração de números para 
        a loteria Mega Sena.";
    }
    @GetMapping("/getNumbers") public List<Integer> numerosMegaSena() { List<Integer> numberList = new ArrayList<>(); for (int i = 0; i 
        < 6; i++){
            numberList.add(new Random().nextInt(6));
        }
        return numberList;
    }
}
