package husc.dao;

import java.util.ArrayList;
import java.util.List;

import husc.dp.Circle;
import husc.dp.adapters.HinhVuongAdapter;

public class HinhVuongDataSource implements IDataSource{
	private String filePath;
	
	public HinhVuongDataSource() {
		// TODO Auto-generated constructor stub
	}
	
	public HinhVuongDataSource(String filePath) {
		this.filePath = filePath;
	}

	@Override
	public List<Circle> getCircles() {
		// TODO Auto-generated method stub
		List<Circle> circles = new ArrayList<Circle>();
		
		circles.add(new HinhVuongAdapter(3));
		circles.add(new HinhVuongAdapter(4));
		circles.add(new HinhVuongAdapter(5));
		circles.add(new HinhVuongAdapter(6));
		circles.add(new HinhVuongAdapter(7));
		return null;
	}

}
