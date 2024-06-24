package bo.edu.udabol.iaaigaf.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import bo.edu.udabol.iaaigaf.modelo.Activosfijos;
import bo.edu.udabol.iaaigaf.servicio.ActivosfijosServicio;

@RestController
@RequestMapping("/api/v1/activosfijos")
public class ActivosfijosControlador {

    @Autowired
    ActivosfijosServicio activosfijosServicio;

    @GetMapping
    ResponseEntity <?> obtenerTodos(){
        return new ResponseEntity<List<Activosfijos>>(activosfijosServicio.obtenerTodos(), HttpStatus.OK);
    }

    @GetMapping("/lista")
    public String ListarActivosfijos() {
        return activosfijosServicio.listarActivosfijos(activosfijosServicio.obtenerTodos());
    }

    @GetMapping("/preguntame")
    public String preguntame(@RequestParam String pregunta) {
        return activosfijosServicio.preguntame(pregunta);
    }

}
