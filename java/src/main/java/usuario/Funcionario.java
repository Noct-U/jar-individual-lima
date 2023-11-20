package usuario;

import aplicacao.Captura;
import dao.DaoMySQL;

import java.util.List;

public class Funcionario {
    protected Integer idUsuario;
    protected String nome;
    protected String email;
    protected String senha;
    protected Integer fkTipoUsuario;
    protected Integer fkEmpresaLocadora;
    protected Integer fkEmpresa;
    protected Integer fkStatus;

    public Funcionario() {
    }

    public Funcionario(Integer idUsuario,String nome, String email, String senha, Integer fkTipoUsuario, Integer fkEmpresaLocadora, Integer fkEmpresa, Integer fkStatus) {
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.fkTipoUsuario = fkTipoUsuario;
        this.fkEmpresaLocadora = fkEmpresaLocadora;
        this.fkEmpresa = fkEmpresa;
        this.fkStatus = fkStatus;
    }

    public void visualizarCPU() {
        DaoMySQL dao = new DaoMySQL();
        List<Captura> capturas = dao.exibirCapturasDeUmTipo(1);

        System.out.println("TIPO | Valor | Data da captura");
        for (Captura c : capturas) {
            System.out.println("CPU    %.2f    %s".formatted(c.getValor(), c.getDtCaptura()));
        }
    }

    public void visualizarRAM() {
        DaoMySQL dao = new DaoMySQL();
        List<Captura> capturas = dao.exibirCapturasDeUmTipo(2);
        System.out.println("TIPO | Valor | Data da captura");
        for (Captura c : capturas) {
            System.out.println("RAM    %.2f    %s".formatted(c.getValor(), c.getDtCaptura()));
        }
    }

    public void visualizarDisco() {
        DaoMySQL dao = new DaoMySQL();
        List<Captura> capturas = dao.exibirCapturasDeUmTipo(3);
        System.out.println("TIPO | Valor | Data da captura");
        for (Captura c : capturas) {
            System.out.println("DIS    %.2f    %s".formatted(c.getValor(), c.getDtCaptura()));
        }
    }

    public void visualizarJanelas() {
        DaoMySQL dao = new DaoMySQL();
        List<Captura> capturas = dao.exibirCapturasDeUmTipo(4);
        System.out.println("TIPO | Valor | Data da captura");
        for (Captura c : capturas) {
            System.out.println("JAN    %.2f    %s".formatted(c.getValor(), c.getDtCaptura()));
        }
    }

    public void visualizarCapturas() {
        DaoMySQL dao = new DaoMySQL();
        List<Captura> capturas = dao.exibirTodasCapturas();
        System.out.println(capturas);
    }

    public void updateUser(String email,String senha, Integer isUsuario){
        DaoMySQL dao = new DaoMySQL();
        dao.updateUser(email,senha, idUsuario);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Integer getFkTipoUsuario() {
        return fkTipoUsuario;
    }

    public void setFkTipoUsuario(Integer fkTipoUsuario) {
        this.fkTipoUsuario = fkTipoUsuario;
    }

    public Integer getFkEmpresaLocadora() {
        return fkEmpresaLocadora;
    }

    public void setFkEmpresaLocadora(Integer fkEmpresaLocadora) {
        this.fkEmpresaLocadora = fkEmpresaLocadora;
    }

    public Integer getFkEmpresa() {
        return fkEmpresa;
    }

    public void setFkEmpresa(Integer fkEmpresa) {
        this.fkEmpresa = fkEmpresa;
    }

    public Integer getFkStatus() {
        return fkStatus;
    }

    public void setFkStatus(Integer fkStatus) {
        this.fkStatus = fkStatus;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public String toString() {
        return """
                \nnome: %s
                email: %s
                senha: %s
                fkTipoUsuario: %d
                fkEmpresaLocadora: %d
                fkEmpresa: %d
                fkStatus: %d""".formatted(nome, email, senha, fkTipoUsuario, fkEmpresaLocadora, fkEmpresa, fkStatus);
    }
}
