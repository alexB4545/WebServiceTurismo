package com.example.sebastian.webserviceturismo.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by sebastian on 19/10/17.
 */

public class Turismo {

    @SerializedName("entidad_o_cargo")
    @Expose
    private String entidadOCargo;
    @SerializedName("tipo_de_establecimiento")
    @Expose
    private String tipoDeEstablecimiento;
    @SerializedName("correo")
    @Expose
    private String correo;
    @SerializedName("direccion")
    @Expose
    private String direccion;
    @SerializedName("nombre")
    @Expose
    private String nombre;
    @SerializedName("telefono_de_contacto")
    @Expose
    private String telefonoDeContacto;

    public String getEntidadOCargo() {
        return entidadOCargo;
    }

    public void setEntidadOCargo(String entidadOCargo) {
        this.entidadOCargo = entidadOCargo;
    }

    public String getTipoDeEstablecimiento() {
        return tipoDeEstablecimiento;
    }

    public void setTipoDeEstablecimiento(String tipoDeEstablecimiento) {
        this.tipoDeEstablecimiento = tipoDeEstablecimiento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefonoDeContacto() {
        return telefonoDeContacto;
    }

    public void setTelefonoDeContacto(String telefonoDeContacto) {
        this.telefonoDeContacto = telefonoDeContacto;
    }
    
}
