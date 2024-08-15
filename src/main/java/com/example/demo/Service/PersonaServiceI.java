package com.example.demo.Service;

import com.example.demo.Model.Persona;

import java.util.List;

public interface PersonaServiceI {
    List<Persona> getPersonas();
    Persona getPersona(Long id);
    Persona addPersona(Persona persona);
    Persona updatePersona(Persona persona, Long id);
    void deletePersona(Long id);
}
