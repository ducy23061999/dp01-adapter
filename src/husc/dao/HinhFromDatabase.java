package husc.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import husc.dp.Circle;
import husc.dp.adapters.HinhVuongAdapter;
import husc.dp.adapters.TamGiacAdapter;

public class HinhFromDatabase implements IDataSource{
	
	DungChung dc = new DungChung();
	
	public HinhFromDatabase() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public List<Circle> getCircles() {

		ArrayList<Circle> listHinh = new ArrayList<Circle>();
		try {
			dc.KetNoi();
			String sql ="SELECT * FROM Hinh";
			PreparedStatement cmd = dc.cn.prepareStatement(sql);
			ResultSet rs = cmd.executeQuery();
			while(rs.next()) {
				int type = rs.getInt(2);
				double param1 = rs.getDouble(3);
				double param2 = rs.getDouble(4);
				double param3 = rs.getDouble(5);
				double param4 = rs.getDouble(6);
				double param5 = rs.getDouble(7);
				double param6 = rs.getDouble(8);
				switch (type) {
				case 1: {
					Circle h = new Circle(param1);
					listHinh.add(h);
					break;
				}
				case 2: {
					Circle h = new HinhVuongAdapter(param1);
					listHinh.add(h);
					break;
				}
				case 3: {
					Circle h = new TamGiacAdapter(param1,param2,param3);
					listHinh.add(h);
					break;
				}
				case 4: {
					//Circle h = new DaGiacAdapter(param1,param2,param3,param4,param5,param6);
					//listHinh.add(h);
					break;
				}
				default:
					throw new IllegalArgumentException("Unexpected value: " + type);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return listHinh;
	}

	
}
