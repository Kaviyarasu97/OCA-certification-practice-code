package CourseModel;

public class Course {

	
		public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getDuration() {
		return Duration;
	}
	public void setDuration(int duration) {
		Duration = duration;
	}
	public String getActive() {
		return Active;
	}
	public void setActive(String active) {
		Active = active;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
		@Override
	public String toString() {
		return "Course [Id=" + Id + ", Name=" + Name + ", Duration=" + Duration + ", Active=" + Active + ", content="
				+ content + "]";
	}
		int Id;
		String Name;
		int Duration;
		String Active;
		String content;

	}


