package testsSistema;

import static org.junit.Assert.*;
import br.sistemaBar.*;

import org.junit.Test;

public class SistemaBarFacadeTest {

	SistemaBarFacade sbf = new SistemaBarFacade(new GerenciadorDeMesas(), new GerenciadorDeContas(), new GerenciadorDeCardapio(), new GerenciadorDeClientes());
	@Test
	public void testRemovarItemCardapio() {
		try{
		sbf.cadastrarItemCardapio(11, "camarao", 10, 20);
		sbf.removerItemCardapio(11);
		sbf.pesquisarItemCardapio(11);
		assertTrue(false);
		} catch (Exception e) {
			e.getMessage();
		}
	}

}
