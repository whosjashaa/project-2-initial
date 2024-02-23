package com.csc205.project2;

import java.util.ArrayList;
import java.util.List;

/**
 * Driver for project 2.
 *
 * Modify the driver as needed to demonstrate your classes.
 *
 */
public class Project2 {

    public static void main(String[] args) {

        interface ThreeDimensionalShape {
            double surfaceArea(); // Method to calculate surface area of a shape

            double volume();      // Method to calculate volume of a shape
        }

// Abstract class representing a generic 3D shape
        abstract class Shape implements ThreeDimensionalShape {
            // Common methods or properties for 3D shapes can go here
        }

// Sphere class
        class Sphere extends Shape {
            private double radius; // Radius of the sphere

            public Sphere(double radius) {
                this.radius = radius;
            }

            public double getRadius() {
                return radius;
            }

            @Override
            public double surfaceArea() {
                return 4 * Math.PI * radius * radius; // Formula for surface area of a sphere
            }

            @Override
            public double volume() {
                return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3); // Formula for volume of a sphere
            }

            @Override
            public String toString() {
                return String.format("Sphere {radius=%.2f, surface area=%.2f, volume=%.2f}", radius, surfaceArea(), volume());
            }
        }

// Cube class
        class Cube extends Shape {
            private double width; // Width of the cube

            public Cube(double width) {
                this.width = width;
            }

            public double getWidth() {
                return width;
            }

            @Override
            public double surfaceArea() {
                return 6 * width * width; // Formula for surface area of a cube
            }

            @Override
            public double volume() {
                return Math.pow(width, 3); // Formula for volume of a cube
            }

            @Override
            public String toString() {
                return String.format("Cube {width=%.2f, surface area=%.2f, volume=%.2f}", width, surfaceArea(), volume());
            }
        }

// Cylinder class
        class Cylinder extends Shape {
            private double height; // Height of the cylinder
            private double radius; // Radius of the cylinder

            public Cylinder(double height, double radius) {
                this.height = height;
                this.radius = radius;
            }

            public double getHeight() {
                return height;
            }

            public double getRadius() {
                return radius;
            }

            @Override
            public double surfaceArea() {
                return 2 * Math.PI * radius * (radius + height); // Formula for surface area of a cylinder
            }

            @Override
            public double volume() {
                return Math.PI * Math.pow(radius, 2) * height; // Formula for volume of a cylinder
            }

            @Override
            public String toString() {
                return String.format("Cylinder {height=%.2f, radius=%.2f, surface area=%.2f, volume=%.2f}", height, radius, surfaceArea(), volume());
            }
        }

// Driver class for testing
        class Main {
            public void main(String[] args) {
                // Instantiate objects of different shapes
                Sphere sphere = new Sphere(2.0);
                Cube cube = new Cube(5.0);
                Cylinder cylinder = new Cylinder(4.0, 1.0);

                // Display details of each shape
                System.out.println(sphere);
                System.out.println(cube);
                System.out.println(cylinder);
            }
        }
    }
}