package com.viewnext.register_service.security.model;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {
    /** El nombre proporcionado en la solicitud de registro **/
    private String nombre;

    /** Los apellidos proporcionados en la solicitud de registro **/
    private String apellidos;

    private int edad;

    /** El correo electrónico proporcionado en la solicitud de registro. */
    private String correo;

    private String direccion;

    private int telefono;

    /** La contraseña proporcionada en la solicitud de registro. */
    private String contrasena;

    private boolean estado;

    private boolean mfaEnabled;

    private String secret;
}
