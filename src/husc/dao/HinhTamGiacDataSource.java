package husc.dao;

import java.util.List;

import husc.dp.Circle;

public class HinhTamGiacDataSource implements IDataSource{

	private String filePath;
	public HinhTamGiacDataSource() {
		// TODO Auto-generated constructor stub
	}
	
	public HinhTamGiacDataSource(String file) {
		this.filePath = file;
	}
	
	@Override
	public List<Circle> getCircles() {
		// TODO Auto-generated method stub
		return null;
	}

}
