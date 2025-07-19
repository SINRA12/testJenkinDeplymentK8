package com.test.deployment.k8.jenkin;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class SimpleController {

    @GetMapping
    public String getValue() {
        return "GET: Hard coded value but this time checking the systemd configuration and application is inside a K8 cluster";
    }

    @PostMapping
    public String postValue() {
        return "POST: Hard coded value";
    }

    @PutMapping
    public String putValue() {
        return "PUT: Hard coded value";
    }

    @DeleteMapping
    public String deleteValue() {
        return "DELETE: Hard coded value";
    }
}
