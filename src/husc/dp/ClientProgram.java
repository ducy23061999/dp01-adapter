package husc.dp;

import java.util.List;

import husc.dao.HinhDaGiacDataSource;
import husc.dao.HinhTamGiacDataSource;
import husc.dao.HinhTronDataSource;
import husc.dao.HinhVuongDataSource;
import husc.dao.IDataSource;

public class ClientProgram {
	static int countFitCircles(List<Circle> lst, double rToFit) {
		int count = 0;
		for (Circle x: lst)
			if (x.isFit(rToFit)) {
				count++;
			}
		return count;
	}
	
	static void testIt() {
		List<Circle> lst = null;
		
		// 1.1 Đọc danh sách các hình tròn từ 1 nguồn dữ liệu nào đó (file circle.txt chẳng hạn)
		IDataSource listHinhTron = new HinhTronDataSource("circle.txt");
		
		lst.addAll(listHinhTron.getCircles());
		// 1.2 Đọc danh sách hình đa giác + tạo adapter của đa giác & bổ sung vào lst
		
		IDataSource listDaGiac = new HinhDaGiacDataSource("polygon.txt");
		
		lst.addAll(listDaGiac.getCircles());
		
		// 1.3 Đọc danh sách hình vuông, tạo adapter của hình vuông & bổ sung vào lst
		
		IDataSource listVuong = new HinhVuongDataSource("square.txt");
		
		lst.addAll(listVuong.getCircles());
		// 1.4 Đọc dnah sách hình tam giác, tạo adapter của hình tam giác & bổ sung vào lst
		IDataSource listTamGiac = new HinhTamGiacDataSource("triangle.txt");
		
		lst.addAll(listTamGiac.getCircles());
		// 2. In số hình tròn vừa với lỗ có bán kính r = 100 ra màn hình
		double rToFit = 100;
		int count = countFitCircles(lst, rToFit);
		System.out.println("So luong: " + count);
	}
	
	public static void main(String[] args) {
		testIt();
	}
}
