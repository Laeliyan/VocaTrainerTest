package fr.cvalette.VocaTrainer.controller;

import fr.cvalette.VocaTrainer.Entity.Template;
import fr.cvalette.VocaTrainer.repository.TemplateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/template")
public class TemplateController {

    @Autowired
    TemplateRepository templateRepository;

    @GetMapping
    public List<Template> getTemplate() {
        return this.templateRepository.findAll();
    }

    @PostMapping
    public void addTemplate(@RequestBody Template template) {
        this.templateRepository.save(template);
    }
}
