import model.Alumno;
import model.CicloAcademico;
import model.Curso;
import model.Especialidad;

import java.awt.*;

public class Main {
    public static void main(String[] args) {

        Curso objCurso = new Curso();
        objCurso.setIdcurso(1);

        System.out.println(objCurso.getIdcurso());

        Curso objCurso2 = new Curso(2);
        System.out.println(objCurso2.getIdcurso());


        CicloAcademico objCicloAcademico = new CicloAcademico();
        objCicloAcademico.setIdCicloAcademico(1);

        System.out.println(objCicloAcademico);
        Alumno objAlumno = new Alumno();
                objAlumno.setNombre("Amalia");
                objAlumno.setApellido("Ortiz");
                objAlumno.setDni("43621188");
                objAlumno.setEdad(28);
                objAlumno.setId(1);
        }
    }