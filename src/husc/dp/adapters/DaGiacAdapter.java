package husc.dp.adapters;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import husc.dp.Circle;
import husc.dp.useful_classes.DaGiac;
import husc.dp.useful_classes.Point;

public class DaGiacAdapter extends Circle{
	private DaGiac daGiac;
	private HashMap<String, Double> cachePoint = new HashMap<String, Double>();


	
	public DaGiacAdapter(List<Point> listPoint) {
		// TODO Auto-generated constructor stub
		super(3);
		this.daGiac = new DaGiac(listPoint);
	}
	
	double getCacheEdge(Point a, Point b) {
		double cacheEdge = 0;
		String key1 = String.format("(%f|%f),(%f|%f)", a.getX(), a.getY(), b.getX(), b.getY());
		String key2 = String.format("(%f|%f),(%f|%f)", b.getX(), b.getY(), a.getX(), a.getY());
		
		if (cachePoint.get(key1) != null || cachePoint.get(key2) != null) {
			if (cachePoint.get(key1) != null) {
				cacheEdge = cachePoint.get(key1);
			} else {
				cacheEdge = cachePoint.get(key2);
			}
		} else {
			cacheEdge = Math.sqrt(
					Math.pow((b.getX() - a.getX()), 2) +
					Math.pow((b.getY() - a.getY()), 2)
			);
			
			cachePoint.put(key1, cacheEdge);
			cachePoint.put(key2, cacheEdge);
		}
		
		return cacheEdge;
		
	}
	
	ArrayList<Point> findMaxDiagonalPoint() {
		double max = 0;
		ArrayList<Point> listPoint = new ArrayList<Point>();
		
		// tính max đường chéo
		for (Point pointX: this.daGiac.getLstĐỉnh()) {
			for (Point pointY: this.daGiac.getLstĐỉnh()) {
				double edge = getCacheEdge(pointX, pointY);
				if (edge > max) {
					max = edge;
				}
			}
		}
		// từ max lấy ra 2 tọa độ của đường chéo đó
		for (Point pointX: this.daGiac.getLstĐỉnh()) {
			for (Point pointY: this.daGiac.getLstĐỉnh()) {
				double edge = getCacheEdge(pointX, pointY);
				if (edge == max) {
					listPoint.add(pointX);
					listPoint.add(pointY);
					break;
				}
			}
		}
		
		
		return listPoint;
	}
	
	Point getTrungDiem(Point x, Point y) {
		
		return new Point((x.getX() + y.getX()) / 2, (x.getY() + y.getY()) / 2);
	}
	
	boolean checkIfExist(ArrayList<Point> listPoint, Point point) {
		
		for (Point pointX: listPoint) {
			if (pointX.getX() == point.getX() && pointX.getY() == point.getY()) {
				return true;
			}
		}
		return false;
	}
	/*
	 * Ý tưởng: Xem đường chéo lớn nhất của đa giác là đường kính
	 * Từ đó từ tâm đường chéo đó đến các đỉnh còn lại có nằm trong đường tròn có bán kính R hay k?
	 */
	@Override
	public boolean isFit(double r) {
		
		int dem = 0;
		
		ArrayList<Point> listMaxPoint = findMaxDiagonalPoint();
		Point trungDiem = getTrungDiem(listMaxPoint.get(0), listMaxPoint.get(1));
		// Từ trung điểm của 2 cạnh lớn nhất với từng cạnh. 
		// Đếm xem bao nhiêu đỉnh sẽ lớn hơn r đã cho
		for (Point pointX: this.daGiac.getLstĐỉnh()) {
			double currentRadius = this.getCacheEdge(trungDiem, pointX);
			
			if (currentRadius <= r && !checkIfExist(listMaxPoint, pointX)) {
				dem++;
			}
		}
		
		// -2 vì 2 tọa độ đường chéo k tính
		if (dem == this.daGiac.getLstĐỉnh().size() - 2) {
			double maxEdgeDiagonal = this.getCacheEdge(listMaxPoint.get(0), listMaxPoint.get(1));
			if (2 * maxEdgeDiagonal <= 2 * r) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
		
	}
	
	
}
