package com.Feelfree2code.STA.service;

import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IBaseService<V, S, R, U> {

    ResponseEntity<List<U>> get();

    ResponseEntity<V> getById(Integer id);

    ResponseEntity<U> add(S model);

    ResponseEntity<U> update(Integer id, R model);

    ResponseEntity<U> delete(Integer id);

    ResponseEntity<List<V>> getIsDeleted(boolean showIsDeleted);
}
