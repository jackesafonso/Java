package JPARelationshipsDemo;

import java.util.List;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("EmployeePersistence");
		
		TopicDAO tDao = new TopicDAO(factory);
		List<Topic> topicList = tDao.getAllTopic();
		System.out.println("Please select a topic from the below list");
		for(Topic t : topicList){
			System.out.println(t.getName());
		}
		factory.close();
		
		
	}

}
