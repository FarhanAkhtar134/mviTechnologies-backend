package com.mvitech.backendapi.controller;

import com.mvitech.backendapi.model.Vendor;
import com.mvitech.backendapi.service.VendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
public class VendorController {

    @Autowired
    private VendorService vendorService;

    @GetMapping(path = "/vendors")
    public @ResponseBody
    List<Vendor> listVendors() {

        return vendorService.listAll();
    }

    @PostMapping("/products")
    public void add(@RequestBody Vendor product) {
        VendorService.save(product);
    }




}
