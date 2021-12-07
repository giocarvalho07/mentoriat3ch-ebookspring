package com.ebookspring.controller;

import com.ebookspring.domain.EbookJava;
import com.ebookspring.service.EbookJavaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EbookJavaController {

    @Autowired
    EbookJavaService ebookJavaService;

    @GetMapping("/mT3ch-ebook-spring-mvc")
    public String index() {
        return "index";
    }

    @PostMapping("/mT3ch-ebook-java")
    public String cadastrarEbook(EbookJava ebookWeb) {
        ebookJavaService.criarLead(ebookWeb);
        return "pages/ebook";
    }


    @GetMapping("/mT3ch-receber-ebook-spring-mvc")
    public ModelAndView receberEbook() {
        ModelAndView model = new ModelAndView("pages/ebook");
        Iterable<EbookJava> ebook = ebookJavaService.exibirPageEbook();
        model.addObject("ebook", ebook);
        return model;
    }

}
