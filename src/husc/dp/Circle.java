package husc.dp;

public class Circle {
	private double banKinh;

	public double getBanKinh() {
		return banKinh;
	}

	public void setBanKinh(double banKinh) {
		this.banKinh = banKinh;
	}

	public Circle(double r) {
		this.setBanKinh(r);
	}

	/**
	 * Cho biết hình tròn có lọt qua được 1 lỗ tròn bán kính r hay không?
	 * 
	 * @param r
	 * @return true/false
	 */
	public boolean isFit(double r) {
		return this.getBanKinh() <= r;
	}
}
