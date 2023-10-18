package abc;

public class Rectangle {
  int length,breadth;
  double area;
  Rectangle()
  {length=12;
  breadth=12;}
  Rectangle(int length)
  {this.length=length;
  }
  Rectangle(int length,int breadth)
  {this.length=length;
  this.breadth=breadth;}
  void area()
  {
	  area=length*breadth;
	  System.out.println(area);
  }
}
