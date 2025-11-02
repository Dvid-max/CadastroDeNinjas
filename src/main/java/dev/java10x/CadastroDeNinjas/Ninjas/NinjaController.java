package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "Olá, Mundo!";
    }

    //Adicionar Ninja (CREATE)
    @PostMapping("/criar")
    public String criarNinja() {
        return "Ninja criado";
    }
    //Mostrar todos os Ninjas (READ)
    @GetMapping("/listar")
    public String mostrarTodosOsNinjas(){
        return "Todos";
    }
    //Mostrar ninjas por ID (READ)
    @GetMapping("/listarID")
    public String mostrarTodosOsNinjasID(){
        return "Todos por ID";
    }
    //Alterar dados dos ninjas (UPDATE)
    @PutMapping("/alteraID")
    public String alterarPorId(){
        return "Alterar por ID";
    }
    //Deletar Ninja (DELETE)
    @DeleteMapping("/deletarID")
    public String deletarPorId(){
        return "Deletar por ID";
    }
}
