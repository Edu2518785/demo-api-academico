package pe.edu.idat.demo_api_academico.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GestionDocenteController {

    @GetMapping("/docente")
    public String obtenerDocente(){
        return "Respuesta del servicio Gestion Docente";
    }
}
