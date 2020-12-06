package husc.dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import husc.dp.Circle;
import husc.dp.adapters.DaGiacAdapter;
import husc.dp.useful_classes.Point;

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
		List<Circle> result = new ArrayList<Circle>();
		File file = new File(this.filePath);
		try (Scanner sc = new Scanner(file)){
			while(sc.hasNext()) {
				String str = sc.nextLine();
				if(str == null || str.isEmpty()) break;
				String[] data = str.split("[|]");
				if(data.length > 0) {
					List<Point> points = new ArrayList<Point>(); // 1 dòng dữ liệu gồm nhiều điểm
					for (String i : data) {
						String[] p = i.split("[ ]");
						if(p.length == 2) {
							//System.out.print(p[0] + " " + p[1] + "|");
							points.add(new Point(Double.parseDouble(p[0]), Double.parseDouble(p[1])));
						}
					}
					result.add(new DaGiacAdapter(points));
				}
			//	System.out.println(); // xuống dòng
			}
			
			
			sc.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}


}
