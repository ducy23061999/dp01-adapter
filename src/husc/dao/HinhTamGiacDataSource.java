package husc.dao;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import husc.dp.Circle;
import husc.dp.adapters.DaGiacAdapter;
import husc.dp.adapters.TamGiacAdapter;
import husc.dp.useful_classes.Point;

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
		List<Circle> result = new ArrayList<Circle>();
		File file = new File(this.filePath);
		try (Scanner sc = new Scanner(file)){
			while(sc.hasNext()) {
				String str = sc.nextLine();
				if(str == null || str.isEmpty()) break;
				String[] data = str.split("[ ]");
				if(data.length > 0) {
					List<Double> points = new ArrayList<Double>(); 
						
						if(data.length == 3) {
							//System.out.println(data[0] + " " + data[1] + " "+data[2]);
							result.add(new TamGiacAdapter( Double.parseDouble(data[0]),  Double.parseDouble(data[1]), Double.parseDouble(data[2])));
						}
					
				}
				//System.out.println(); // xuống dòng
			}
			
			
			sc.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}
