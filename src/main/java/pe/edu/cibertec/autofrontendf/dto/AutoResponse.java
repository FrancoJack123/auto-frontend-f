package pe.edu.cibertec.autofrontendf.dto;

public record AutoResponse(
        String codigo,
        String mensaje,
        String autoMarca,
        String autoModelo,
        String autoNroAsientos,
        String autoPrecio,
        String autoColor ) {}
