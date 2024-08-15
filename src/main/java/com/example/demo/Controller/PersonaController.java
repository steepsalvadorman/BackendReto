package com.example.demo.Controller;


import com.example.demo.Model.Persona;
import com.example.demo.Service.PersonaServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequestMapping("/personas")
@AllArgsConstructor
@RestController
public class PersonaController {

    public final PersonaServiceImpl personaService;

    @GetMapping
    public List<Persona> getAllPersona() {
        return personaService.getPersonas();
    }

    @GetMapping("/{id}")
    public Persona getPersonaById(@PathVariable Long id) {
        return personaService.getPersona(id);
    }

    @PostMapping
    public void addPersona(@RequestBody Persona persona) {
        personaService.addPersona(persona);
    }

    @PutMapping("/{id}")
    public Persona updateCliente(@PathVariable Long id, @RequestBody Persona persona) {
        return personaService.updatePersona(persona, id);
    }

    @DeleteMapping("/{id}")
    public void deletePersona(@PathVariable Long id) {
        personaService.deletePersona(id);
    }



}
