package us.kulba.horsea.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import us.kulba.horsea.models.Ping;

@RestController
@RequestMapping(value = "/service-status")
@Slf4j
public class PingController {
    
    @GetMapping("/ping")
    public Ping ping() {
        Ping p = new Ping();
        p.setApplication("Horsea Service");
        p.setVersion("1.0");

        log.info(p.toString());
        
        return p;

    }
}
