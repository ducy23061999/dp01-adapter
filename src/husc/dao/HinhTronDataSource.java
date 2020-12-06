package husc.dao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
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
		
		 FileReader fileReader = null;
		 BufferedReader bufferReader = null;
		 
		 try {
			fileReader = new FileReader(this.filePath);
			bufferReader = new BufferedReader(fileReader);
		  //	ArrayList<Integer> prevNumber = new ArrayList<>();
			while(true) {
					String line = bufferReader.readLine();
					if (line == null) {
						break;
					};
					Double inputNumber = Double.parseDouble(line);	
					
					
					circles.add(new Circle(inputNumber));
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					bufferReader.close();
					fileReader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
	
//		 	for(Circle c : circles) {
//		 		System.out.println(c.getBanKinh());
//		 	}
		return circles;
	}

}
