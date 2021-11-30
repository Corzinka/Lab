package lb;
import java.util.Scanner;
public class Class1 extends Abstr{
	protected float dlina,visota,shirina,cena;
	Scanner console = new Scanner(System.in);
	public Class1(String name, float dlina, float visota, float shirina, float cena) {
		super(name);
		this.dlina = dlina;
		this.visota = visota;
		this.shirina = shirina;
		this.cena = cena;
	}
	Class1() {
		this.name = "null";
		this.dlina = 0;
		this.visota = 0;
		this.shirina = 0;
		this.cena = 0;
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
	}
	@Override
	public void PrintOut() {
		System.out.println("Имя: " + name);
		System.out.println("Длина: " + dlina);
		System.out.println("Высота: " + visota);
		System.out.println("Ширина: " + shirina);
		System.out.println("Цена: " + cena);
	}
}
