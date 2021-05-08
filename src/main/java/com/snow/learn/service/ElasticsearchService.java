package com.snow.learn.service;

import java.util.List;

public interface ElasticsearchService<T> {

    boolean createIndex(Class<T> clazz);

    boolean deleteIndex(Class<T> clazz);

    boolean deleteIndex(String indexName);

    T findById(String id);

    T save(T t);

    List<T> saveAll(Iterable<T> iterable);

    List<T> findAll();

    void deleteAll();
}
