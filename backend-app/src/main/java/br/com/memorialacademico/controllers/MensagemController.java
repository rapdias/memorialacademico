package br.com.memorialacademico.controllers;

import br.com.memorialacademico.model.Mensagem;
import br.com.memorialacademico.repositories.MensagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by i857583 on 18/04/17.
 */

@RestController
public class MensagemController {

    @Autowired
    private MensagemRepository repository;

    @RequestMapping(value = "/mensagem", method = RequestMethod.POST)
    public ResponseEntity<Mensagem> createNewMessage(@RequestBody Mensagem mensagem) {
        Mensagem msg = this.repository.save(mensagem);
        return new ResponseEntity<>(msg, HttpStatus.CREATED);
    }


}
