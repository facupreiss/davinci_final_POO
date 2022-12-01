import java.util.Date;
import mundial.Equipo;
import mundial.Partido;
import mundial.Resultado;

public class Main {
    public static void main(String[] args) {
        Equipo qatar = new Equipo("Qatar");
        Equipo paisesBajos = new Equipo("Paises Bajos");
        Equipo ecuador = new Equipo("Ecuador");
        Equipo senegal = new Equipo("Senegal");

        Date qatarEcuadorFecha = new Date(2022,7,18);

        Partido qatarEcuador = new Partido(qatarEcuadorFecha, qatar,ecuador);

        Resultado qatarEcuadorResultado = new Resultado();

        System.out.println("El marcador local es " + qatarEcuadorResultado.setGolesLocal());
        System.out.println("El marcador visitante es " + qatarEcuadorResultado.setGolesVisitante());

        System.out.println(qatarEcuadorResultado.getGolesLocal());
        System.out.println(qatarEcuadorResultado.getGolesVisitante());
    }
}
