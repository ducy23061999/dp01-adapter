package husc.dp.adapters;

import husc.dp.Circle;
import husc.dp.useful_classes.HinhVuong;

public class HinhVuongAdapter extends Circle{
	private HinhVuong hinhVuong;
	
	public HinhVuongAdapter(Double inputNumber) {
		// TODO Auto-generated constructor stub
		super(inputNumber);
		this.hinhVuong = new HinhVuong(inputNumber);
	}
	
	@Override
	public boolean isFit(double r) {
		// TODO Auto-generated method stub
		return super.isFit(r);
	}
}
