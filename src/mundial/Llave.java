package mundial;

import java.util.ArrayList;

public class Llave extends EtapaMundial{

    public Llave(String descripcionEtapa) {
        super(descripcionEtapa);
        this.setPartidos(new ArrayList<Partido>(0));
    }

    @Override
    public ArrayList<Equipo> getEquiposQueAvanzan() {
        ArrayList<Equipo> equiposQueAvanzan = new ArrayList;
        int i;
        for (i = 0; i < super.getPartidos().size(); i++)
            
        return null;

    }

}
