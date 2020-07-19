package model;

public class User
{
	private String name;
	private String number;
	private int age;
	private int height;
	private int weight;
	private String country;
	
	private String getName() {
        return this.name;
    }
    private void setName(String name) {
        this.name = name;
    }
    private String getNumber() {
        return this.number;
    }
    private void setNumber(String number) {
        this.number = number;
    }
    private int getage() {
        return this.age;
    }
    private void setage(int age) {
        this.age = age;
    }
    private int getheight() {
        return this.height;
    }
    private void setheight(int height) {
        this.height = height;
    }
    private int getweight() {
        return this.weight;
    }
    private void setweight(int weight) {
        this.weight = weight;
    }
    private String getcountry() {
        return this.country;
    }
    private void setcountry(String country) {
        this.country = country;
    }
	
	public User (String name, String number, int age, int height, int weight, String country) {
		this.name=name;
		this.number=number;
		this.age=age;
		this.height=height;
		this.weight=weight;
		this.country=country;
	}

}
