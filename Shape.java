//implimenting java program with Single-inheritance

package apjfsa;

//parent-class
public class Shape {
	// instance variable
	String shapename;

	// method
	void shapeInfo() {
		System.out.println("Shape details :" + shapename);
	}
}


//package-name
package apjfsa;

//child-class
public class Circle extends Shape {
	// instance variable
	int radius;
	float pi;

	// method declaration
	void circleInfo() {
		System.out.println("Area  of the Circle :" + (pi * radius * radius));
	}

	// main-function
	public static void main(String[] args) {
		// creating-object
		Circle A = new Circle();
		A.shapename = "Circle";
		A.pi = 3.14f;
		A.radius = 7;
		A.shapeInfo();
		A.circleInfo();
	}

}

