package com.web.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.web.model.Bank_details;
@Repository
public interface BankRepo extends CrudRepository<Bank_details, Long> {
	
}
