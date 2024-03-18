import java.util.Arrays;

public class vetorComputador {
    private Computador[] vetComputadors = new Computador[3];
    private static int contador = 0;

    public vetorComputador() {

    }

    public vetorComputador(Computador[] lComputadors) {
        this.vetComputadors = vetComputadors;

    }

    public void adicionarComputador(Computador computador) {
        this.vetComputadors = novoVetComputador();
        this.vetComputadors[contador++] = computador;
    }

    public void mostrarComputadores() {
        for (int i = 0; i < contador; i++) {
            System.out.println(vetComputadors[i]);
        }
    }

    public Computador[] novoVetComputador() {
        Computador[] novoVetComputadors = new Computador[vetComputadors.length + 2];
        for (int cont = 0; cont < vetComputadors.length; cont++) {
            novoVetComputadors[cont] = vetComputadors[cont];

        }
        return novoVetComputadors;
    }

    public void atualizar(long id, Computador novComputador) {
        for (int cont = 0; cont <= vetComputadors.length; cont++) {
            if (vetComputadors[cont].getId() == id) {
                vetComputadors[cont] = novComputador;
                break;
            }
        }
    }

    public Computador pesquisarPorId(long id) {
        Computador comp = null;
        for (int cont = 0; cont <= vetComputadors.length; cont++) {
            if (vetComputadors[cont].getId() == id) {
                comp = vetComputadors[cont];
                return comp;
            }
        }
        return comp;
    }

    public void ordenarOrdemAlbabetica() {
        for (int i = 0; i <= vetorComputador.contador; i++) {

            for (int j = i + 1; j <= vetorComputador.contador; j++) {
                if (this.vetComputadors[i] != null && this.vetComputadors[j] != null) {
                    String processadorI = this.vetComputadors[i].getProcessador();
                    String processadorJ = this.vetComputadors[j].getProcessador();
                    if (processadorI.compareToIgnoreCase(processadorJ) > 0) {
                        Computador aux = vetComputadors[i];
                        vetComputadors[i] = vetComputadors[j];
                        vetComputadors[j] = aux;
                    }
                }
            }
        }

    }
}
