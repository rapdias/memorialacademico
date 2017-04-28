package br.com.memorialacademico.controllers;

import br.com.memorialacademico.model.Indicado;
import br.com.memorialacademico.repositories.IndicadoRepository;
import br.com.memorialacademico.services.EstatisticaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Created by i857583 on 12/03/17.
 */

@RestController
public class IndicadoController {

    @Autowired
    private IndicadoRepository repo;

    @Autowired
    private EstatisticaService estatisticaService;

    @RequestMapping(value = "/listaIndicados", method = RequestMethod.GET)
    public ResponseEntity<List<Indicado>> getIndicados() {
        List<Indicado> lista = repo.findAll();
        estatisticaService.incrementAccessNumber();
        return new ResponseEntity<>(lista, HttpStatus.OK);
    }

    @RequestMapping(value = "/listaIndicados/same", method = RequestMethod.GET)
    public ResponseEntity<List<Indicado>> getIndicadosMesmaSessao() {
        List<Indicado> lista = repo.findAll();
        return new ResponseEntity<>(lista, HttpStatus.OK);
    }

    @RequestMapping(value = "/files/{file_name}", method = RequestMethod.GET)
    public void getFile(@PathVariable("file_name") String fileName, HttpServletResponse response) {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            InputStream is = classLoader.getResourceAsStream("files/" + fileName + ".pdf");
            response.setContentType("application/pdf");
            // copy it to response's OutputStream
            org.apache.commons.io.IOUtils.copy(is, response.getOutputStream());
            response.flushBuffer();
        } catch (IOException ex) {
            throw new RuntimeException("IOError writing file to output stream");
        }

    }
}
