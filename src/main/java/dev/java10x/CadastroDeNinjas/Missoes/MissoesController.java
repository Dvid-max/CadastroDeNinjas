package dev.java10x.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //Rota para APIs
@RequestMapping("missoes") //Mapear
public class MissoesController {

    MissoesService missoesService;

    public MissoesController(MissoesService missoesService) {
        this.missoesService = missoesService;
    }

    // GET -- Mandar uma requisição para mostrar as missões
    @GetMapping("/listar")
    public List<MissoesModel> listarMissoes(){
        return missoesService.listarMiissoes()      ;
    }
    @GetMapping("/listar/{id}")
    public MissoesModel listarMissoesPorId(@PathVariable Long id) {
        return missoesService.buscarMissoesPorId(id);
    }

    // POST -- Mandar uma requisição para criar as missões
    @PostMapping("/criar")
    public MissoesModel criarMissao(@RequestBody MissoesModel  missoesModel) {
        return missoesService.criarMissao(missoesModel);
    }

    // PUT -- Mandar uma requisição para alterar as missões
    @PutMapping("/alterar")
    public String alterarMissao() {
        return "Missão alterada com sucesso";
    }

    // DELETE -- Mandar uma requisição para deletar as missões
    @DeleteMapping("/deletar/{id}")
    public void deletarMissaoPorId(@PathVariable Long id) {
        missoesService.deletarMissaoPorId(id);
    }
}
