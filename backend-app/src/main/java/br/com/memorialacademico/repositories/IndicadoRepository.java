package br.com.memorialacademico.repositories;

import br.com.memorialacademico.model.Indicado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by i857583 on 12/03/17.
 */

@Repository
public interface IndicadoRepository extends JpaRepository<Indicado, Long> {
}
