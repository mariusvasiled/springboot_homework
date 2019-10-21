package com.sda.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController                  //controller care sta intre pagina web si metoda
public class LandingPageController {
    @RequestMapping("/")        // in paranteze : resursa
    public String primaPagina(){
        return "Bine ati venit pe prima pagina!";
    }
}
