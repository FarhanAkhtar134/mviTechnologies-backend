package com.mvitech.backendapi.service;

import com.mvitech.backendapi.model.Vendor;
import com.mvitech.backendapi.repository.VendorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VendorService {

    @Autowired
    private VendorRepository vendorRepository;

    public List<Vendor> listAll() {
        return vendorRepository.findAll();
    }

    public void save(Vendor vendor) {
        vendorRepository.save(vendor);
    }

    public Vendor get(Integer id) {
        return vendorRepository.findById(id).get();
    }

    public void delete(Integer id) {
        vendorRepository.deleteById(id);
    }
}
