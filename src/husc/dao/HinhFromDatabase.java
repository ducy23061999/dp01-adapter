package husc.dao;

import java.util.List;

import husc.dp.Circle;

public class HinhFromDatabase implements IDataSource{
	
	private String filePath;

	public HinhFromDatabase() {
		// TODO Auto-generated constructor stub
	}
	
	public HinhFromDatabase(String file) {
		// TODO Auto-generated constructor stub
		this.filePath = file;
		
	}
	@Override
	public List<Circle> getCircles() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
