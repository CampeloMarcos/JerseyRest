package controller;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.commons.lang.StringUtils;

import services.ApplicationServiceBase;
import domain.EntityBase;



@SuppressWarnings({"unchecked","rawtypes"})
public abstract class ControllerBase<T extends EntityBase> {

	protected static final String JSON = MediaType.APPLICATION_JSON;
	protected static final String TEXTO = MediaType.TEXT_PLAIN;
	protected static final String HTML = MediaType.TEXT_HTML;
	
	

	@POST
	@Consumes(JSON)
	@Produces(JSON)
	public String create(T t) {
		getService().create(t);
		return "sucesso";
	}

	@GET
	@Path("/{id}")
	@Produces(JSON)
	public T getById(@PathParam("id") String id) {
		T t = (T) getService().getById(Integer.parseInt(id));
		return t;
	}

	@GET
	@Produces(JSON)
	public List<T> listAll() {
		return getService().listAll();
	}

	@PUT
	@Consumes(JSON)
	@Produces(TEXTO)
	public String update(T t) {
		getService().update(t);
		return "sucesso";
	}

	@DELETE
	@Path("/{id}")
	@Produces(TEXTO)
	public String delete(@PathParam("id") String id) {
		if (StringUtils.isNotEmpty(id)) {
			Integer idd = Integer.parseInt(id);
			T t = (T) getService().getById(idd);
			getService().remove(t);
		}
		return "sucesso";
	}
	
	
	public abstract ApplicationServiceBase getService();

}