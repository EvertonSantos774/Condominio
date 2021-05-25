package br.uniso.condominio.controller;

import br.uniso.condominio.model.entity.Morador;
import br.uniso.condominio.model.repository.MoradorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class MoradorController {

    @Autowired
    private MoradorRepository repository;

    //Gravar
    @PostMapping("/salvar")
    public String gravarMorador(Morador morador){
        repository.save(morador);
        return "redirect:/salvar";
    }

    @GetMapping("/salvar")
    public String salvarMorador(Model model){
        List<Morador> salvarMorador = repository.findAll();
        if(salvarMorador != null){
           model.addAttribute("morador", salvarMorador);
        }
        return "listagem";
    }

}
