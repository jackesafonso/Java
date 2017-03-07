package JPARelationshipsDemo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="JPA_QUESTIONS")
public class Questions {
	
	@Id
	private int id;
	@Column
	private String questionText;
	@Column
	private int marks;
	@ManyToOne(cascade=CascadeType.MERGE, fetch=FetchType.EAGER)
	private Topic topic;
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	@JoinTable(name="JPA_Q_OPTIONS")
	private List<MultipleChoice> multipleChoiceOptions;
	
	

	public Questions(){
		super();
	}
	
	
	public Questions(int id, String questionText, int marks) {
		super();
		this.id = id;
		this.questionText = questionText;
		this.marks = marks;
		
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getQuestionText() {
		return questionText;
	}


	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}


	public int getMarks() {
		return marks;
	}


	public void setMarks(int marks) {
		this.marks = marks;
	}


	public Topic getTopic() {
		return topic;
	}


	public void setTopic(Topic topic) {
		this.topic = topic;
	}


	public List<MultipleChoice> getMultipleChoiceOptions() {
		return multipleChoiceOptions;
	}


	public void setMultipleChoiceOptions(List<MultipleChoice> multipleChoiceOptions) {
		this.multipleChoiceOptions = multipleChoiceOptions;
	}
	

}
