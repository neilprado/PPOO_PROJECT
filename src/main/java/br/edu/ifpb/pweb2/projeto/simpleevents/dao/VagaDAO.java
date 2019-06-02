package br.edu.ifpb.pweb2.projeto.simpleevents.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifpb.pweb2.projeto.simpleevents.model.Especialidade;
import br.edu.ifpb.pweb2.projeto.simpleevents.model.Vaga;

public interface VagaDAO extends JpaRepository<Vaga, Long>{
    Vaga findByEspecialidade(Especialidade esp);
}
