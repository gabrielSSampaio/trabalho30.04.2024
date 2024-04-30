
package br.gabrielsp.bimestre2024paulinho.newpackage;


public class Cliente {
    private int id;
    private String nome;
    private String nascimento;
    private String cpf;

    public Cliente(int id, String nome, String nascimento, String cpf) {
        this.id = id;
        this.nome = nome;
        this.nascimento = nascimento;
        this.cpf = cpf;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getNascimento() {
        return nascimento;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        return "Código: " + id +
               ", Nome: " + nome +
               ", Data de Nascimento: " + nascimento +
               ", CPF: " + cpf;
    }
}


