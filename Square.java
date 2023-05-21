
public class Square {
	private Double side;
	private Double Area;
	public Square() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Square(Double side, Double area) {
		super();
		this.side = side;
		Area = area;
	}
	public Double getSide() {
		return side;
	}
	public void setSide(Double side) {
		this.side = side;
	}
	public Double getArea() {
		return Area;
	}
	public void setArea(Double area) {
		Area = area;
	}
	@Override
	public String toString() {
		return "Square [side=" + side + ", Area=" + Area + "]";
	}
	
	public Double findArea(Double s) {
		Area = s*s;
		return Area;
	}
}
