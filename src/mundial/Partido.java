package mundial;

import java.util.Date;

public class Partido {

    private Date fecha;
    private Equipo local;
    private Equipo visitante;
    private Resultado resultado;

//CONSTRUCTOR
    public Partido(Date fecha, Equipo local, Equipo visitante) {
        this.fecha = fecha;
        this.local = local;
        this.visitante = visitante;
    }

//METODOS
    public Resultado getResultado() {
        return resultado;
    }

    public Equipo getLocal() {
        return local;
    }

    public Equipo getVisitante() {
        return visitante;
    }
}
