package lb;
public abstract class Abstr implements Inter2{
	protected String name;
	public Abstr(String name) {
		super();
		this.name = name;
	}
	Abstr(){
		this.name = "null";
	}
}
