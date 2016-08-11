package guvi;


import java.util.ArrayList;
import java.util.List;

public class CoordSquare {

public static boolean isSquare(List<Point> listPoints) {
    if (listPoints != null && listPoints.size() == 4) {
        int distance1 = distance(listPoints.get(0), listPoints.get(1));
        int distance2 = distance(listPoints.get(0), listPoints.get(2));
        int distance3 = distance(listPoints.get(0), listPoints.get(3));

        if (distance1 == distance2) {
            if (distance3 == distance1 + distance2) {
                return true;
            }

        } else if (distance1 == distance3) {
            if (distance2 == distance1 + distance3) {
                return true;
            }

        }
    }
    return false;
}

private static int distance(Point point, Point point2) {
    return (int) (Math.pow(point2.x1 - point.x1, 2) + (Math.pow(point2.y1-point.y1, 2)));
}

public static void main(String args[]) {
    List<Point> pointz = new ArrayList<Point>();
    pointz.add(new Point(2, 2));
    pointz.add(new Point(2, 4));
    pointz.add(new Point(4, 2));
    pointz.add(new Point(4, 4));
    System.out.println(CoordSquare.isSquare(pointz));
}
}

class Point {
Integer x1;
Integer y1;
boolean isVisited;

public Point(Integer x, Integer y) {
    this.x1 = x;
    this.y1 = y;
}

@Override
public boolean equals(Object obj) {
    if(obj!=null && obj.getClass().equals(this.getClass())){
        return ((Point) obj).x1.equals(this.x1)&&((Point) obj).y1.equals(this.y1);
    }
    return false;

}
}