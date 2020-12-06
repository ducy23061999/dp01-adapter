package husc.dp.adapters;

import husc.dp.Circle;
import husc.dp.useful_classes.HinhVuong;

public class HinhVuongAdapter extends Circle{
	private HinhVuong hinhVuong;
	
	public HinhVuongAdapter(int canh) {
		// TODO Auto-generated constructor stub
		super(canh);
		this.hinhVuong = new HinhVuong(canh);
	}
	
	@Override
	public boolean isFit(double r) {
		// TODO Auto-generated method stub
		return super.isFit(r);
	}
}
