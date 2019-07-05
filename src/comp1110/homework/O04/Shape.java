package comp1110.homework.O04;

import java.sql.SQLClientInfoException;

public abstract class Shape {
    public abstract double perimeter();
    public abstract double area();

    double x;
    double y;
    double length;
    double radius;
}

class Square extends Shape {
    Square(double length) {
        this.length = length;
    }

    Square(double length, double x, double y) {
        this.length = length;
        this.x = x;
        this.y = y;
    }

    public double perimeter() {
        return this.length * 4;
    }

    public double area() {
        return this.length * this.length;
    }
}

class Circle extends Shape {
    Circle(double radius) {
        this.radius = radius;
    }

    Circle(double radius, double x, double y) {
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }
}



/*
public abstract class Shape {
    public abstract double perimeter();
    public abstract double area();

    double x;
    double y;
    double length;
    double radius;

    public abstract boolean overlaps(Shape other);
}

class Square extends Shape {
    Square(double length) {
        this.length = length;
    }

    Square(double length, double x, double y) {
        this.length = length;
        this.x = x;
        this.y = y;
    }

    public double perimeter() {
        return this.length * 4;
    }

    public double area() {
        return this.length * this.length;
    }

    public boolean overlaps(Shape other) {
        return true;
    }
}

class Circle extends Shape {
    Circle(double radius) {
        this.radius = radius;
    }

    Circle(double radius, double x, double y) {
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    public double perimeter() {
        return this.radius * 2 * Math.PI;
    }

    public double area() {
        return this.radius * this.radius * Math.PI;
    }

    public boolean overlaps(Shape other) {
        return true;
    }
}
*/

/*
public abstract class Shape {
    public abstract double perimeter();
    public abstract double area();

    double x;
    double y;
    double length;
    double radius;

    public abstract boolean overlaps(Shape other);
}

class Square extends Shape {
    Square(double length) {
        this.length = length;
    }

    Square(double length, double x, double y) {
        this.length = length;
        this.x = x;
        this.y = y;
    }

    @Override
    public double perimeter() {
        return this.length * 4;
    }

    @Override
    public double area() {
        return this.length * this.length;
    }

    @Override
    public boolean overlaps(Shape other) {
        return true;
    }
}

class Circle extends Shape {
    Circle(double radius) {
        this.radius = radius;
    }

    Circle(double radius, double x, double y) {
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    @Override
    public double perimeter() {
        return Math.PI*2*radius;
    }

    @Override
    public double area() {
        return Math.PI*radius*radius;
    }

    @Override
    public boolean overlaps(Shape other) {
        return  true;
    }
}*/

/*
public abstract class Shape {
    public abstract double perimeter();
    public abstract double area();

    double x;
    double y;
    double length;
    double radius;

    public abstract boolean overlaps(Shape other);
}

class Square extends Shape {
    Square(double length) {
        this.length = length;
    }

    Square(double length, double x, double y) {
        this.length = length;
        this.x = x;
        this.y = y;
    }

    @Override
    public double perimeter() {
        return this.length * 4;
    }

    @Override
    public double area() {
        return this.length * this.length;
    }

    @Override
    public boolean overlaps(Shape other) {
        return true;
    }
}

class Circle extends Shape {
    Circle(double radius) {
        this.radius = radius;
    }

    Circle(double radius, double x, double y) {
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    @Override
    public double perimeter() {
        return Math.PI * 2 * radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public boolean overlaps(Shape other) {
        return true;
    }
}
*/


