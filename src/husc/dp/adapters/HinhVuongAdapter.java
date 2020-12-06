package husc.dp.adapters;

import husc.dp.Circle;
import husc.dp.useful_classes.HinhVuong;

public class HinhVuongAdapter extends Circle{
	private HinhVuong hinhVuong;
	

	public HinhVuongAdapter(double canh) {
		// TODO Auto-generated constructor stub
		super(canh);
		this.hinhVuong = new HinhVuong(canh);
	}
	
	@Override
	public boolean isFit(double r) {
		double banKinh = this.hinhVuong.getCanh() / Math.sqrt(2);
		
		return banKinh <= r;
	}
}
