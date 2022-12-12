package com.safvroma.safv.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.safvroma.safv.Models.Funcao;

@Repository
public interface FuncaoRepository extends JpaRepository <Funcao, Integer>{
	public Funcao findFuncaoById (Integer id);
	
}
