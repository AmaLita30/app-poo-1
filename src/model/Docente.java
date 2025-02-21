package model;

public class Docente extends Persona{
    @Override
    public boolean registrarAsitencia(String codIdentificador, String fechaAdistencia, String HoraAsistencia, Boolean valorAsistencia) {
        System.out.println("Aplicar Lógica " +
                "para la Asistencia del " +
                "Docente");
        return true;
    }
}
