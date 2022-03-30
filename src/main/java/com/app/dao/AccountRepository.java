package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojos.*;


public interface AccountRepository extends JpaRepository<Account,AccountPK>{

}
