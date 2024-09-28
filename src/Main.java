package br.com.moreira;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Convidados> convidados = Arrays.asList(
                new Convidados("Ana", "Feminino"),
                new Convidados("Beatriz", "Feminino"),
                new Convidados("Daiane", "Feminino"),
                new Convidados("Nathalia", "Feminino"),
                new Convidados("Danilo", "Masculino"),
                new Convidados("Bruno", "Masculino")
        );
        List<Convidados> convidadosFemininos = Convidados.FiltroFeminino(convidados);

        convidadosFemininos.forEach(convidado -> System.out.println(convidado.getNome() + " é feminino"));
    }
}