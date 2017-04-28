package br.com.memorialacademico.controllers;

import br.com.memorialacademico.model.AdminCredentials;
import br.com.memorialacademico.model.Mensagem;
import br.com.memorialacademico.repositories.MensagemRepository;
import br.com.memorialacademico.services.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by i857583 on 18/04/17.
 */
@RestController
public class AdminController {

    @Autowired
    private MensagemRepository repository;

    @Autowired
    private AuthenticationService authenticationService;

    @RequestMapping(value = "/admin/mensagem", method = RequestMethod.GET)
    public ResponseEntity<?> getAllMessages(@RequestBody AdminCredentials credentials) {

        if (authenticationService.authorizeUser(credentials)) {
            List<Mensagem> lista = this.repository.findAll();
            return new ResponseEntity<>(lista, HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Usuário não autorizado", HttpStatus.UNAUTHORIZED);
        }

    }
}