package pe.com.biblioteca.dto;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pe.com.biblioteca.model.Autor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AutorDTO {
    private Integer id;
    private String nombre;
    private String apellido;
    private String telefono;
    private List<LibroDTO> libroDTO;

    public AutorDTO(Autor autor) {
        this.id = autor.getId();
        this.nombre = autor.getNombre();
        this.apellido = autor.getApellido();
        this.telefono = autor.getTelefono();
        this.libroDTO = new ArrayList<>();
        autor.getLibros().forEach(
                libro -> libroDTO.add(new LibroDTO(libro))
        );
    }
}



