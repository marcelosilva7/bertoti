package api.dvd.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;
@Data
@Entity
@Table(name = "dvd")
public class Dvd {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(nullable = false, length = 50)
    private String titulo;
    @Column(nullable = false, length = 4)
    private Integer ano;
    @Column(nullable = false, length = 50)
    private String diretor;
    @Column(nullable = false, length = 50)
    private String genero;
}
