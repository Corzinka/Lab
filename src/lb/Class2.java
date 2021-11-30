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
		System.out.println("Имя: ");
		name = console.nextLine();
		System.out.println("Длина: ");
		dlina = console.nextFloat();
		System.out.println("Высота: ");
		visota = console.nextFloat();
		System.out.println("Ширина: ");
		shirina = console.nextFloat();
		System.out.println("Цена: ");
		cena = console.nextFloat();
		System.out.println("Изм.величина: ");
		izmvel = console.next();
		System.out.println("Мин.: ");
		min = console.nextFloat();
		System.out.println("Макс.: ");
		max = console.nextFloat();
		System.out.println("Погр.: ");
		pog = console.nextFloat();
	}
	@Override
	public void PrintOut() {
		System.out.println("Имя: " + name);
		System.out.println("Длина: " + dlina);
		System.out.println("Высота: " + visota);
		System.out.println("Ширина: " + shirina);
		System.out.println("Цена: " + cena);
		System.out.println("Изм.величина: " + izmvel);
		System.out.println("Мин.: " + min);
		System.out.println("Макс.: " + max);
		System.out.println("Погр.: " + pog);
	}
}
