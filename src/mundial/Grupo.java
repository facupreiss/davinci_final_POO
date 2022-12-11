package mundial;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Grupo extends EtapaMundial {

    public Grupo(String descripcionEtapa) {
        super(descripcionEtapa);
        this.setPartidos(new ArrayList<Partido>(0));
    }

    @Override
    public ArrayList<Equipo> getEquiposQueAvanzan() {
        ArrayList<Equipo> equiposQueAvanzan = new ArrayList();

        equiposQueAvanzan.add(super.getPartidos().get(0).getLocal());
        equiposQueAvanzan.add(super.getPartidos().get(0).getVisitante());
        equiposQueAvanzan.add(super.getPartidos().get(1).getLocal());
        equiposQueAvanzan.add(super.getPartidos().get(1).getVisitante());

        Collections.sort(equiposQueAvanzan, Comparator.comparing(Equipo::getPuntaje));

        equiposQueAvanzan.remove(0);
        equiposQueAvanzan.remove(0);

        return equiposQueAvanzan;
    }

    }

