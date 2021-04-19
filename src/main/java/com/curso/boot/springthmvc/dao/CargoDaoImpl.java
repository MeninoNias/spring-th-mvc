package com.curso.boot.springthmvc.dao;

import com.curso.boot.springthmvc.domain.Cargo;
import org.springframework.stereotype.Repository;

@Repository
public class CargoDaoImpl extends AbstractDao<Cargo, Long> implements CargoDao{
}
