package co.edu.uniquindio.unicine.entidades;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString//(onlyExplicitlyIncluded = true)
public class Autor extends Persona implements Serializable {
    @ManyToMany(mappedBy = "autores")
    private List<Libro> libros;
}
