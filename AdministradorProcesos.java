
public class AdministradorProcesos {
    
    private Maquina listaMaquina[];
    private Proceso listaProcesos[];
    private int nTiempoMax;
    private int aTiempo;
    private int numProcesos;
    private int nProceso;
    private char tablaEstados[][];
    private int metodoPlanificacion;//Estatico
    private int modo;

    public AdministradorProcesos(Maquina[] listaMaquina, Proceso[] listaProcesos, int nTiempoMax, int aTiempo, int numProcesos, int nProceso, char[][] tablaEstados, int metodoPlanificacion, int modo) {
        this.listaMaquina = listaMaquina;
        this.listaProcesos = listaProcesos;
        this.nTiempoMax = nTiempoMax;
        this.aTiempo = aTiempo;
        this.numProcesos = numProcesos;
        this.nProceso = nProceso;
        this.tablaEstados = tablaEstados;
        this.metodoPlanificacion = metodoPlanificacion;
        this.modo = modo;
    }
    
    public Maquina[] getListaMaquina() {
        return listaMaquina;
    }

    public void setListaMaquina(Maquina[] listaMaquina) {
        this.listaMaquina = listaMaquina;
    }

    public Proceso[] getListaProcesos() {
        return listaProcesos;
    }

    public void setListaProcesos(Proceso[] listaProcesos) {
        this.listaProcesos = listaProcesos;
    }

    public int getnTiempoMax() {
        return nTiempoMax;
    }

    public void setnTiempoMax(int nTiempoMax) {
        this.nTiempoMax = nTiempoMax;
    }

    public int getaTiempo() {
        return aTiempo;
    }

    public void setaTiempo(int aTiempo) {
        this.aTiempo = aTiempo;
    }

    public int getNumProcesos() {
        return numProcesos;
    }

    public void setNumProcesos(int numProcesos) {
        this.numProcesos = numProcesos;
    }


    public char[][] getTablaEstados() {
        return tablaEstados;
    }

    public void setTablaEstados(char[][] tablaEstados) {
        this.tablaEstados = tablaEstados;
    }

    public int getMetodoPlanificacion() {
        return metodoPlanificacion;
    }

    public void setMetodoPlanificacion(int metodoPlanificacion) {
        this.metodoPlanificacion = metodoPlanificacion;
    }    
}

   