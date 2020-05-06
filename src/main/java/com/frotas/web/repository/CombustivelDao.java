package com.frotas.web.repository;

import java.util.List;

import com.frotas.web.domain.Combustivel;



public interface CombustivelDao {

	void save(Combustivel c);

	void update(Combustivel c);

	void delete(Long id);

	Combustivel findById(Long id);

	List<Combustivel> findAll();
}
