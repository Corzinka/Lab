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
	}
	@Override
	public void PrintOut() {
		System.out.println("���: " + name);
		System.out.println("�����: " + dlina);
		System.out.println("������: " + visota);
		System.out.println("������: " + shirina);
		System.out.println("����: " + cena);
	}
}
