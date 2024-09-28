package br.com.moreira;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import java.util.Arrays;

public class TestJunitTest {

    private List<Convidados> criarConvidados() {
        return Arrays.asList(
                new Convidados("Ana", "Feminino"),
                new Convidados("Beatriz", "Feminino"),
                new Convidados("Daiane", "Feminino"),
                new Convidados("Nathalia", "Feminino"),
                new Convidados("Danilo", "Masculino"),
                new Convidados("Bruno", "Masculino")
        );
    }

    @Test
    public void testFiltroFeminino() {
        List<Convidados> convidados = criarConvidados();
        List<Convidados> convidadosFemininos = Convidados.FiltroFeminino(convidados);

        assertTrue(convidadosFemininos.stream().allMatch(c -> c.getSexo().equalsIgnoreCase("Feminino")));

    }
}
