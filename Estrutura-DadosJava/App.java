public class App {
    public static void main(String[] args) {
        vetorComputador listaComputador = new vetorComputador();
        listaComputador.adicionarComputador(new Computador("Ryzen 5 4600G","16 RAM", "700GB"));
        listaComputador.adicionarComputador(new Computador("INTEL I9 9900K","8 RAM", "2TB"));
        listaComputador.adicionarComputador(new Computador("INTEL CELERON","12 RAM", "4TB"));
        listaComputador.adicionarComputador(new Computador(" I5 10400F","32 RAM", "3TB"));
        listaComputador.mostrarComputadores();
        listaComputador.atualizar(0, new Computador("RYZEN 9 5950X", "teste", "teste"));
        listaComputador.mostrarComputadores();
    }
}
