package husc.dao;

import java.util.ArrayList;
import java.util.List;

import husc.dp.Circle;



public class HinhTronDataSource implements IDataSource{

	private String filePath;
	public HinhTronDataSource() {
		// TODO Auto-generated constructor stub
	}
	
	public HinhTronDataSource(String file) {
		// TODO Auto-generated constructor stub
		this.filePath = file;
	}
	
	@Override
	public List<Circle> getCircles() {
		// TODO Auto-generated method stub
		List<Circle> circles = new ArrayList<Circle>();
		
		circles.add(new Circle(3));
		circles.add(new Circle(4));
		circles.add(new Circle(5));
		circles.add(new Circle(6));
		circles.add(new Circle(7));
		return circles;
	}

}
