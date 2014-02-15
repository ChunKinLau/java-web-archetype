package edu.zju.bme.service;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;
import edu.zju.bme.model.ModelEntity;

@WebService
public interface Persistence {

	@WebMethod
	int insert(ModelEntity me);

	@WebMethod
	int delete(String hql);

	@WebMethod
	List<ModelEntity> select(String hql);

}
