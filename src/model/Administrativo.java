package model;

import javax.sound.midi.Soundbank;

public class Administrativo extends Persona {
    @Override
    public boolean registrarAsitencia(String codIdentificador, String fechaAdistencia, String HoraAsistencia, Boolean valorAsistencia) {
        System.out.println("Aplicar Lógica " +
                "para la asistencia del " +
                "administrativo ");
        return true;
    }
}
