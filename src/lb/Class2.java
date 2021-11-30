package lb;

public class Class2 extends Class1{
	protected String izmvel;
	protected float min,max,pog;
	public Class2(String name, float dlina, float visota, float shirina, float cena, String izmvel, float min,
			float max, float pog) {
		super(name, dlina, visota, shirina, cena);
		this.izmvel = izmvel;
		this.min = min;
		this.max = max;
		this.pog = pog;
	}
	Class2() {
		this.name = "null";
		this.dlina = 0;
		this.visota = 0;
		this.shirina = 0;
		this.cena = 0;
		this.izmvel = "null";
		this.min = 0;
		this.max = 0;
		this.pog = 0;
	}
	@Override
	public void PrintIn() {
		System.out.println("���: ");
		name = console.nextLine();
		System.out.println("�����: ");
		dlina = console.nextFloat();
		System.out.println("������: ");
		visota = console.nextFloat();
		System.out.println("������: ");
		shirina = console.nextFloat();
		System.out.println("����: ");
		cena = console.nextFloat();
		System.out.println("���.��������: ");
		izmvel = console.next();
		System.out.println("���.: ");
		min = console.nextFloat();
		System.out.println("����.: ");
		max = console.nextFloat();
		System.out.println("����.: ");
		pog = console.nextFloat();
	}
	@Override
	public void PrintOut() {
		System.out.println("���: " + name);
		System.out.println("�����: " + dlina);
		System.out.println("������: " + visota);
		System.out.println("������: " + shirina);
		System.out.println("����: " + cena);
		System.out.println("���.��������: " + izmvel);
		System.out.println("���.: " + min);
		System.out.println("����.: " + max);
		System.out.println("����.: " + pog);
	}
}
