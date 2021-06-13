package com.mvitech.backendapi.controller;

import com.mvitech.backendapi.model.Vendor;
import com.mvitech.backendapi.service.VendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

@RestController
public class VendorController {

    @Autowired
    private VendorService vendorService;

    @CrossOrigin
    @GetMapping(path = "/vendors", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    ResponseEntity<List<Vendor>> listVendors(@RequestParam(name = "sort") List<String> sort,
                                             @RequestParam(name = "range") List<String> range,
                                             @RequestParam(name = "filter") List<String> filter) {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Range", "posts 0-1/1");
        headers.add("Access-Control-Expose-Headers", "Content-Range");


        try {
            return ResponseEntity.status(HttpStatus.OK)
                    .headers(headers)
                    .body(vendorService.listAll());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .headers(headers)
                    .body(Arrays.asList());
        }
    }


    @PostMapping("/vendors")
    public void saveVendor(@RequestBody Vendor vendor) {
        vendorService.save(vendor);
    }

}
