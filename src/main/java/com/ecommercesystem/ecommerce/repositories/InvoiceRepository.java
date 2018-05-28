package com.ecommercesystem.ecommerce.repositories;

import com.ecommercesystem.ecommerce.entities.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {
}
