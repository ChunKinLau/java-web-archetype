package edu.zju.bme.dao;

import java.util.List;
import java.util.Map;
import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;

import edu.zju.bme.model.ModelEntity;

@Component("PersistenceDao")
public class PersistenceDaoImpl implements PersistenceDao {

	private Logger logger = Logger.getLogger(PersistenceDaoImpl.class.getName());

	@Resource(name="sessionFactory")
	private SessionFactory sessionFactory;

    @Override
	public int insert(ModelEntity me) {

		logger.info("insert");

		try {

			Session s = sessionFactory.getCurrentSession();
			s.save(me);
			
		} catch (Exception e) {
			logger.error(e);
			return -2;
		}

		return 0;

	}
    
    @Override
	public int delete(String hql) {

		return delete(hql, null);

	}

	public int delete(String hql, Map<String, Object> parameters) {

		return executeUpdate(hql, parameters);

	}

	protected int executeUpdate(String hql, Map<String, Object> parameters) {

		logger.info("executeUpdate");

		logger.info(hql);

		try {

			Session s = sessionFactory.getCurrentSession();

			Query q = s.createQuery(hql);
			passParameters(q, parameters);
			int ret = q.executeUpdate();

			logger.info(ret);

			return ret;
		} catch (Exception e) {
			logger.error(e);
			return -2;
		}

	}
    
    @Override
    public List<ModelEntity> select(String hql) {

		logger.info("select");

		try {
			
			String queryString = "from CoarseNodePathEntity as c where c.objectUid in :objectUid";

			Session s = sessionFactory.getCurrentSession();			
			Query q = s.createQuery(queryString);
			@SuppressWarnings("unchecked")
			List<ModelEntity> l = q.list();		
			
			return l;
			
		} catch (Exception e) {
			logger.error(e);
			return null;
		}
    	
    }

	protected void passParameters(Query q, Map<String, Object> parameters) {

		if (parameters != null) {
			for (String paraName : parameters.keySet()) {
				q.setParameter(paraName, parameters.get(paraName));
			}
		}

	}

}
