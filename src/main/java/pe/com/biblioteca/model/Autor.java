package pe.com.biblioteca.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import pe.com.biblioteca.dto.AutorDTO;

@Data
@NoArgsConstructor
@Entity
@Table(name = "autores")
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private String apellido;
    private String telefono;
    @OneToMany(mappedBy = "autor")
    private List<Libro> libros;

    public Autor(AutorDTO autorDTO) {
        this.id = autorDTO.getId();
        this.nombre = autorDTO.getNombre();
        this.apellido = autorDTO.getApellido();
        this.telefono = autorDTO.getTelefono();
    }
}
