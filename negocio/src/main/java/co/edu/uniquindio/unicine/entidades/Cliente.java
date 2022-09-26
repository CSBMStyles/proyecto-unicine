package co.edu.uniquindio.unicine.entidades;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Cliente extends Persona implements Serializable {
    @Column(length = 100, nullable = false, unique = true)
    @Email
    private String email;

    @ElementCollection
    private Map<String, String> telefonos;

    @ManyToOne
    private Cuidad ciudad;

    @OneToMany(mappedBy = "cliente")
    private List<Prestamo> prestamos;
}
