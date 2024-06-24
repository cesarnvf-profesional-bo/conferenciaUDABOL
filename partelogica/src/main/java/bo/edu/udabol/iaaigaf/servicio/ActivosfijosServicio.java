package bo.edu.udabol.iaaigaf.servicio;

import java.util.List;

import org.springframework.ai.chat.model.ChatModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bo.edu.udabol.iaaigaf.modelo.Activosfijos;
import bo.edu.udabol.iaaigaf.repositorio.ActivosfijosRepositorio;

@Service
public class ActivosfijosServicio {

    @Autowired
    ChatModel chatModel;

    @Autowired
    ActivosfijosRepositorio activosfijosRepositorio;

    public List<Activosfijos> obtenerTodos() {
        return activosfijosRepositorio.obtenerTodos();
    }

    public String listarActivosfijos(List<Activosfijos> activos) {
        StringBuilder sb = new StringBuilder("Lista de activos fijos:\n");
        for (Activosfijos activo : activos) {
            sb.append(String.format("ID: %d, Activo: %s, Costo Inicial: %s, Vida Útil: %d años, Fecha de Compra: %s\n",
                    activo.getIdactivodijo(), activo.getActivofijo(), activo.getCostoinicial(),
                    activo.getVidautil(), activo.getFechacompra()));
        }
        return sb.toString();
    }

    public String preguntame(String pregunta) {
        List<Activosfijos> activosfijos = activosfijosRepositorio.obtenerTodos();
        String listaActivosFijos = listarActivosfijos(activosfijos);
        String preguntaConDatos = listaActivosFijos + "\n\nPregunta: " + pregunta;
        return chatModel.call(preguntaConDatos);
    }
}
