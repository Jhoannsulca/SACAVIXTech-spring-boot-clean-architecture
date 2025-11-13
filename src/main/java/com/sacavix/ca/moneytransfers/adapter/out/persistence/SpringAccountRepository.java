package com.sacavix.ca.moneytransfers.adapter.out.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpringAccountRepository extends JpaRepository<AccountEntity, Long> {
}
