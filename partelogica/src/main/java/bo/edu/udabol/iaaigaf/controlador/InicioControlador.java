package bo.edu.udabol.iaaigaf.controlador;

import org.springframework.ai.chat.model.ChatModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/v1/ia")
public class InicioControlador {

    @Autowired
    ChatModel chatModel;

    @GetMapping("/preguntame")
    public String preguntame(@RequestParam String pregunta) {
        return chatModel.call(pregunta);
    }

}
