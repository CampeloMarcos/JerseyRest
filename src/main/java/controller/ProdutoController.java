package controller;

import javax.inject.Inject;
import javax.ws.rs.Path;

import services.ApplicationServiceBase;
import services.ProdutoService;
import domain.Produto;

@Path("/produto")
@SuppressWarnings({"rawtypes"})
public class ProdutoController extends ControllerBase<Produto> {

	@Inject
	private ProdutoService produtoService;

	@Override
	public ApplicationServiceBase getService() {
		return produtoService;
	}
	
	

}
