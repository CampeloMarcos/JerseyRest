package services;

import java.util.List;

import javax.enterprise.context.Dependent;

import dao.BaseDAO;
import domain.EntityBase;

@Dependent
@SuppressWarnings({"unchecked", "rawtypes"})
public abstract class ApplicationServiceImpl<T extends EntityBase> implements ApplicationServiceBase<T> {

	public T getById(Integer id){
		return (T) getDao().getById(id);
	}


	public List<T> listAll() {
		return getDao().listAll();
	}

	@Override
	public String create(T t) {
		validateBeforeCreate();
		getDao().create(t);
		return "sucesso";
	}

	public void validateBeforeCreate() {
		
	}


	@Override
	public String update(T t) {
		getDao().update(t);
		return "sucesso";
	}

	@Override
	public void remove(T t) {
		getDao().delete(t);
		
	}
	
	public abstract BaseDAO getDao();
	
}
