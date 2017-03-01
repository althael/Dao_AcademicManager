
public class Person {

	public static final int DEFAULT_ID = -1;

	// attributes
	private int personId;
	private String name;
	private String surname;
	private int type;
	private int dateOfBirth;
	private int sex;
	private String email;
	private String phoneNumber;
	private String address;
	private String taxNumber;
	private String bankAccount;
	private String username;
	private String password;

	// Constructor
	public Person() {

		this.personId = DEFAULT_ID;
		this.name = "";
		this.surname = "";
		this.type = 0;
		this.dateOfBirth = 0;
		this.sex = 0;
		this.email = "";
		this.phoneNumber = "";
		this.address = "";
		this.taxNumber = "";
		this.bankAccount = "";
		this.username = "";
		this.password = "";
	}

	// Getters and Setters

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(int dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTaxNumber() {
		return taxNumber;
	}

	public void setTaxNumber(String taxNumber) {
		this.taxNumber = taxNumber;
	}

	public String getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;

	public String toString() {
		return "Person[id =  " + id + ", Post Author = " + postAuthor + ", Post Title = " + postTitle + "]";
	}

}
