package com.suppliermicroservice.supplier.repository;
import com.suppliermicroservice.supplier.model.Supplier;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierRepository extends MongoRepository<Supplier, String> {

}
