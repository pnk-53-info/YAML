
public class Rectangle {
	private Double length;
	private Double breadth;
	private Double Area;
	public Rectangle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Rectangle(Double length, Double breadth, Double area) {
		super();
		this.length = length;
		this.breadth = breadth;
		Area = area;
	}
	public Double getLength() {
		return length;
	}
	public void setLength(Double length) {
		this.length = length;
	}
	public Double getBreadth() {
		return breadth;
	}
	public void setBreadth(Double breadth) {
		this.breadth = breadth;
	}
	public Double getArea() {
		return Area;
	}
	public void setArea(Double area) {
		Area = area;
	}
	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", breadth=" + breadth + ", Area=" + Area + "]";
	}
	
	public Double findArea(Double l,Double b) {
		Area=l*b;
		return Area;
	}
}
