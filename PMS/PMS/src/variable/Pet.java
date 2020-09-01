package variable;

import java.util.ArrayList;

public class Pet {
	private static String id;
	private static String pw;
	private String type;
	private String petName;
	private int age;
	private String gender;
	private String owner;
	
	private static ArrayList<ArrayList<String>> arrList = new ArrayList<>();
	
	public static ArrayList<ArrayList<String>> getArrList() {
		return arrList;
	}
	public static void setArrList(ArrayList<ArrayList<String>> arrList) {
		Pet.arrList = arrList;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPetName() {
		return petName;
	}
	public void setPetName(String petName) {
		this.petName = petName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public static String getId() {
		return id;
	}
	public static void setId(String id) {
		Pet.id = id;
	}
	public static String getPw() {
		return pw;
	}
	public static void setPw(String pw) {
		Pet.pw = pw;
	}
}
