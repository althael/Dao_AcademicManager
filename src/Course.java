
public class Course {

	// Constants
	public static final int INVALID_ID = -1;

	// Attributes

	private int courseId;
	private String title;
	private int cost;
	private String description;
	private String startingDate;
	private String endingDate;
	private int isActive;

	// constructor
	public Course(){
		this.courseId=INVALID_ID;
		this.title="";
		this.cost=0;
		this.description="";
		this.startingDate="";
		this.endingDate="";
		this.isActive=0;
		
	}

	// Getters and Setters

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;

	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;

	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;

	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStartingDate() {
		return startingDate;
	}

	public void setStartingDate(String startingDate) {
		this.startingDate = startingDate;
	}

	public String getEndingDate() {
		return endingDate;
	}

	public void setEndingDate(String endingDate) {
		this.endingDate = endingDate;
	}

	public int getIsActive() {
		return isActive;
	}

	public void setIsActive(int isActive) {
		this.isActive = isActive;
		
		public String toString() {
			return "Post[id =  " + id + ", Post Author = " + postAuthor + ", Post Title = " + postTitle + "]";
	}

}
