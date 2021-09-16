package com.undec.gedufy.dto;

import com.undec.gedufy.model.TipoPersona;

public class TipoPersonaDTO {
    private Integer id;
    private String nombre;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoPersona getTipoPersona(TipoPersonaDTO tipoPersonaDTO){
        TipoPersona tipoPersona = new TipoPersona();

        tipoPersona.setId(tipoPersonaDTO.getId());
        tipoPersona.setNombre(tipoPersonaDTO.getNombre());

        return tipoPersona;
    }

}
