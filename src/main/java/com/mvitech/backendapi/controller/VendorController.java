package com.mvitech.backendapi.controller;

import com.mvitech.backendapi.model.Vendor;
import com.mvitech.backendapi.service.VendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("vendors")
public class VendorController {

    @Autowired
    private VendorService vendorService;

    @GetMapping(path= "/", produces = "application/json")
    public @ResponseBody
    List<Vendor> listVendors() {
        return vendorService.listAll();
    }
}
