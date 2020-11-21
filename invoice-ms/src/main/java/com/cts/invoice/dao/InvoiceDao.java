package com.cts.invoice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.invoice.model.Invoice;

@Repository
public interface InvoiceDao extends JpaRepository<Invoice, Long>{

}
