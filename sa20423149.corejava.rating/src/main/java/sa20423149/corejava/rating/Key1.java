package sa20423149.corejava.rating;

public class Key1 {
	String studentName;
	String subject;
	String assignmentCategory;
	
	public Key1(String studentName, String subject, String assignmentCategory) {
		this.studentName = studentName;
		this.subject = subject;
		this.assignmentCategory = assignmentCategory;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + ((assignmentCategory == null) ? 0 : assignmentCategory.hashCode());
		result = prime * result + ((studentName == null) ? 0 : studentName.hashCode());
		result = prime * result + ((subject == null) ? 0 : subject.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Key1 other = (Key1) obj;
		if (assignmentCategory == null) {
			if (other.assignmentCategory != null)
				return false;
		} else if (!assignmentCategory.equals(other.assignmentCategory))
			return false;
		if (studentName == null) {
			if (other.studentName != null)
				return false;
		} else if (!studentName.equals(other.studentName))
			return false;
		if (subject == null) {
			if (other.subject != null)
				return false;
		} else if (!subject.equals(other.subject))
			return false;
		return true;
	}
}