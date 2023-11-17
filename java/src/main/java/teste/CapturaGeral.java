package teste;

import dao.Conexao;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.time.format.DateTimeFormatter;
import java.util.List;

public class CapturaGeral {
    private String nome;
    private Double capacidade;
    private Double valor;
    private String dtCaptura;

    Conexao conexao = new Conexao();
    JdbcTemplate con = conexao.getConexaoDoBanco();



    public CapturaGeral() {
        this.nome = nome;
        this.capacidade = capacidade;
        this.valor = valor;
        this.dtCaptura = dtCaptura;
    }

    public List<teste.CapturaGeral> exibir(){
        // SEMPRE FAZER ESSE BLOCO DE CODIGO PARA PRINTAR NA TELA E GUARDAR NO VETOR "personagensDoBanco"
        List<teste.CapturaGeral> capturaDoBanco = con.query("SELECT hardware.nome, capacidade,valor, dtCaptura FROM tipoHardware JOIN hardware ON idTipoHardware = fkTipoHardware JOIN componente ON fkHardware = idHardware \n" +
                "JOIN captura ON fkComponente = idComponente WHERE idCaptura = (SELECT MAX(idCaptura) FROM captura);", new BeanPropertyRowMapper<>(teste.CapturaGeral.class));
        System.out.println(capturaDoBanco);
        return capturaDoBanco;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(Double capacidade) {
        this.capacidade = capacidade;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }


    public String getDtCaptura() {
        return dtCaptura;
    }

    public void setDtCaptura(String dtCaptura) {
        this.dtCaptura = dtCaptura;
    }

    @Override
    public String toString() {

        return String.format("""
                Nome do Componente: %s
                Capacidade Total: %.2f
                Valor Captura: %.2f
                Data: %s
                """,nome,capacidade,valor,dtCaptura);
    }
}
