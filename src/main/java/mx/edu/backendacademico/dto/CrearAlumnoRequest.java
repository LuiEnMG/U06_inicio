package mx.edu.backendacademico.dto;

// Define exclusivamente los campos que el cliente puede enviar al crear.

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public class CrearAlumnoRequest {

    @NotBlank(message = "La matrícula es obligatoria")
    @Pattern(
            regexp = "^\\S+$",
            message = "La matrícula no puede contener espacios internos"
    )
    private String matricula;

    // Otros campos, getters y setters
}