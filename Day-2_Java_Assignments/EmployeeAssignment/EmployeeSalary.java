
public class EmployeeSalary 
{
	private int Id;
	private String name;
	private double MonthlyBasic;
	
	
	public EmployeeSalary(int id, String name, double monthlyBasic) {
		super();
		this.Id = id;
		this.name = name;
		this.MonthlyBasic = monthlyBasic;
		
		
	}
	
	public double getHra() {
		double hra;
		hra=getMonthlyBasic()/2;
		return hra;
	}


	public double getMedical() {
		double medical=1250;
		return medical;
	}


	public double getConveyance() {
		double conveyance=800;
		return conveyance;
	}
	
	
	public double getESIC() {
		double ESIC=0;
		if(getMonthlyBasic()<=5000)
		ESIC=getMonthlyBasic()/(4.75/100);
		return ESIC;
		
	}
	public double getprofessionalTax() {
		double professionalTax=0;
		if(getMonthlyBasic()<=10000)
			professionalTax=50;
		else
			professionalTax=100;
		return professionalTax;
	}
	public double getpfRate() {
		double pfRate=0;
		pfRate=getMonthlyBasic()*0.1;
		if(pfRate>=6500)
			return pfRate;
		else
			return 6500;
	}
	


	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMonthlyBasic() {
		return MonthlyBasic;
	}

	public void setMonthlyBasic(double monthlyBasic) {
		MonthlyBasic = monthlyBasic;
	}

	public double getAnnualBasic() {
		 double AnnualBasic =0;
		AnnualBasic = 12*getMonthlyBasic() ;
		//System.out.println(AnnualBasic);
		return AnnualBasic;
	}
	public double getMonthlyGrossSalary() {
		 double MonthlyGrossSalary =0;
		 MonthlyGrossSalary=getMonthlyBasic()+getHra()+getMedical()+getConveyance();
		return MonthlyGrossSalary;
	}
	public double getAnnualGrossSalary() {
		 double AnnualGrossSalary =0;
		 AnnualGrossSalary=12*getMonthlyGrossSalary();
		return AnnualGrossSalary;
	}
	public double getMonthlyDeductions() {
		 double MonthlyDeductions =0;
		 MonthlyDeductions=getpfRate()+getESIC()+getprofessionalTax();
		return MonthlyDeductions;
	}
	public double getMonthlyTakeHome() {
		 double MonthlyTakeHome =0;
		 MonthlyTakeHome=getMonthlyGrossSalary()-getMonthlyDeductions();
		return MonthlyTakeHome;
	}
	public double getAnnualTakeHome() {
		 double AnnualTakeHome =0;
		 AnnualTakeHome=12* getMonthlyTakeHome();
		return AnnualTakeHome;
	}
	
}
