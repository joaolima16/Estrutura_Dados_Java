
public class Computador implements Comparable<Computador> {
    private long id;
    private static long contId;
    private String processador;
    private String memoria;
    private String hd;

    public Computador() {
    }

    public Computador(String processador, String memoria, String hd) {
        this.id = contId++;
        this.processador = processador;
        this.memoria = memoria;
        this.hd = hd;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public String getMemoria() {
        return memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }

    public String getHd() {
        return hd;
    }

    public void setHd(String hd) {
        this.hd = hd;
    }

    @Override
    public int compareTo(Computador o) {
        // TODO Auto-generated method stub
        return this.getProcessador().compareTo(o.getProcessador());
    }

    @Override
    public String toString() {
        return "Computador [id=" + id + ", processador=" + processador + ", memoria=" + memoria + ", hd=" + hd + "]";
    }

}