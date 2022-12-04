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

        Equipo inglaterra = new Equipo("Inglaterra");
        Equipo estadosUnidos = new Equipo("Estados Unidos");
        Equipo iran = new Equipo("Irán");
        Equipo gales = new Equipo("Gales");

        Equipo argentina = new Equipo("Argentina");
        Equipo polonia = new Equipo("Polonia");
        Equipo mexico = new Equipo("México");
        Equipo arabiaSaudita = new Equipo("Arabia Saudita");

        Equipo francia = new Equipo("Francia");
        Equipo dinamarca = new Equipo("Dinamarca");
        Equipo tunez = new Equipo("Tunez");
        Equipo australia = new Equipo("Australia");

        Equipo espana = new Equipo("España");
        Equipo alemania = new Equipo("Alemania");
        Equipo japon = new Equipo("Japón");
        Equipo costaRica = new Equipo("Costa Rica");

        Equipo belgica = new Equipo("Bélgica");
        Equipo croacia = new Equipo("Croacia");
        Equipo marruecos = new Equipo("Marruecos");
        Equipo canada = new Equipo("Canadá");

        Equipo brasil = new Equipo("Brasil");
        Equipo serbia = new Equipo("Serbia");
        Equipo suiza = new Equipo("Suiza");
        Equipo camerun = new Equipo("Camerun");

        Equipo portugal = new Equipo("Portugal");
        Equipo uruguay = new Equipo("Uruguay");
        Equipo corea = new Equipo("Corea del Sur");
        Equipo ghana = new Equipo("Ghana");

        Date qatarEcuadorFecha = new Date(2022,7,18);

        Partido qatarEcuador = new Partido(qatarEcuadorFecha, qatar,ecuador);

        Resultado qatarEcuadorResultado = new Resultado();

        qatarEcuadorResultado.setResultado();
        System.out.println(qatarEcuadorResultado.getGolesLocal());
        System.out.println(qatarEcuadorResultado.getGolesVisitante());
    }
}
