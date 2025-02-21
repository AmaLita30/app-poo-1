package model;

public class Alumno extends Persona {
    @Override
    public boolean registrarAsitencia(String codIdentificador, String fechaAdistencia, String HoraAsistencia, Boolean valorAsistencia) {
        System.out.println("Aplicar la Lógica " +
                "para la Asistencia del " +
                "Alumno");
        return true;
    }
}
