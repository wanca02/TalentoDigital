package com.web.dojoyninjas.services;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.web.dojoyninjas.models.Ninja;
import com.web.dojoyninjas.repositories.NinjaRepository;

@Service
@Transactional
public class NinjaService {
    @Autowired 
    NinjaRepository ninjaRepo;
    //la variable estática establece el número de ninjas que queremos mostrar por página.
    private static final int PAGE_SIZE = 5;
    public Page<Ninja> ninjasPerPage(int pageNumber) {
        // Obtener todas las páginas de ninjas y clasificarlas en orden ascendente por apellido.
        PageRequest pageRequest = PageRequest.of(pageNumber, PAGE_SIZE, Sort.by(Sort.Direction.ASC, "lastName"));
        Page<Ninja> ninjas = ninjaRepo.findAll(pageRequest);
        return ninjas;
    }
}