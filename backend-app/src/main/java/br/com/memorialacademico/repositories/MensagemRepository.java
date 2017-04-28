package br.com.memorialacademico.repositories;

import br.com.memorialacademico.model.Mensagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by i857583 on 18/04/17.
 */
@Repository
public interface MensagemRepository extends JpaRepository<Mensagem,Long> {
}
