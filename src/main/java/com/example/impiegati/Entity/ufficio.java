package com.example.impiegati.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ufficio { ;
    @Id
        private String Nome;
        private String lavoro;
        private String Licenziato;

}
