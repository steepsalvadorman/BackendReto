package com.example.demo.Service;


import com.example.demo.Model.Persona;
import com.example.demo.Repository.PersonaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PersonaServiceImpl implements  PersonaServiceI{

    public static PersonaRepository personaRepository;


    @Override
    public List<Persona> getPersonas() {
        return personaRepository.findAll();
    }

    @Override
    public Persona getPersona(Long id) {
        return personaRepository.findById(id).orElse(null);
    }

    @Override
    public Persona addPersona(Persona persona) {
        return personaRepository.save(persona);
    }

    @Override
    public Persona updatePersona(Persona persona, Long id) {
        Persona personaFromDB = getPersona(id);
        personaFromDB.setNombre(persona.getNombre());
        personaFromDB.setGenero(persona.getGenero());
        personaFromDB.setLongitud(persona.getLongitud());
        personaFromDB.setLatitud(persona.getLatitud());
        personaFromDB.setCorreo(persona.getCorreo());
        personaFromDB.setFechaNacimiento(persona.getFechaNacimiento());
        personaFromDB.setUrlImagen(persona.getUrlImagen());
        return personaRepository.save(personaFromDB);
    }

    @Override
    public void deletePersona(Long id) {
        Persona personaFromDB = getPersona(id);
        personaRepository.delete(personaFromDB);
    }
}
