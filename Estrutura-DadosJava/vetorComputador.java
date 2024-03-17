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
        for (int cont = 0; cont <= vetComputadors.length; cont++) {
            if (vetComputadors[cont].getId() == id) {
                return vetComputadors[cont];
            } else {
                System.out.println("Nenhuma instância encontrada com esse ID");

            }
        }
        return null;
    }

    public void ordenarOrdemAlbabetica() {
        for (int i = 0; i <  1; i++) {
            for (int j = i + 1; i < 1; j++) {
                if(vetComputadors[i].getProcessador().compareToIgnoreCase(vetComputadors[j].getProcessador()) > 0){
                    System.out.println(vetComputadors[i]);
                    Computador aux = vetComputadors[i];
                    vetComputadors[i] = vetComputadors[j];
                    vetComputadors[j] = aux; 

                }
            }
        }

    }
}
