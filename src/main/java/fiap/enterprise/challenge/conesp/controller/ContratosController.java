package fiap.enterprise.challenge.conesp.controller;


import fiap.enterprise.challenge.conesp.domain.contrato.Contrato;
import fiap.enterprise.challenge.conesp.domain.contrato.ContratoRepository;
import fiap.enterprise.challenge.conesp.domain.contrato.DadosAlteracaoContrato;
import fiap.enterprise.challenge.conesp.domain.contrato.DadosCadastroContrato;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/contratos")

public class ContratosController {


    @Autowired
    private ContratoRepository repository;

    @GetMapping("/formulario")
    public String carregaPaginaFormulario(Long id, Model model){
        if (id != null){
            var contrato = repository.getReferenceById(id);
            model.addAttribute("contrato", contrato);
        }
        return "contratos/formulario";
    }

    @GetMapping
    public String carregaPaginaListagem(Model model){
        model.addAttribute("lista", repository.findAll());
        return "contratos/listagem";
    }

    @PostMapping
    @Transactional
    public String cadastraContrato(DadosCadastroContrato dados) {
        var contrato = new Contrato(dados);

        repository.save(contrato);

        return "redirect:/contratos";
    }

    @PutMapping
    @Transactional
    public String alteraContrato(DadosAlteracaoContrato dados) {
        var contratos = repository.getReferenceById(dados.id());
        contratos.atualizaDados(dados);

        return "redirect:/contratos";
    }

    @DeleteMapping
    @Transactional
    public String removeContrato(Long id) {
        repository.deleteById(id);

        return "redirect:/contratos";
    }

}
