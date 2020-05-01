package com.Feelfree2code.STA.service;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.http.ResponseEntity;

import java.util.List;

@NoRepositoryBean
public interface IBaseService<V, S, U, D> {

    ResponseEntity<List<V>> get();

    ResponseEntity<V> getById(Integer id);

    ResponseEntity<D> add(S model);

    ResponseEntity<D> update(Integer id, U model);

    ResponseEntity<V> delete(Integer id);

    ResponseEntity<List<V>> getIsDeleted(boolean showIsDeleted);
}
