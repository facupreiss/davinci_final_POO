import java.util.Date;
import mundial.Equipo;
import mundial.Partido;
import mundial.Resultado;
import mundial.Grupo;

public class Main {
    public static void main(String[] args) {

        Equipo qatar = new Equipo("Qatar");
        Equipo paisesBajos = new Equipo("Paises Bajos");
        Equipo ecuador = new Equipo("Ecuador");
        Equipo senegal = new Equipo("Senegal");

        Partido qatarEcuador = new Partido(new Date(2022, 7, 18), qatar,ecuador);
        Partido paiseBajesSenegal = new Partido(new Date(2022, 7, 18), paisesBajos,senegal);
        Partido qatarSenegal = new Partido(new Date(2022, 7, 18), qatar,senegal);
        Partido ecuadorPaiseBajos = new Partido(new Date(2022, 7, 18), ecuador,paisesBajos);
        Partido qatarPaisesBajos = new Partido(new Date(2022, 7, 18), qatar,paisesBajos);
        Partido ecuadorSenegal = new Partido(new Date(2022, 7, 18), ecuador,senegal);

        Grupo grupoA = new Grupo("Grupo A");
        grupoA.addPartido(qatarEcuador);
        grupoA.addPartido(paiseBajesSenegal);
        grupoA.addPartido(qatarSenegal);
        grupoA.addPartido(ecuadorPaiseBajos);
        grupoA.addPartido(qatarPaisesBajos);
        grupoA.addPartido(ecuadorSenegal);

        Resultado qatarEcuadorResultado = new Resultado();
        qatarEcuadorResultado.setScore();

        qatarEcuador.setResultado(qatarEcuadorResultado);
        System.out.println(qatarEcuador.getLocal());


    }
}
