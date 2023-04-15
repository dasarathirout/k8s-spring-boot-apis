package org.drout.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api")
public class ControllerZero {
    private static final Logger log = LoggerFactory.getLogger(ControllerZero.class);

    @GetMapping("/check")
    public String check() {
        log.info("/portal-zero/api/check");
        return "endPoint=/portal-zero/api/check, Executed Successfully";
    }
}
