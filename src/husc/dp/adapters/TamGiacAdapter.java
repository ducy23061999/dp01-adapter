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
		// TODO Auto-generated method stub
		return super.isFit(r);
	}
}
