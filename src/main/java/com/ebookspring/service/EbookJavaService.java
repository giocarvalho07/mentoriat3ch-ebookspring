package com.ebookspring.service;

import com.ebookspring.domain.EbookJava;
import com.ebookspring.repository.EbookJavaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EbookJavaService {

    @Autowired
    EbookJavaRepository ebokEbookJavaRepository;

    public void criarLead(EbookJava ebookJava){
        ebokEbookJavaRepository.save(ebookJava);
    }

    public Iterable<EbookJava> exibirPageEbook(){return ebokEbookJavaRepository.findAll();
    }
}
