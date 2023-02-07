package com.iesam.IESAMD.domain.models;

public class Aulas_docencia extends Aulas{

    private Integer sillas;
    private String tipo_blackboard;

    public Integer getSillas() {
        return sillas;
    }

    public void setSillas(Integer sillas) {
        this.sillas = sillas;
    }

    public String getTipo_blackboard() {
        return tipo_blackboard;
    }

    public void setTipo_blackboard(String tipo_blackboard) {
        this.tipo_blackboard = tipo_blackboard;
    }
}
