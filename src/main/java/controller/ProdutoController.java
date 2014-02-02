package controller;

import javax.inject.Inject;
import javax.ws.rs.Path;

import services.ProdutoService;
import domain.Produto;

@Path("/produto")
public class ProdutoController extends ControllerBase<Produto> {

	public ProdutoController() {
		// Apenas para satisfazer as dependencias do CDI
	}
	
	@Inject
	public ProdutoController(ProdutoService service) {
		super.service = service;
	}

}
