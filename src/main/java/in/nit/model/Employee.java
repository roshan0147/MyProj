package in.nit.model;

public class Employee {
	
	private int id;
	private String name;
	private double sfee;
	private String addr;
	public Employee(int id, String name, double sfee, String addr) {
		super();
		this.id = id;
		this.name = name;
		this.sfee = sfee;
		this.addr = addr;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSfee() {
		return sfee;
	}
	public void setSfee(double sfee) {
		this.sfee = sfee;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sfee=" + sfee + ", addr=" + addr + "]";
	}
	

}
