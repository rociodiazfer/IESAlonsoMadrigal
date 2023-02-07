package com.iesam.IESAMD.domain.models;

public class Aulas_pc extends Aulas{

    private Integer num_ordenadores;
    private String tipo_ordenador;

    public Integer getNum_ordenadores() {
        return num_ordenadores;
    }

    public void setNum_ordenadores(Integer num_ordenadores) {
        this.num_ordenadores = num_ordenadores;
    }

    public String getTipo_ordenador() {
        return tipo_ordenador;
    }

    public void setTipo_ordenador(String tipo_ordenador) {
        this.tipo_ordenador = tipo_ordenador;
    }
}
