package pe.com.biblioteca.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import pe.com.biblioteca.dto.LibroDTO;
import pe.com.biblioteca.model.Libro;

@Service
public class FabricaLibroService {
    public Libro crearLibro(LibroDTO libroDTO){
        return  new Libro(libroDTO);
    }
    public LibroDTO crearLibroDTO(Libro libro){
        return new LibroDTO(libro);
    }
    public List<LibroDTO> crearLibrosDTO(List<Libro> listaLibros){
        List<LibroDTO> libroDTOS = new ArrayList<>();
        listaLibros.stream().forEach(
                libro -> {
                    libroDTOS.add(new LibroDTO(libro));
                }
        );
        return libroDTOS;
    }
}
