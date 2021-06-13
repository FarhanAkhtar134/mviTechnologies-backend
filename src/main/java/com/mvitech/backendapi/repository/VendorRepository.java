package com.mvitech.backendapi.repository;

import com.mvitech.backendapi.model.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendorRepository extends JpaRepository<Vendor, Integer> {
}
