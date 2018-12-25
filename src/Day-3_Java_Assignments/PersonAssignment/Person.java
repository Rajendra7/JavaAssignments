import java.time.LocalDate;
import java.time.Month;
import java.util.*;
public class Person {
	private String name;
	private Date dob;
	private int date;
	private int month;
	private int year;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public Person(String name, int date, int month, int year)
	{
		this.name=name;
		this.date=date;
		this.month=month;
		this.year=year;
	}
	
	public Person() {
	}
	public void display()
	{	
		LocalDate localdate = LocalDate.of(2018,12,18);
		int date1=localdate.getDayOfMonth();
		int month1 =localdate.getMonthValue();
		int year1=localdate.getYear();
		int diffDays,diffMonths,diffYears;
		if(getDate()>date1){
			diffDays=getDate()-date1;
		}
		else{
			diffDays=date1-getDate();
		}
		if(getMonth()>month1){
			diffMonths=getMonth()-month1;
		}
		else{
			diffMonths=month1-getMonth();
		}
		if(getYear()>year1){
			diffYears=getYear()-year1;
		}
		else{
			diffYears=year1-getYear();
		}
		
		String name = getName();
		String dateOfBirth = date+"/"+month+"/"+year;
		String age = diffYears+" Years "+diffMonths+" Months "+diffDays+" Days ";
	}
	public String olderOne(Person person,Person person1){
		int personDateDifference = 0,personMonthDifference=0,personYearDifference=0;
		if(person.getDate()>person1.getDate()){
			personDateDifference=person.getDate()-person1.getDate();
		}
		else{
			personDateDifference=person1.getDate()-person.getDate();
		}
		if(person.getMonth()>person1.getMonth()){
			personMonthDifference= person.getMonth()-person1.getMonth();
		}
		else{
			personMonthDifference=person1.getMonth()-person.getMonth();
		}
		if(person.getYear()>person1.getYear()){
			personYearDifference=person.getYear()-person1.getYear();
		}
		else{
			personYearDifference=person1.getYear()-person.getYear();
		}
		if((personDateDifference>0)||(personMonthDifference>0)||(personYearDifference>0)){
			System.out.println(person.name+" is older than " +person1.name+" by "+personYearDifference+" years ,"+personMonthDifference+" months, and "+personDateDifference+"days");
			return person.name+" is older than " +person1.name+" by "+personYearDifference+" years ,"+personMonthDifference+" months, and "+personDateDifference+"days";
		}
		else{
			System.out.println(person1.name+" is older than " +person.name+" by "+personYearDifference+" years ,"+personMonthDifference+" months, and "+personDateDifference+"days");
			return person1.name+" is older than " +person.name+" by "+personYearDifference+" years ,"+personMonthDifference+" months, and "+personDateDifference+"days";
		}
	}
}