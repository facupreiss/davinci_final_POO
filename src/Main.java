import java.util.Date;

import mundial.*;
import sistemaGarage.Garage;
import sistemaGarage.vehiculos.Auto;
import sistemaGarage.vehiculos.Moto;

public class Main {
    public static void main(String[] args) {

        //EQUIPOS
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

        System.out.println("Fase de grupos");
        System.out.println();


        //CREO EL GRUPO A Y LE AGREGO LOS PARTIDOS AL ARRAY
        Grupo grupoA = new Grupo("Grupo A");
        grupoA.addPartido(new Partido(new Date(2022, 7, 18), qatar,ecuador, new Resultado()));
        grupoA.addPartido(new Partido(new Date(2022, 7, 18), paisesBajos,senegal, new Resultado()));
        grupoA.addPartido(new Partido(new Date(2022, 7, 18), qatar,senegal, new Resultado()));
        grupoA.addPartido(new Partido(new Date(2022, 7, 18), ecuador,paisesBajos, new Resultado()));
        grupoA.addPartido(new Partido(new Date(2022, 7, 18), qatar,paisesBajos, new Resultado()));
        grupoA.addPartido(new Partido(new Date(2022, 7, 18), ecuador,senegal, new Resultado()));

        grupoA.setearPuntos();
        System.out.println(grupoA.getDescripcionEtapa());
        System.out.println();
        grupoA.toStringPartidos();
        System.out.println();
        System.out.println(qatar + " " + qatar.getPuntaje());
        System.out.println(ecuador + " " + ecuador.getPuntaje());
        System.out.println(paisesBajos + " " + paisesBajos.getPuntaje());
        System.out.println(senegal + " " + senegal.getPuntaje());
        System.out.println();
        System.out.println("Clasifican: " + grupoA.getEquiposQueAvanzan());
        System.out.println();


        //CREO EL GRUPO B Y LE AGREGO LOS PARTIDOS AL ARRAY
        Grupo grupoB = new Grupo("Grupo B");
        grupoB.addPartido(new Partido(new Date(2022, 7, 18), inglaterra,iran, new Resultado()));
        grupoB.addPartido(new Partido(new Date(2022, 7, 18), estadosUnidos,gales, new Resultado()));
        grupoB.addPartido(new Partido(new Date(2022, 7, 18), inglaterra,gales, new Resultado()));
        grupoB.addPartido(new Partido(new Date(2022, 7, 18), estadosUnidos,iran, new Resultado()));
        grupoB.addPartido(new Partido(new Date(2022, 7, 18), inglaterra,estadosUnidos, new Resultado()));
        grupoB.addPartido(new Partido(new Date(2022, 7, 18), gales,iran, new Resultado()));

        grupoB.setearPuntos();
        System.out.println(grupoB.getDescripcionEtapa());
        System.out.println();
        grupoB.toStringPartidos();
        System.out.println();
        System.out.println(inglaterra + " " + inglaterra.getPuntaje());
        System.out.println(estadosUnidos + " " + estadosUnidos.getPuntaje());
        System.out.println(iran + " " + iran.getPuntaje());
        System.out.println(gales + " " + gales.getPuntaje());
        System.out.println();
        System.out.println("Clasifican: " + grupoB.getEquiposQueAvanzan());
        System.out.println();


        //CREO EL GRUPO C Y LE AGREGO LOS PARTIDOS AL ARRAY
        Grupo grupoC = new Grupo("Grupo C");
        grupoC.addPartido(new Partido(new Date(2022, 7, 18), argentina,arabiaSaudita, new Resultado()));
        grupoC.addPartido(new Partido(new Date(2022, 7, 18), mexico,polonia, new Resultado()));
        grupoC.addPartido(new Partido(new Date(2022, 7, 18), argentina,mexico, new Resultado()));
        grupoC.addPartido(new Partido(new Date(2022, 7, 18), polonia,arabiaSaudita, new Resultado()));
        grupoC.addPartido(new Partido(new Date(2022, 7, 18), argentina,polonia, new Resultado()));
        grupoC.addPartido(new Partido(new Date(2022, 7, 18), mexico,arabiaSaudita, new Resultado()));

        grupoC.setearPuntos();

        System.out.println(grupoC.getDescripcionEtapa());
        System.out.println();
        grupoC.toStringPartidos();
        System.out.println();
        System.out.println(argentina + " " + argentina.getPuntaje());
        System.out.println(mexico + " " + mexico.getPuntaje());
        System.out.println(polonia + " " + polonia.getPuntaje());
        System.out.println(arabiaSaudita + " " + arabiaSaudita.getPuntaje());
        System.out.println();
        System.out.println("Clasifican: " + grupoC.getEquiposQueAvanzan());
        System.out.println();


        //CREO EL GRUPO D Y LE AGREGO LOS PARTIDOS AL ARRAY
        Grupo grupoD = new Grupo("Grupo D");
        grupoD.addPartido(new Partido(new Date(2022, 7, 18), francia,dinamarca, new Resultado()));
        grupoD.addPartido(new Partido(new Date(2022, 7, 18), tunez,australia, new Resultado()));
        grupoD.addPartido(new Partido(new Date(2022, 7, 18), francia,australia, new Resultado()));
        grupoD.addPartido(new Partido(new Date(2022, 7, 18), tunez,dinamarca, new Resultado()));
        grupoD.addPartido(new Partido(new Date(2022, 7, 18), francia,tunez, new Resultado()));
        grupoD.addPartido(new Partido(new Date(2022, 7, 18), dinamarca,australia, new Resultado()));

        grupoD.setearPuntos();

        System.out.println(grupoD.getDescripcionEtapa());
        System.out.println();
        grupoD.toStringPartidos();
        System.out.println();
        System.out.println(francia + " " + francia.getPuntaje());
        System.out.println(dinamarca + " " + dinamarca.getPuntaje());
        System.out.println(tunez + " " + tunez.getPuntaje());
        System.out.println(australia + " " + australia.getPuntaje());
        System.out.println();
        System.out.println("Clasifican: " + grupoD.getEquiposQueAvanzan());
        System.out.println();


        //CREO EL GRUPO E Y LE AGREGO LOS PARTIDOS AL ARRAY
        Grupo grupoE = new Grupo("Grupo E");
        grupoE.addPartido(new Partido(new Date(2022, 7, 18), espana,alemania, new Resultado()));
        grupoE.addPartido(new Partido(new Date(2022, 7, 18), japon,costaRica, new Resultado()));
        grupoE.addPartido(new Partido(new Date(2022, 7, 18), espana,japon, new Resultado()));
        grupoE.addPartido(new Partido(new Date(2022, 7, 18), alemania,costaRica, new Resultado()));
        grupoE.addPartido(new Partido(new Date(2022, 7, 18), espana,costaRica, new Resultado()));
        grupoE.addPartido(new Partido(new Date(2022, 7, 18), alemania,japon, new Resultado()));

        grupoE.setearPuntos();

        System.out.println(grupoE.getDescripcionEtapa());
        System.out.println();
        grupoE.toStringPartidos();
        System.out.println();
        System.out.println(espana + " " + espana.getPuntaje());
        System.out.println(alemania + " " + alemania.getPuntaje());
        System.out.println(japon + " " + japon.getPuntaje());
        System.out.println(costaRica + " " + costaRica.getPuntaje());
        System.out.println();
        System.out.println("Clasifican: " + grupoE.getEquiposQueAvanzan());
        System.out.println();


        //CREO EL GRUPO F Y LE AGREGO LOS PARTIDOS AL ARRAY
        Grupo grupoF = new Grupo("Grupo F");
        grupoF.addPartido(new Partido(new Date(2022, 7, 18), belgica,croacia, new Resultado()));
        grupoF.addPartido(new Partido(new Date(2022, 7, 18), marruecos,canada, new Resultado()));
        grupoF.addPartido(new Partido(new Date(2022, 7, 18), belgica,marruecos, new Resultado()));
        grupoF.addPartido(new Partido(new Date(2022, 7, 18), croacia,canada, new Resultado()));
        grupoF.addPartido(new Partido(new Date(2022, 7, 18), belgica,canada, new Resultado()));
        grupoF.addPartido(new Partido(new Date(2022, 7, 18), marruecos,croacia, new Resultado()));

        grupoF.setearPuntos();

        System.out.println(grupoF.getDescripcionEtapa());
        System.out.println();
        grupoF.toStringPartidos();
        System.out.println();
        System.out.println(belgica + " " + belgica.getPuntaje());
        System.out.println(croacia + " " + croacia.getPuntaje());
        System.out.println(marruecos + " " + marruecos.getPuntaje());
        System.out.println(canada + " " + canada.getPuntaje());
        System.out.println();
        System.out.println("Clasifican: " + grupoF.getEquiposQueAvanzan());
        System.out.println();


        //CREO EL GRUPO G Y LE AGREGO LOS PARTIDOS AL ARRAY
        Grupo grupoG = new Grupo("Grupo G");
        grupoG.addPartido(new Partido(new Date(2022, 7, 18), brasil,serbia, new Resultado()));
        grupoG.addPartido(new Partido(new Date(2022, 7, 18), suiza,camerun, new Resultado()));
        grupoG.addPartido(new Partido(new Date(2022, 7, 18), brasil,suiza, new Resultado()));
        grupoG.addPartido(new Partido(new Date(2022, 7, 18), serbia,camerun, new Resultado()));
        grupoG.addPartido(new Partido(new Date(2022, 7, 18), brasil,camerun, new Resultado()));
        grupoG.addPartido(new Partido(new Date(2022, 7, 18), suiza,serbia, new Resultado()));

        grupoG.setearPuntos();

        System.out.println(grupoG.getDescripcionEtapa());
        System.out.println();
        grupoG.toStringPartidos();
        System.out.println();
        System.out.println(brasil + " " + brasil.getPuntaje());
        System.out.println(serbia + " " + serbia.getPuntaje());
        System.out.println(suiza + " " + suiza.getPuntaje());
        System.out.println(camerun + " " + camerun.getPuntaje());
        System.out.println();
        System.out.println("Clasifican: " + grupoG.getEquiposQueAvanzan());
        System.out.println();


        //CREO EL GRUPO H Y LE AGREGO LOS PARTIDOS AL ARRAY
        Grupo grupoH = new Grupo("Grupo H");
        grupoH.addPartido(new Partido(new Date(2022, 7, 18), portugal,uruguay, new Resultado()));
        grupoH.addPartido(new Partido(new Date(2022, 7, 18), corea,ghana, new Resultado()));
        grupoH.addPartido(new Partido(new Date(2022, 7, 18), portugal,corea, new Resultado()));
        grupoH.addPartido(new Partido(new Date(2022, 7, 18), uruguay,ghana, new Resultado()));
        grupoH.addPartido(new Partido(new Date(2022, 7, 18), portugal,ghana, new Resultado()));
        grupoH.addPartido(new Partido(new Date(2022, 7, 18), uruguay,corea, new Resultado()));

        grupoH.setearPuntos();

        System.out.println(grupoH.getDescripcionEtapa());
        System.out.println();
        grupoH.toStringPartidos();
        System.out.println();
        System.out.println(portugal + " " + portugal.getPuntaje());
        System.out.println(uruguay + " " + uruguay.getPuntaje());
        System.out.println(corea + " " + corea.getPuntaje());
        System.out.println(ghana + " " + ghana.getPuntaje());
        System.out.println();
        System.out.println("Clasifican: " + grupoH.getEquiposQueAvanzan());
        System.out.println();

        //FASES ELIMINATORIAS
        Llave octavos = new Llave("Octavos de final");

        octavos.addPartido(new Partido(new Date(2022, 7, 18), grupoA.getEquiposQueAvanzan().get(1),grupoB.getEquiposQueAvanzan().get(0), new Resultado()));
        octavos.addPartido(new Partido(new Date(2022, 7, 18), grupoC.getEquiposQueAvanzan().get(1),grupoD.getEquiposQueAvanzan().get(0), new Resultado()));
        octavos.addPartido(new Partido(new Date(2022, 7, 18), grupoE.getEquiposQueAvanzan().get(1),grupoF.getEquiposQueAvanzan().get(0), new Resultado()));
        octavos.addPartido(new Partido(new Date(2022, 7, 18), grupoG.getEquiposQueAvanzan().get(1),grupoH.getEquiposQueAvanzan().get(0), new Resultado()));
        octavos.addPartido(new Partido(new Date(2022, 7, 18), grupoB.getEquiposQueAvanzan().get(1),grupoA.getEquiposQueAvanzan().get(0), new Resultado()));
        octavos.addPartido(new Partido(new Date(2022, 7, 18), grupoD.getEquiposQueAvanzan().get(1),grupoC.getEquiposQueAvanzan().get(0), new Resultado()));
        octavos.addPartido(new Partido(new Date(2022, 7, 18), grupoF.getEquiposQueAvanzan().get(1),grupoE.getEquiposQueAvanzan().get(0), new Resultado()));
        octavos.addPartido(new Partido(new Date(2022, 7, 18), grupoH.getEquiposQueAvanzan().get(1),grupoG.getEquiposQueAvanzan().get(0), new Resultado()));

        System.out.println(octavos.getDescripcionEtapa());
        octavos.toStringPartidos();
        System.out.println();

        Llave cuartos = new Llave("Cuartos de final");
        cuartos.addPartido(new Partido(new Date(2022, 7, 18), octavos.getEquiposQueAvanzan().get(0),octavos.getEquiposQueAvanzan().get(1), new Resultado()));
        cuartos.addPartido(new Partido(new Date(2022, 7, 18), octavos.getEquiposQueAvanzan().get(2),octavos.getEquiposQueAvanzan().get(3), new Resultado()));
        cuartos.addPartido(new Partido(new Date(2022, 7, 18), octavos.getEquiposQueAvanzan().get(4),octavos.getEquiposQueAvanzan().get(5), new Resultado()));
        cuartos.addPartido(new Partido(new Date(2022, 7, 18), octavos.getEquiposQueAvanzan().get(6),octavos.getEquiposQueAvanzan().get(7), new Resultado()));

        System.out.println(cuartos.getDescripcionEtapa());
        cuartos.toStringPartidos();
        System.out.println();

        Llave semis = new Llave("Semifinales");
        semis.addPartido(new Partido(new Date(2022, 7, 18), cuartos.getEquiposQueAvanzan().get(0),cuartos.getEquiposQueAvanzan().get(1), new Resultado()));
        semis.addPartido(new Partido(new Date(2022, 7, 18), cuartos.getEquiposQueAvanzan().get(2),cuartos.getEquiposQueAvanzan().get(3), new Resultado()));

        System.out.println(semis.getDescripcionEtapa());
        semis.toStringPartidos();
        System.out.println();

        Llave finalMundial = new Llave ("Final");
        finalMundial.addPartido(new Partido(new Date(2022, 7, 18), semis.getEquiposQueAvanzan().get(0),semis.getEquiposQueAvanzan().get(1), new Resultado()));

        System.out.println(finalMundial.getDescripcionEtapa());
        finalMundial.toStringPartidos();
        System.out.println();
        System.out.println("El campeón mundial es: " + finalMundial.getEquiposQueAvanzan());


        System.out.println();
        System.out.println();
        System.out.println();
//----------------------------------------------------------------------------------------------------------------------------------------

        Garage garage = new Garage(200,10);

        Auto auto1 = new Auto(1000, 4, "Peugeot", 4 );
        Auto auto2 = new Auto(1000, 4, "Peugeot", 4 );
        Auto auto3 = new Auto(1000, 4, "Peugeot", 4 );
        Moto moto1 = new Moto(500, 2, "BMW", 250);

        garage.agregarVehiculo(auto1);
        garage.agregarVehiculo(auto2);
        garage.agregarVehiculo(auto3);
        garage.agregarVehiculo(moto1);

        System.out.println(garage.getVehiculos());
        System.out.println();
        System.out.println("Precio para cambiar todas las ruedas: " + garage.precioCambiarTodasLasRuedas());
        System.out.println("Kilometraje medio: " + garage.kilometrajeMedio());

    }
}
