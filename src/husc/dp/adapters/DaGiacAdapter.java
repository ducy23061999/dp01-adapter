package husc.dp.adapters;

import java.util.List;

import husc.dp.Circle;
import husc.dp.useful_classes.DaGiac;
import husc.dp.useful_classes.Point;

public class DaGiacAdapter extends Circle{
	private DaGiac daGiac;
	
	public DaGiacAdapter(List<Point> listPoint) {
		// TODO Auto-generated constructor stub
		super(3);
		this.daGiac = new DaGiac(listPoint);
	}
	
	@Override
	public boolean isFit(double r) {
		// TODO Auto-generated method stub
		return super.isFit(r);
	}
	
	
}
