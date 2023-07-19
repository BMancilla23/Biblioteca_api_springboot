package pe.com.biblioteca.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.com.biblioteca.model.Libro;

public interface LibroRepository extends JpaRepository<Libro, Integer>{
    
}
