package br.com.memorialacademico.services;

import br.com.memorialacademico.model.AdminCredentials;
import org.springframework.stereotype.Service;

/**
 * Created by i857583 on 22/04/17.
 */

@Service
public class AuthenticationService {

    public boolean authorizeUser(AdminCredentials credentials) {
        if (credentials.getUsername().equals("admin") && credentials.getPassword().equals("MemoAcad123")) {
            return true;
        } else {
            return false;
        }
    }

}
