package husc.dao;

import java.util.List;

import husc.dp.Circle;

public class HinhDaGiacDataSource implements IDataSource{

	private String filePath;
	
	public HinhDaGiacDataSource() {
		// TODO Auto-generated constructor stub
	}
	
	public HinhDaGiacDataSource(String file) {
		// TODO Auto-generated constructor stub
		this.filePath = file;
	}
	
	@Override
	public List<Circle> getCircles() {
		// TODO Auto-generated method stub
		return null;
	}

}
