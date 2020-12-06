package husc.dp.adapters;

import husc.dp.Circle;
import husc.dp.useful_classes.TamGiac;

public class TamGiacAdapter extends Circle{
	private TamGiac tamGiac;
	
	public TamGiacAdapter(double a, double b, double c) {
		super(a);
		this.tamGiac = new TamGiac(a, b, c);
	}
	
	@Override
	public boolean isFit(double r) {
		double a = this.tamGiac.getA();
		double b = this.tamGiac.getB();
		double c = this.tamGiac.getC();
		
		double nuaChuVi = (a + b + c ) / 2;
		double dienTichTamGiac = Math.sqrt(nuaChuVi * (nuaChuVi - b) * (nuaChuVi - b) * (nuaChuVi - c));
		
		double banKinh = (a * b * c) / (4 * dienTichTamGiac);
		
		return banKinh <= r;
	}
}
