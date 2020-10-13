package com.clientdaw.clientdaw.service;


import com.clientdaw.clientdaw.entities.Alumne;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class AlumneService {
    public List<Alumne> getAlumnes(){
        final String uri = "http://backendclasse-env.eba-hbhrifes.us-east-1.elasticbeanstalk.com/getAlumnes";
        RestTemplate rt = new RestTemplate();
        ResponseEntity<List<Alumne>> rateResponse =
                rt.exchange(uri,
                        HttpMethod.GET,
                        null,
                        new ParameterizedTypeReference<List<Alumne>>() {
                        });
        List<Alumne> llista = rateResponse.getBody();

        return llista;

    }
}
