package br.com.memorialacademico.controllers;

import br.com.memorialacademico.model.Estatistica;
import br.com.memorialacademico.services.EstatisticaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by i857583 on 18/04/17.
 */
@RestController
public class EstatisticaController {

    @Autowired
    private EstatisticaService service;

    @RequestMapping(value = "/estatistica", method = RequestMethod.GET)
    public ResponseEntity<Estatistica> getEstatistica() {
        Estatistica estatistica = service.getEstatistica();
        return new ResponseEntity<>(estatistica, HttpStatus.OK);
    }
}
