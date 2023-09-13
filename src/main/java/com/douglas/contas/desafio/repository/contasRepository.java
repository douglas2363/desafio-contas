package com.douglas.contas.desafio.repository;

import com.douglas.contas.desafio.entity.contasEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public abstract class contasRepository implements JpaRepository<contasEntity, Integer> {

}
