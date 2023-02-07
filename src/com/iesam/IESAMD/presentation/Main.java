package com.iesam.IESAMD.presentation;

import com.iesam.IESAMD.domain.models.Alumnos;
import com.iesam.IESAMD.domain.models.Aulas;
import com.iesam.IESAMD.domain.models.Aulas_docencia;
import com.iesam.IESAMD.domain.models.Curso;

public class Main {
    public static void main(String[]args){



        Alumnos alumno1 = new Alumnos();
        alumno1.setDni("8747374837F");
        alumno1.setNombre("Alicia");
        alumno1.setApellidos("Martín Gómez");
        alumno1.setAcademico("2ºCurso");
        alumno1.setId_alumno(21);


        Aulas_docencia aula1 = new Aulas_docencia();
        aula1.setId_aula(1);
        aula1.setSillas(23);
        aula1.setTipo_blackboard("Pizarra normal");
        aula1.setCapacidad(23);
        aula1.setPlanta(2);


    }
}