/*
public abstract class Shape {

    public abstract double perimeter();
    public abstract double area();

    double x;
    double y;
    double length;
    double radius;

    public abstract boolean overlaps(Shape other);
}

class Square extends Shape {
    Square(double length) {
        this.length = length;
    }

    Square(double length, double x, double y) {
        this.length = length;
        this.x = x;
        this.y = y;
    }

    @Override
    public double perimeter() {
        return this.length * 4;
    }

    @Override
    public double area() {
        return this.length * this.length;
    }

    @Override
    public boolean overlaps(Shape other) {
        double disX = Math.abs(this.x - other.x);
        double disY = Math.abs(this.y - other.y);

        double dis = this.length * 0.5 + other.length * 0.5;

        double toCircleX = Math.max(disX - this.length / 2, 0);
        double toCircleY = Math.max(disY - this.length / 2, 0);

        if (other.getClass().getName().equals(Square.class.getName())) {
            if ((disX < dis) && (disY < dis)) {
                return true;
            }
            else {
                return false;
            }
        }
        else {
            if (this.x != other.x && this.y != other.y) {
                if (toCircleX * toCircleX + toCircleY * toCircleY < other.radius * other.radius) {
                    return true;
                }
                else {
                    return false;
                }
            }
            else {
                if ((disX * disX + disY * disY) < (other.radius + this.length * 0.5)* (other.radius + this.length * 0.5)) {
                    return true;
                }
                else {
                    return false;
                }
            }
        }
    }
}

class Circle extends Shape {

    Circle(double radius) {
        this.radius = radius;
    }

    Circle(double radius, double x, double y) {
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public boolean overlaps(Shape other) {
        double disX = Math.abs(this.x - other.x);
        double disY = Math.abs(this.y - other.y);
        double sumOfRadius = this.radius + other.radius;

        double toSquareX = Math.max(disX - other.length * 0.5, 0);
        double toSquareY = Math.max(disY - other.length * 0.5, 0);

        if (other.getClass().getName().equals(Circle.class.getName())) {
            if (disX * disX + disY * disY < sumOfRadius * sumOfRadius) {
                return true;
            }
            else {
                return false;
            }
        }
        else {
            if ((toSquareX * toSquareX + toSquareY * toSquareY) < this.radius * this.radius) {
                return true;
            }
            else {
                return false;
            }
        }
    }
}
*/

/*
public abstract class Shape {

    public abstract double perimeter();
    public abstract double area();

    double x;
    double y;
    double length;
    double radius;

    public abstract boolean overlaps(Shape other);
}

class Square extends Shape {

    Square(double length) {
        this.length = length;
    }

    Square(double length, double x, double y) {
        this.length = length;
        this.x = x;
        this.y = y;
    }

    @Override
    public double perimeter() {
        return this.length*4;
    }

    @Override
    public double area() {
        return this.length*this.length;
    }

    @Override
    public boolean overlaps(Shape other) {
        double disX = Math.abs(this.x - other.x);
        double disY = Math.abs(this.y - other.y);

        double dis = this.length*0.5 + other.length*0.5;
        double digOfSqu = 0.5*Math.sqrt(2)*this.length;

        double toCircleX = Math.max(disX - this.length/2, 0);
        double toCircleY = Math.max(disY - this.length/2, 0);

        if (other.getClass().getName().equals(Square.class.getName())) {
            if ((disX < dis) && (disY < dis)) {
                return true;
            }
            else {
                return false;
            }
        }
        else {
            if (this.x != other.x && this.y != other.y) {
                if (toCircleX*toCircleX + toCircleY*toCircleY < other.radius*other.radius) {
                    return true;
                }
                else {
                    return false;
                }
            }
            else {
                if ((disX*disX + disY*disY) < (other.radius + this.length*0.5)*(other.radius + this.length*0.5)) {
                    return true;
                }
                else {
                    return false;
                }
            }
        }
    }
}

class Circle extends Shape {

    Circle(double radius) {
        this.radius = radius;
    }

    Circle(double radius, double x, double y) {
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    @Override
    public double perimeter() {
        return 2*Math.PI*this.radius;
    }

    @Override
    public double area() {
        return Math.PI*this.radius*this.radius;
    }

    @Override
    public boolean overlaps(Shape other) {
        double disX = Math.abs(this.x - other.x);
        double disY = Math.abs(this.y - other.y);
        double sumOfRadius = this.radius + other.radius;

        double toSquareX = Math.max(disX - other.length*0.5, 0);
        double toSquareY = Math.max(disY - other.length*0.5, 0);

        if (other.getClass().getName().equals(Circle.class.getName())) {
            if (disX*disX + disY*disY < sumOfRadius*sumOfRadius) {
                return true;
            }
            else {
                return false;
            }
        }
        else {
            if ((toSquareX*toSquareX + toSquareY*toSquareY) < this.radius*this.radius) {
                return true;
            }
            else {
                return false;
            }
        }

    }
}
*/