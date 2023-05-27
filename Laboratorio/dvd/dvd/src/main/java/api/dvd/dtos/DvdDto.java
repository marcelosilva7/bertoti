package api.dvd.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class DvdDto {
    @NotBlank
    private String titulo;
    @NotNull
    private Integer ano;
    @NotBlank
    private String diretor;
    @NotBlank
    private String genero;

}
