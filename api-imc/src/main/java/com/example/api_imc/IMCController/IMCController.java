package com.example.api_imc.IMCController;


import com.example.api_imc.DTO.ImcResponseDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/imc")
public class IMCController {
    @GetMapping("/calcular")
    public ImcResponseDTO calcularIMC(
            @RequestParam double peso,
            @RequestParam double altura) {

        double imc = peso / (altura * altura);
        String classificacao = "";

        if (imc < 18.5) {
            classificacao = "Abaixo do peso";
        } else if (imc < 25) {
            classificacao = "Peso normal";
        } else if (imc < 30) {
            classificacao = "Sobrepeso";
        } else if (imc < 35) {
            classificacao = "Obesidade Grau I";
        } else if (imc < 40) {
            classificacao = "Obesidade Grau II (Severa)";
        } else {
            classificacao = "Obesidade Grau III (Mórbida)";
        }

        return new ImcResponseDTO(imc, classificacao);
    }
}




