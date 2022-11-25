package classes;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class Teste {

	@Test
	void test() {
	  
		Locadora locadora = new Locadora();
		
		assertEquals(locadora.getDvds().size(), 0);
		
		locadora.cadastrarDvd(new Dvd("Avatar", new Especificacao("Aventura", 2010, "James Miles", "Ingles")));
		locadora.cadastrarDvd(new Dvd("Eu sou a lenda", new Especificacao("Terror", 2020, "Tom Hnaks", "Ingles")));
		locadora.cadastrarDvd(new Dvd("Tony Halk", new Especificacao("Ação", 2012, "Medina", "Espanhol")));
		
		assertEquals(locadora.getDvds().size(), 3);
		
		Dvd dvdAchado = locadora.buscarPorTitulo("Avatar");
		
		assertEquals(dvdAchado.getEspec().getAno(), 2010);
		
		List<Dvd> dvdAchados = locadora.buscarDvdPorEspecificacao(new Especificacao("Ação", 2012, "Medina", "Espanhol"));
		
		assertEquals(dvdAchados.get(0).getEspec().getGenero(), "Ação");
	}

}
