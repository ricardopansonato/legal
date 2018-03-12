package br.com.fiap.api.android.trabalho.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.fiap.api.android.trabalho.model.Switch;

public interface SwitchRepository extends MongoRepository<Switch, String> {
	Switch findFirstByOrderByCreationDateDesc();
}
