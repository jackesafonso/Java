package JPARelationshipsDemo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;


public class TopicDAO {
	
	private EntityManagerFactory factory;
	
	public TopicDAO(EntityManagerFactory factory){
		super();
		this.factory =  factory;
	}
	
	public List<Topic> getAllTopic(){
		EntityManager manager = factory.createEntityManager();
		TypedQuery<Topic> query = manager.createQuery("select t from Topic t ", Topic.class);
		List<Topic> topicsList = query.getResultList();
		manager.close();
		return topicsList;
	}

}
