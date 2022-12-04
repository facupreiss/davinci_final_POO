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

        //CREO LOS PARTIDOS DEL GRUPO A
        Partido qatarEcuador = new Partido(new Date(2022, 7, 18), qatar,ecuador, new Resultado());
        Partido paiseBajosSenegal = new Partido(new Date(2022, 7, 18), paisesBajos,senegal, new Resultado());
        Partido qatarSenegal = new Partido(new Date(2022, 7, 18), qatar,senegal, new Resultado());
        Partido ecuadorPaiseBajos = new Partido(new Date(2022, 7, 18), ecuador,paisesBajos, new Resultado());
        Partido qatarPaisesBajos = new Partido(new Date(2022, 7, 18), qatar,paisesBajos, new Resultado());
        Partido ecuadorSenegal = new Partido(new Date(2022, 7, 18), ecuador,senegal, new Resultado());

        //CREO EL GRUPO A Y LE AGREGO LOS PARTIDOS AL ARRAY
        Grupo grupoA = new Grupo("Grupo A");
        grupoA.addPartido(qatarEcuador);
        grupoA.addPartido(paiseBajosSenegal);
        grupoA.addPartido(qatarSenegal);
        grupoA.addPartido(ecuadorPaiseBajos);
        grupoA.addPartido(qatarPaisesBajos);
        grupoA.addPartido(ecuadorSenegal);

        qatarEcuador.setPuntos();
        qatarSenegal.setPuntos();
        qatarPaisesBajos.setPuntos();
        paiseBajosSenegal.setPuntos();
        ecuadorPaiseBajos.setPuntos();
        ecuadorSenegal.setPuntos();


       System.out.println(qatar);
        System.out.println(ecuador);
        System.out.println(paisesBajos);
        System.out.println(senegal);

       System.out.println(qatarEcuador);
       System.out.println(qatarSenegal);
       System.out.println(qatarPaisesBajos);
        System.out.println(paiseBajosSenegal);
        System.out.println(ecuadorPaiseBajos);
        System.out.println(ecuadorSenegal);



    }
}
