package edu.zju.bme.service;

import java.util.List;

import javax.annotation.Resource;
import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import edu.zju.bme.dao.PersistenceDao;
import edu.zju.bme.model.ModelEntity;

@WebService(endpointInterface = "edu.zju.bme.service.Persistence")
@BindingType(value = SOAPBinding.SOAP12HTTP_BINDING)
@Component("Persistence")
@Transactional
public class PersistenceImpl implements Persistence {

	@Resource(name="PersistenceDao")
	private PersistenceDao persistenceDao;

	@Override
	public int insert(ModelEntity me) {
		
		return persistenceDao.insert(me);

	}

	@Override
	public int delete(String hql) {
		
		return persistenceDao.delete(hql);

	}

	@Override
	public List<ModelEntity> select(String hql) {
		
		return persistenceDao.select(hql);

	}

}
