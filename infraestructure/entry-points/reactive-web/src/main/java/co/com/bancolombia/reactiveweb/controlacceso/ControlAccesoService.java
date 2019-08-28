package co.com.bancolombia.reactiveweb.controlacceso;

import co.com.bancolombia.usecase.controlacceso.ControlAccesoUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/portal")
public class ControlAccesoService {

    @Autowired
    private ControlAccesoUseCase controlAccesoUseCase;

    @GetMapping("/getGrupo")
    public String getGrupo(){

        return controlAccesoUseCase.getGrupo();
    }

}
