package com.example.superhero_v4.repository;

import com.example.superhero_v4.model.Superheroes;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class RepositoryDB implements IRepository{
    @Override
    public void flush() {

    }

    @Override
    public <S extends Superheroes> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Superheroes> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Superheroes> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Superheroes getOne(Long aLong) {
        return null;
    }

    @Override
    public Superheroes getById(Long aLong) {
        return null;
    }

    @Override
    public Superheroes getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Superheroes> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Superheroes> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Superheroes> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Superheroes> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Superheroes> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Superheroes> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Superheroes, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends Superheroes> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Superheroes> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Superheroes> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<Superheroes> findAll() {
        return null;
    }

    @Override
    public List<Superheroes> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Superheroes entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Superheroes> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<Superheroes> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Superheroes> findAll(Pageable pageable) {
        return null;
    }
}
