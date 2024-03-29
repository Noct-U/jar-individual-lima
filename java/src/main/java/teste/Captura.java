package teste;

public class Captura {
    private Double valor;
    private String descricao;
    private String dtCaptura;
    private Integer fkComputador;
    private Integer fkHardware;
    private Integer fkComponente;
    private String carregamento = "=";

    public Captura() {
    }

    public Captura(Double valor, String dtCaptura, Integer fkComputador, Integer fkHardware, Integer fkComponente) {
        this.valor = valor;
        this.descricao = null;
        this.dtCaptura = dtCaptura;
        this.fkComputador = fkComputador;
        this.fkHardware = fkHardware;
        this.fkComponente = fkComponente;
    }

    public Captura(Double valor, String descricao, String dtCaptura, Integer fkComputador, Integer fkHardware, Integer fkComponente) {
        this.valor = valor;
        this.descricao = descricao;
        this.dtCaptura = dtCaptura;
        this.fkComputador = fkComputador;
        this.fkHardware = fkHardware;
        this.fkComponente = fkComponente;
    }

    public void carregamento(){
        this.carregamento = this.carregamento = "=";
        System.out.println(this.carregamento);
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDtCaptura() {
        return dtCaptura;
    }

    public void setDtCaptura(String dtCaptura) {
        this.dtCaptura = dtCaptura;
    }

    public Integer getFkComputador() {
        return fkComputador;
    }

    public void setFkComputador(Integer fkComputador) {
        this.fkComputador = fkComputador;
    }

    public Integer getFkHardware() {
        return fkHardware;
    }

    public void setFkHardware(Integer fkHardware) {
        this.fkHardware = fkHardware;
    }

    public Integer getFkComponente() {
        return fkComponente;
    }

    public void setFkComponente(Integer fkComponente) {
        this.fkComponente = fkComponente;
    }

//    @Override
//    public String toString() {
//        return "\ncaptura{" +
//                "valor=" + valor +
//                ", descricao='" + descricao + '\'' +
//                ", dtCaptura='" + dtCaptura + '\'' +
//                ", fkComputador=" + fkComputador +
//                ", fkHardware=" + fkHardware +
//                ", fkComponente=" + fkComponente +
//                '}';
//    }
}
