import java.util.Date;

import mundial.*;

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

        System.out.println(grupoA.getDescripcionEtapa());
        System.out.println();
        System.out.println(qatarEcuador);
        System.out.println(qatarSenegal);
        System.out.println(qatarPaisesBajos);
        System.out.println(paiseBajosSenegal);
        System.out.println(ecuadorPaiseBajos);
        System.out.println(ecuadorSenegal);
        System.out.println();
        System.out.println(qatar + " " + qatar.getPuntaje());
        System.out.println(ecuador + " " + ecuador.getPuntaje());
        System.out.println(paisesBajos + " " + paisesBajos.getPuntaje());
        System.out.println(senegal + " " + senegal.getPuntaje());
        System.out.println();

        //CREO LOS PARTIDOS DEL GRUPOB
        Partido inglaterraIran = new Partido(new Date(2022, 7, 18), inglaterra,iran, new Resultado());
        Partido estadosUnidosGales = new Partido(new Date(2022, 7, 18), estadosUnidos,gales, new Resultado());
        Partido inglaterraGales = new Partido(new Date(2022, 7, 18), inglaterra,gales, new Resultado());
        Partido estadosUnidosIran = new Partido(new Date(2022, 7, 18), estadosUnidos,iran, new Resultado());
        Partido inglaterraEstadosUnidos = new Partido(new Date(2022, 7, 18), inglaterra,estadosUnidos, new Resultado());
        Partido galesIran = new Partido(new Date(2022, 7, 18), gales,iran, new Resultado());

        //CREO EL GRUPO B Y LE AGREGO LOS PARTIDOS AL ARRAY
        Grupo grupoB = new Grupo("Grupo B");
        grupoB.addPartido(inglaterraIran);
        grupoB.addPartido(estadosUnidosGales);
        grupoB.addPartido(inglaterraGales);
        grupoB.addPartido(estadosUnidosIran);
        grupoB.addPartido(inglaterraEstadosUnidos);
        grupoB.addPartido(galesIran);

        inglaterraIran.setPuntos();
        estadosUnidosGales.setPuntos();
        inglaterraGales.setPuntos();
        estadosUnidosIran.setPuntos();
        inglaterraEstadosUnidos.setPuntos();
        galesIran.setPuntos();

        System.out.println(grupoB.getDescripcionEtapa());
        System.out.println();
        System.out.println(inglaterraIran);
        System.out.println(estadosUnidosGales);
        System.out.println(inglaterraGales);
        System.out.println(estadosUnidosIran);
        System.out.println(inglaterraEstadosUnidos);
        System.out.println(galesIran);
        System.out.println();
        System.out.println(inglaterra + " " + inglaterra.getPuntaje());
        System.out.println(estadosUnidos + " " + estadosUnidos.getPuntaje());
        System.out.println(iran + " " + iran.getPuntaje());
        System.out.println(gales + " " + gales.getPuntaje());
        System.out.println();

        //CREO LOS PARTIDOS DEL GRUPO C
        Partido argentinaArabiaSaudita = new Partido(new Date(2022, 7, 18), argentina,arabiaSaudita, new Resultado());
        Partido mexicoPolonia = new Partido(new Date(2022, 7, 18), mexico,polonia, new Resultado());
        Partido argentinaMexico = new Partido(new Date(2022, 7, 18), argentina,mexico, new Resultado());
        Partido poloniaArabiaSaudita = new Partido(new Date(2022, 7, 18), polonia,arabiaSaudita, new Resultado());
        Partido argentinaPolonia = new Partido(new Date(2022, 7, 18), argentina,polonia, new Resultado());
        Partido mexicoArabiaSaudita = new Partido(new Date(2022, 7, 18), mexico,arabiaSaudita, new Resultado());

        //CREO EL GRUPO C Y LE AGREGO LOS PARTIDOS AL ARRAY
        Grupo grupoC = new Grupo("Grupo C");
        grupoC.addPartido(argentinaArabiaSaudita);
        grupoC.addPartido(mexicoPolonia);
        grupoC.addPartido(argentinaMexico);
        grupoC.addPartido(poloniaArabiaSaudita);
        grupoC.addPartido(argentinaPolonia);
        grupoC.addPartido(mexicoArabiaSaudita);

        argentinaArabiaSaudita.setPuntos();
        mexicoPolonia.setPuntos();
        argentinaMexico.setPuntos();
        poloniaArabiaSaudita.setPuntos();
        argentinaPolonia.setPuntos();
        mexicoArabiaSaudita.setPuntos();

        System.out.println(grupoC.getDescripcionEtapa());
        System.out.println();
        System.out.println(argentinaArabiaSaudita);
        System.out.println(mexicoPolonia);
        System.out.println(argentinaMexico);
        System.out.println(poloniaArabiaSaudita);
        System.out.println(argentinaPolonia);
        System.out.println(mexicoArabiaSaudita);
        System.out.println();
        System.out.println(argentina + " " + argentina.getPuntaje());
        System.out.println(mexico + " " + mexico.getPuntaje());
        System.out.println(polonia + " " + polonia.getPuntaje());
        System.out.println(arabiaSaudita + " " + arabiaSaudita.getPuntaje());
        System.out.println();

        //CREO LOS PARTIDOS DEL GRUPO D
        Partido franciaDinamarca = new Partido(new Date(2022, 7, 18), francia,dinamarca, new Resultado());
        Partido tunezAustralia = new Partido(new Date(2022, 7, 18), tunez,australia, new Resultado());
        Partido franciaAustralia = new Partido(new Date(2022, 7, 18), francia,australia, new Resultado());
        Partido tunezDinamarca = new Partido(new Date(2022, 7, 18), tunez,dinamarca, new Resultado());
        Partido franciaTunez = new Partido(new Date(2022, 7, 18), francia,tunez, new Resultado());
        Partido dinamarcaAustralia = new Partido(new Date(2022, 7, 18), dinamarca,australia, new Resultado());

        //CREO EL GRUPO D Y LE AGREGO LOS PARTIDOS AL ARRAY
        Grupo grupoD = new Grupo("Grupo D");
        grupoD.addPartido(franciaDinamarca);
        grupoD.addPartido(tunezAustralia);
        grupoD.addPartido(franciaAustralia);
        grupoD.addPartido(tunezDinamarca);
        grupoD.addPartido(franciaTunez);
        grupoD.addPartido(dinamarcaAustralia);

        franciaDinamarca.setPuntos();
        tunezAustralia.setPuntos();
        franciaAustralia.setPuntos();
        tunezDinamarca.setPuntos();
        franciaTunez.setPuntos();
        dinamarcaAustralia.setPuntos();

        System.out.println(grupoD.getDescripcionEtapa());
        System.out.println();
        System.out.println(franciaDinamarca);
        System.out.println(tunezAustralia);
        System.out.println(franciaAustralia);
        System.out.println(tunezDinamarca);
        System.out.println(franciaTunez);
        System.out.println(dinamarcaAustralia);
        System.out.println();
        System.out.println(francia + " " + francia.getPuntaje());
        System.out.println(dinamarca + " " + dinamarca.getPuntaje());
        System.out.println(tunez + " " + tunez.getPuntaje());
        System.out.println(australia + " " + australia.getPuntaje());
        System.out.println();

        //CREO LOS PARTIDOS DEL GRUPO E
        Partido espanaAlemania = new Partido(new Date(2022, 7, 18), espana,alemania, new Resultado());
        Partido japonCostaRica = new Partido(new Date(2022, 7, 18), japon,costaRica, new Resultado());
        Partido espanaJapon = new Partido(new Date(2022, 7, 18), espana,japon, new Resultado());
        Partido alemaniaCostaRica = new Partido(new Date(2022, 7, 18), alemania,costaRica, new Resultado());
        Partido espanaCostaRica = new Partido(new Date(2022, 7, 18), espana,costaRica, new Resultado());
        Partido alemaniaJapon = new Partido(new Date(2022, 7, 18), alemania,japon, new Resultado());

        //CREO EL GRUPO E Y LE AGREGO LOS PARTIDOS AL ARRAY
        Grupo grupoE = new Grupo("Grupo E");
        grupoE.addPartido(espanaAlemania);
        grupoE.addPartido(japonCostaRica);
        grupoE.addPartido(espanaJapon);
        grupoE.addPartido(alemaniaCostaRica);
        grupoE.addPartido(espanaCostaRica);
        grupoE.addPartido(alemaniaJapon);

        espanaAlemania.setPuntos();
        japonCostaRica.setPuntos();
        espanaJapon.setPuntos();
        alemaniaCostaRica.setPuntos();
        espanaCostaRica.setPuntos();
        alemaniaJapon.setPuntos();

        System.out.println(grupoE.getDescripcionEtapa());
        System.out.println();
        System.out.println(espanaAlemania);
        System.out.println(japonCostaRica);
        System.out.println(espanaJapon);
        System.out.println(alemaniaCostaRica);
        System.out.println(espanaCostaRica);
        System.out.println(alemaniaJapon);
        System.out.println();
        System.out.println(espana + " " + espana.getPuntaje());
        System.out.println(alemania + " " + alemania.getPuntaje());
        System.out.println(japon + " " + japon.getPuntaje());
        System.out.println(costaRica + " " + costaRica.getPuntaje());
        System.out.println();

        //CREO LOS PARTIDOS DEL GRUPO F
        Partido belgicaCroacia = new Partido(new Date(2022, 7, 18), belgica,croacia, new Resultado());
        Partido marruecosCanada = new Partido(new Date(2022, 7, 18), marruecos,canada, new Resultado());
        Partido belgicaMarruecos = new Partido(new Date(2022, 7, 18), belgica,marruecos, new Resultado());
        Partido croaciaCanada = new Partido(new Date(2022, 7, 18), croacia,canada, new Resultado());
        Partido belgicaCanada = new Partido(new Date(2022, 7, 18), belgica,canada, new Resultado());
        Partido marruecosCroacia = new Partido(new Date(2022, 7, 18), marruecos,croacia, new Resultado());

        //CREO EL GRUPO F Y LE AGREGO LOS PARTIDOS AL ARRAY
        Grupo grupoF = new Grupo("Grupo F");
        grupoF.addPartido(belgicaCroacia);
        grupoF.addPartido(marruecosCanada);
        grupoF.addPartido(belgicaMarruecos);
        grupoF.addPartido(croaciaCanada);
        grupoF.addPartido(belgicaCanada);
        grupoF.addPartido(marruecosCroacia);

        belgicaCroacia.setPuntos();
        marruecosCanada.setPuntos();
        belgicaMarruecos.setPuntos();
        croaciaCanada.setPuntos();
        belgicaCanada.setPuntos();
        marruecosCroacia.setPuntos();

        System.out.println(grupoF.getDescripcionEtapa());
        System.out.println();
        System.out.println(belgicaCroacia);
        System.out.println(marruecosCanada);
        System.out.println(belgicaMarruecos);
        System.out.println(croaciaCanada);
        System.out.println(belgicaCanada);
        System.out.println(marruecosCroacia);
        System.out.println();
        System.out.println(belgica + " " + belgica.getPuntaje());
        System.out.println(croacia + " " + croacia.getPuntaje());
        System.out.println(marruecos + " " + marruecos.getPuntaje());
        System.out.println(canada + " " + canada.getPuntaje());
        System.out.println();

        //CREO LOS PARTIDOS DEL GRUPO G
        Partido brasilSerbia = new Partido(new Date(2022, 7, 18), brasil,serbia, new Resultado());
        Partido suizaCamerun = new Partido(new Date(2022, 7, 18), suiza,camerun, new Resultado());
        Partido brasilSuiza = new Partido(new Date(2022, 7, 18), brasil,suiza, new Resultado());
        Partido serbiaCamerun = new Partido(new Date(2022, 7, 18), serbia,camerun, new Resultado());
        Partido brasilCamerun = new Partido(new Date(2022, 7, 18), brasil,camerun, new Resultado());
        Partido suizaSerbia = new Partido(new Date(2022, 7, 18), suiza,serbia, new Resultado());

        //CREO EL GRUPO G Y LE AGREGO LOS PARTIDOS AL ARRAY
        Grupo grupoG = new Grupo("Grupo G");
        grupoG.addPartido(brasilSerbia);
        grupoG.addPartido(suizaCamerun);
        grupoG.addPartido(brasilSuiza);
        grupoG.addPartido(serbiaCamerun);
        grupoG.addPartido(brasilCamerun);
        grupoG.addPartido(suizaSerbia);

        brasilSerbia.setPuntos();
        suizaCamerun.setPuntos();
        brasilSuiza.setPuntos();
        serbiaCamerun.setPuntos();
        brasilCamerun.setPuntos();
        suizaSerbia.setPuntos();

        System.out.println(grupoG.getDescripcionEtapa());
        System.out.println();
        System.out.println(brasilSerbia);
        System.out.println(suizaCamerun);
        System.out.println(brasilSuiza);
        System.out.println(serbiaCamerun);
        System.out.println(brasilCamerun);
        System.out.println(suizaSerbia);
        System.out.println();
        System.out.println(brasil + " " + brasil.getPuntaje());
        System.out.println(serbia + " " + serbia.getPuntaje());
        System.out.println(suiza + " " + suiza.getPuntaje());
        System.out.println(camerun + " " + camerun.getPuntaje());
        System.out.println();

        //CREO LOS PARTIDOS DEL GRUPO H
        Partido portugalUruguay = new Partido(new Date(2022, 7, 18), portugal,uruguay, new Resultado());
        Partido coreaGhana = new Partido(new Date(2022, 7, 18), corea,ghana, new Resultado());
        Partido portugalCorea = new Partido(new Date(2022, 7, 18), portugal,corea, new Resultado());
        Partido uruguayGhana = new Partido(new Date(2022, 7, 18), uruguay,ghana, new Resultado());
        Partido portugalGhana = new Partido(new Date(2022, 7, 18), portugal,ghana, new Resultado());
        Partido uruguayCorea = new Partido(new Date(2022, 7, 18), uruguay,corea, new Resultado());

        //CREO EL GRUPO H Y LE AGREGO LOS PARTIDOS AL ARRAY
        Grupo grupoH = new Grupo("Grupo H");
        grupoH.addPartido(portugalUruguay);
        grupoH.addPartido(coreaGhana);
        grupoH.addPartido(portugalCorea);
        grupoH.addPartido(uruguayGhana);
        grupoH.addPartido(portugalGhana);
        grupoH.addPartido(uruguayCorea);

        portugalUruguay.setPuntos();
        coreaGhana.setPuntos();
        portugalCorea.setPuntos();
        uruguayGhana.setPuntos();
        portugalGhana.setPuntos();
        uruguayCorea.setPuntos();

        System.out.println(grupoH.getDescripcionEtapa());
        System.out.println();
        System.out.println(portugalUruguay);
        System.out.println(coreaGhana);
        System.out.println(portugalCorea);
        System.out.println(uruguayGhana);
        System.out.println(portugalGhana);
        System.out.println(uruguayCorea);
        System.out.println();
        System.out.println(portugal + " " + portugal.getPuntaje());
        System.out.println(uruguay + " " + uruguay.getPuntaje());
        System.out.println(corea + " " + corea.getPuntaje());
        System.out.println(ghana + " " + ghana.getPuntaje());
        System.out.println();

        //FASES ELIMINATORIAS
        Llave octavos = new Llave("Octavos de final");
        octavos.addPartido(argentinaPolonia);
        octavos.addPartido(alemaniaJapon);
        octavos.addPartido(brasilSerbia);
        octavos.addPartido(paiseBajosSenegal);
        octavos.addPartido(espanaCostaRica);
        octavos.addPartido(suizaCamerun);
        octavos.addPartido(belgicaCroacia);
        octavos.addPartido(inglaterraEstadosUnidos);

        System.out.println(octavos.getDescripcionEtapa());
        System.out.println(octavos.getEquiposQueAvanzan());
        System.out.println();

        Llave cuartos = new Llave("Cuartos de final");
        Partido cuartos1 = new Partido(new Date(2022, 7, 18), octavos.getEquiposQueAvanzan().get(0),octavos.getEquiposQueAvanzan().get(1), new Resultado());
        Partido cuartos2 = new Partido(new Date(2022, 7, 18), octavos.getEquiposQueAvanzan().get(2),octavos.getEquiposQueAvanzan().get(3), new Resultado());
        Partido cuartos3 = new Partido(new Date(2022, 7, 18), octavos.getEquiposQueAvanzan().get(4),octavos.getEquiposQueAvanzan().get(5), new Resultado());
        Partido cuartos4 = new Partido(new Date(2022, 7, 18), octavos.getEquiposQueAvanzan().get(6),octavos.getEquiposQueAvanzan().get(7), new Resultado());

        cuartos.addPartido(cuartos1);
        cuartos.addPartido(cuartos2);
        cuartos.addPartido(cuartos3);
        cuartos.addPartido(cuartos4);

        System.out.println(cuartos.getDescripcionEtapa());
        System.out.println(cuartos1);
        System.out.println(cuartos2);
        System.out.println(cuartos3);
        System.out.println(cuartos4);
        System.out.println();

        Llave semis = new Llave("Semifinales");
        Partido semis1 = new Partido(new Date(2022, 7, 18), cuartos.getEquiposQueAvanzan().get(0),cuartos.getEquiposQueAvanzan().get(1), new Resultado());
        Partido semis2 = new Partido(new Date(2022, 7, 18), cuartos.getEquiposQueAvanzan().get(2),cuartos.getEquiposQueAvanzan().get(3), new Resultado());

        semis.addPartido(semis1);
        semis.addPartido(semis2);

        System.out.println(semis.getDescripcionEtapa());
        System.out.println(semis1);
        System.out.println(semis2);
        System.out.println();

        Llave finalMundial = new Llave ("Final");
        Partido final1 = new Partido(new Date(2022, 7, 18), semis.getEquiposQueAvanzan().get(0),semis.getEquiposQueAvanzan().get(1), new Resultado());
        finalMundial.addPartido(final1);

        System.out.println(finalMundial.getDescripcionEtapa());
        System.out.println(final1);
        System.out.println();
        System.out.println("El campeón mundial es: " + finalMundial.getEquiposQueAvanzan());








    }
}
