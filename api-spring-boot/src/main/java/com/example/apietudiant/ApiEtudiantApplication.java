package com.example.apietudiant;

import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.apietudiant.entity.Etudiant;
import com.example.apietudiant.repository.EtudiantRepository;

@SpringBootApplication
public class ApiEtudiantApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiEtudiantApplication.class, args);
	}

	@Bean
    public CommandLineRunner initData(EtudiantRepository etudiantRepository) {
        return args -> {
            if (etudiantRepository.count() == 0) {
                etudiantRepository.saveAll(List.of(
                        new Etudiant(null, "09100101", "Ali Ben Salah", LocalDate.of(2000, 1, 15)),
                        new Etudiant(null, "09101102", "Sarra Mansouri", LocalDate.of(2001, 3, 22)),
                        new Etudiant(null, "09102103", "Mohamed Ferjani", LocalDate.of(1999, 7, 10)),
                        new Etudiant(null, "09103104", "Oumaima Trabelsi", LocalDate.of(2002, 11, 5)),
                        new Etudiant(null, "09104105", "Khaled Bouazizi", LocalDate.of(1998, 9, 30))
                ));
                System.out.println("5 étudiants ajoutés à la base de données");
            }
        };
    }

}
