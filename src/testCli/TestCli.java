package testCli;

import mz.CircleIntersectionPoint;

public class TestCli {
    private static double width = 400.3;
    private static double height = 240.5;
    private static double alfa = 1;
    private static double theta = 30;
    
    public static void main(String[] args) 
    throws Exception {
        CircleIntersectionPoint circle = new CircleIntersectionPoint(width, height, alfa);
        circle.setTheta(theta);
        System.out.printf(
            " width: %.2f%n height: %.2f%n alfa: %.2f%n theta: %.2f%n xOrigo: %.2f%n yOrigo: %.2f%n x: %.4f%n y: %.4f", 
            circle.getWidth(),
            circle.getHeight(),
            circle.getAlfa(),
            circle.getTheta(),
            circle.getxOrigo(),
            circle.getyOrigo(),
            circle.getxPoint(),
            circle.getyPoint()
        );
    }
}
