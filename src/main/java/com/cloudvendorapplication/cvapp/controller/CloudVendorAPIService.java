package com.cloudvendorapplication.cvapp.controller;

import org.springframework.web.bind.annotation.RestController;

import com.cloudvendorapplication.cvapp.model.CloudVendor;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;





@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPIService {
    CloudVendor cloudVendor;
    @GetMapping("{vendorid}")
   public CloudVendor getAllVendorDetails(String vendorId)
   {
        return cloudVendor;
        // new CloudVendor("V1", "BASIL", "MALAYILPUTHENPURAYIL H MEKKADAMPU PO", "basilbab@gmail.com");
   } 
   @PostMapping   
   public String createCouldVendor(@RequestBody CloudVendor cloudVendor)
   {
        this.cloudVendor=cloudVendor;
        return "Sucess";
   }
}
