package mundial;

import java.util.ArrayList;

public class Llave extends EtapaMundial{

    public Llave(String descripcionEtapa) {
        super(descripcionEtapa);
        this.setPartidos(new ArrayList<Partido>(0));
    }

    @Override
    public ArrayList<Equipo> getEquiposQueAvanzan() {
        ArrayList<Equipo> equiposQueAvanzan = new ArrayList();

        for (int i = 0; i < super.getPartidos().size();) {

            if (super.getPartidos().get(i).getResultado().ganoLocal()) {
        equiposQueAvanzan.add(super.getPartidos().get(i).getLocal());
            }
            else { equiposQueAvanzan.add(super.getPartidos().get(i).getVisitante());}
            i++;
        }
        return equiposQueAvanzan;
    }
}
