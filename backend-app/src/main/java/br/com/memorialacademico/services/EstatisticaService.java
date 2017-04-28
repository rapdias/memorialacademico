package br.com.memorialacademico.services;

import br.com.memorialacademico.model.Estatistica;
import br.com.memorialacademico.repositories.EstatisticaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by i857583 on 18/04/17.
 */

@Service
public class EstatisticaService {

    @Autowired
    private EstatisticaRepository repository;

    public void incrementAccessNumber() {
        Estatistica estatistica = this.repository.findAll().get(0);
        estatistica.setAccessTotalNum(estatistica.getAccessTotalNum() + 1);
        this.repository.save(estatistica);
    }

    public Estatistica getEstatistica() {
        return repository.findAll().get(0);
    }

}
