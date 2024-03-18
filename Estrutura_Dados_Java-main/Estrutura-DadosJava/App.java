public class App {
    public static void main(String[] args) {
        vetorComputador listaComputador = new vetorComputador();
        
        listaComputador.adicionarComputador(new Computador("Ryzen 5","12 RAM", "4TB"));
        listaComputador.adicionarComputador(new Computador("Intel I9 9900K","8 RAM", "2TB"));
        listaComputador.adicionarComputador(new Computador("Intel Celeron","16 RAM", "700GB"));
        listaComputador.adicionarComputador(new Computador("Ryzen 9 5950x","32 RAM", "3TB"));
       
        listaComputador.mostrarComputadores();

        Computador comp = listaComputador.pesquisarPorId(3);
        System.out.println(comp);

        listaComputador.atualizar(1, new Computador("Teste2", "32 RAM", "6TB"));
       
        listaComputador.ordenarOrdemAlbabetica();
        listaComputador.mostrarComputadores();
    }
}
