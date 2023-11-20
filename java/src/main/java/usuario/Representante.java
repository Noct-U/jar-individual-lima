package usuario;

import dao.DaoMySQL;

import java.util.Scanner;

public class Representante extends Funcionario {
    public Representante() {
    }

    public Representante(Integer idUsuario,String nome, String email, String senha, Integer fkTipoUsuario, Integer fkEmpresaLocadora, Integer fkEmpresa, Integer fkStatus) {
        super(idUsuario,nome, email, senha, fkTipoUsuario, fkEmpresaLocadora, fkEmpresa, fkStatus);
        this.fkTipoUsuario = 1;
        this.fkEmpresaLocadora = null;
    }

//    public Integer exibirOpcoes() {
//        System.out.println("""
//                1) Ativar computador atual
//                2) Desativar computador atual
//                0) Sair""");
//        Integer resposta = in.nextInt();
//        return resposta;
//    }

    public void atualizarMaquina(Integer opcao) {
        DaoMySQL daoMySQL = new DaoMySQL();
        daoMySQL.atualizarComputador(opcao);
    }

    @Override
    public String toString() {
        return """
                \n%s""".formatted(super.toString());
    }
}
