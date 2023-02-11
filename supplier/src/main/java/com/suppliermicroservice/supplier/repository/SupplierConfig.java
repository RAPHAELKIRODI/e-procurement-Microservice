package com.suppliermicroservice.supplier.repository;

import com.suppliermicroservice.supplier.model.Supplier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class SupplierConfig {
    @Configuration
    public static class supplierConfig {

        @Bean
        public SupplierRepository supplierRepository() {
            return new SupplierRepository() {
                @Override
                public <S extends Supplier> S insert(S entity) {
                    return null;
                }

                @Override
                public <S extends Supplier> List<S> insert(Iterable<S> entities) {
                    return null;
                }

                @Override
                public <S extends Supplier> List<S> findAll(Example<S> example) {
                    return null;
                }

                @Override
                public <S extends Supplier> List<S> findAll(Example<S> example, Sort sort) {
                    return null;
                }

                @Override
                public <S extends Supplier> List<S> saveAll(Iterable<S> entities) {
                    return null;
                }

                @Override
                public List<Supplier> findAll() {
                    return null;
                }

                @Override
                public List<Supplier> findAllById(Iterable<String> strings) {
                    return null;
                }

                @Override
                public <S extends Supplier> S save(S entity) {
                    return null;
                }

                @Override
                public Optional<Supplier> findById(String s) {
                    return Optional.empty();
                }

                @Override
                public boolean existsById(String s) {
                    return false;
                }

                @Override
                public long count() {
                    return 0;
                }

                @Override
                public void deleteById(String s) {

                }

                @Override
                public void delete(Supplier entity) {

                }

                @Override
                public void deleteAllById(Iterable<? extends String> strings) {

                }

                @Override
                public void deleteAll(Iterable<? extends Supplier> entities) {

                }

                @Override
                public void deleteAll() {

                }

                @Override
                public List<Supplier> findAll(Sort sort) {
                    return null;
                }

                @Override
                public Page<Supplier> findAll(Pageable pageable) {
                    return null;
                }

                @Override
                public <S extends Supplier> Optional<S> findOne(Example<S> example) {
                    return Optional.empty();
                }

                @Override
                public <S extends Supplier> Page<S> findAll(Example<S> example, Pageable pageable) {
                    return null;
                }

                @Override
                public <S extends Supplier> long count(Example<S> example) {
                    return 0;
                }

                @Override
                public <S extends Supplier> boolean exists(Example<S> example) {
                    return false;
                }

                @Override
                public <S extends Supplier, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
                    return null;
                }
            };
        }
    }
}
