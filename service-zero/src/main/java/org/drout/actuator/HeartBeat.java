package org.drout.actuator;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;


@Endpoint(id="heart-beat")
@Component
public class HeartBeat {
    @Value("${spring.application.name}")
    private String applicationName;

    @Bean
    @ReadOperation
    public ResponseEntity<Pulses> getPulse() {
        // http://localhost:8182/portal/management/actuator/heartBeat
        Pulses statusCheck = new Pulses(applicationName);
        HttpHeaders headers = new HttpHeaders();
        ResponseEntity<Pulses> entity = new ResponseEntity<>(statusCheck,headers, HttpStatus.OK);
        return entity;
    }
}
