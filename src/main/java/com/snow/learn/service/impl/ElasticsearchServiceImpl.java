package com.snow.learn.service.impl;

import com.snow.learn.service.ElasticsearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;


/**
 * 实现类（ 泛型：M 是 mapper 对象，T 是实体 ， PK 是主键泛型 ）
 * @ClassName ElasticsearchServiceImpl
 * @Description TODO
 * @Author lvxue
 * @Date 2019/9/17 17:48
 * @Version 1.0
 */
public class ElasticsearchServiceImpl<R extends ElasticsearchRepository<T, String>, T> implements ElasticsearchService<T> {

    @Autowired
    private R repository;

    @Resource
    private ElasticsearchTemplate elasticsearchTemplate;

    @Override
    public boolean createIndex(Class<T> clazz) {
        return elasticsearchTemplate.createIndex(clazz);
    }

    @Override
    public boolean deleteIndex(Class<T> clazz){
        return elasticsearchTemplate.deleteIndex(clazz);
    }


    @Override
    public boolean deleteIndex(String indexName){
        return elasticsearchTemplate.deleteIndex(indexName);
    }

    @Override
    public T findById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public T save(T t) {
        return repository.save(t);
    }



    @Override
    public List<T> saveAll(Iterable<T> iterable) {
        List<T> list = new ArrayList<>();
        repository.saveAll(iterable).forEach(list::add);
        return list;
    }

    @Override
    public List<T> findAll() {
        List<T> list = new ArrayList<>();
        repository.findAll().forEach(list::add);
        return list;
    }

    @Override
    public void deleteAll(){
        repository.deleteAll();
    }
}
