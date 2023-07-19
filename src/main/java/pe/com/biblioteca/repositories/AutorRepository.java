package pe.com.biblioteca.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.com.biblioteca.model.Autor;

public interface AutorRepository extends JpaRepository<Autor, Integer>{
    
}
