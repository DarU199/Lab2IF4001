
public class ListaMaquina {

    private Maquina listaMaquinas[];
    private int maximoMaquinas;
    private int aMaquina;

    public ListaMaquina() {
        this.aMaquina = 0;
        this.maximoMaquinas = 10;
        listaMaquinas = new Maquina[maximoMaquinas];
    }

    public ListaMaquina(int maximoMaquinas) {
        this.aMaquina = 0;
        this.maximoMaquinas = maximoMaquinas;
        listaMaquinas = new Maquina[maximoMaquinas];

        for (int i = 0; i < maximoMaquinas; i++) {
            listaMaquinas[i] = new Maquina(20, "Maq " + i, "Aula 6", 0);
        }
    }

    public void agregarMaquina(Maquina nueva) {
        listaMaquinas[aMaquina++] = nueva;

    }

    public int getMaximoMaquina() {
        return maximoMaquinas;
    }

    public int getAMaquina() {
        return aMaquina;
    }

    public ListaMaquina eliminarMaquina(int pos) {
        ListaMaquina temporal = new ListaMaquina(this.getAMaquina());

        for (int i = 0; i < aMaquina; i++) {

            if (i != pos) {
                temporal.agregarMaquina(listaMaquinas[i]);
            }
        }

        return temporal;
    }

    public void limpiarListaMaquina() {
        for (int i = 0; i < maximoMaquinas; i++) {
            listaMaquinas[i] = null;
        }
        aMaquina = 0;
    }

    public void sustituirListaMaquina(ListaMaquina nueva) {
        limpiarListaMaquina();
        System.out.println("lista eliminada \n" + nueva.listarMaquinas());
        for (int i = 0; i <= aMaquina; i++) {
            this.listaMaquinas[i] = nueva.getMaquinaLista(i);
        }
    }

    public Maquina getMaquinaLista(int pos) {
        return listaMaquinas[pos];
    }

    public String toString() {
        String sal = "";
        for (int i = 0; i < aMaquina; i++) {
            sal += listaMaquinas[i].toString() + "\n";
        }

        return sal;
    }

    public String listarMaquinas() {
        String sal = "Nombre \t\t UBI \t Tini  MEM\t DISPO  UTI\n";
        for (int i = 0; i < aMaquina; i++) {
            sal += listaMaquinas[i].listarMaquinaDetalle() + "\n";
        }
        sal += "\t\t\t\t\t\t" + totalMemoria();
        sal += "\t" + totalMemoriaDisponibles();
        sal += "\t" + totalMemoriaUtilizada();

        return sal;
    }

    public String listarMaquinas(int tiempo) {
        String sal = "Nombre \t\t UBI \t Tini  MEM\t DISPO  UTI\n";
        for (int i = 0; i < aMaquina; i++) {
            if (listaMaquinas[i].getTiempoInicio() <= tiempo) {
                sal += listaMaquinas[i].listarMaquinaDetalle() + "\n";
            }
        }
        sal += "\t\t\t\t\t\t" + totalMemoria(tiempo);
        sal += "\t" + totalMemoriaDisponibles(tiempo);
        sal += "\t" + totalMemoriaUtilizada(tiempo);

        return sal;
    }
    // T O T A L I Z A C I O N 

    public int totalMemoria() {
        int suma = 0;
        for (int i = 0; i < aMaquina; i++) {

            suma += listaMaquinas[i].getUnidadesMemoriaMaquina();
        }

        return suma;
    }

    // 
    public int totalMemoria(int tiempo) {
        int suma = 0;

        for (int i = 0; i < aMaquina; i++) {
            if (listaMaquinas[i].getTiempoInicio() <= tiempo) {
                suma += listaMaquinas[i].getUnidadesMemoriaMaquina();
            }
        }

        return suma;
    }

    public int totalMemoriaUtilizada() {
        int suma = 0;
        for (int i = 0; i < aMaquina; i++) {
            suma += listaMaquinas[i].getUnidadesMemoriaUtilizada();
        }

        return suma;
    }

    public int totalMemoriaUtilizada(int tiempo) {
        int suma = 0;
        for (int i = 0; i < aMaquina; i++) {
            if (listaMaquinas[i].getTiempoInicio() <= tiempo) {
                suma += listaMaquinas[i].getUnidadesMemoriaUtilizada();
            }
        }

        return suma;
    }

    public int totalMemoriaDisponibles() {
        int suma = 0;
        for (int i = 0; i < aMaquina; i++) {
            suma += listaMaquinas[i].getUnidadesMemoriaDisponible();
        }

        return suma;
    }

    public int totalMemoriaDisponibles(int tiempo) {
        int suma = 0;
        for (int i = 0; i < aMaquina; i++) {
            if (listaMaquinas[i].getTiempoInicio() <= tiempo) {
                suma += listaMaquinas[i].getUnidadesMemoriaDisponible();
            }
        }
        return suma;
    }

    public boolean hayEspacioMen(int canRequerida) {
        return totalMemoriaDisponibles() >= canRequerida;
    }

    public boolean hayEspacioMen(int canRequerida, int tiempo) {
        return totalMemoriaDisponibles(tiempo) >= canRequerida;
    }

}