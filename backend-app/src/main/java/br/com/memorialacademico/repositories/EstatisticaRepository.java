package br.com.memorialacademico.repositories;

import br.com.memorialacademico.model.Estatistica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by i857583 on 18/04/17.
 */

@Repository
public interface EstatisticaRepository extends JpaRepository<Estatistica, Long> {
}
