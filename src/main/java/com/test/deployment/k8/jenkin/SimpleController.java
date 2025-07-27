package com.test.deployment.k8.jenkin;

import org.springframework.web.bind.annotation.*;
import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
@RequestMapping("/api")
public class SimpleController {

    // Method to fetch server IP
    private String getServerIp() {
        try {
            InetAddress inetAddress = InetAddress.getLocalHost();
            return inetAddress.getHostAddress();  // Return the IP address
        } catch (UnknownHostException e) {
            return "Unknown IP";  // In case the IP cannot be fetched
        }
    }

    @GetMapping
    public String getValue() {
        return "GET: Hard coded value but this time checking the systemd configuration and application is inside a K8 cluster and using ARgo Cd for deployment. 12 " +
               "Server IP: " + getServerIp();
    }

    @PostMapping
    public String postValue() {
        return "POST: Hard coded value. Server IP: " + getServerIp();
    }

    @PutMapping
    public String putValue() {
        return "PUT: Hard coded value. Server IP: " + getServerIp();
    }

    @DeleteMapping
    public String deleteValue() {
        return "DELETE: Hard coded value. Server IP: " + getServerIp();
    }
}
