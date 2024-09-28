package br.com.moreira;

import java.util.List;
import java.util.stream.Collectors;

public class Convidados {
    private String nome;
    private String sexo;

    public Convidados(String nome, String sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public static List<Convidados> FiltroFeminino(List<Convidados> convidadosList) {
        // Filtra a lista para retornar apenas convidados do sexo feminino
        return convidadosList.stream()
                .filter(convidado -> convidado.getSexo().equalsIgnoreCase("Feminino"))
                .collect(Collectors.toList());
    }
}
