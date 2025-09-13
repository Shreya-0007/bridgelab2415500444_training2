import math

class Circle:
    def __init__(self, radius):
        self.radius = radius

    def calculate_area(self):
        return math.pi * self.radius ** 2

    def calculate_circumference(self):
        return 2 * math.pi * self.radius

    def display(self):
        print(f"Radius: {self.radius}")
        print(f"Area: {self.calculate_area():.2f}")
        print(f"Circumference: {self.calculate_circumference():.2f}")

c = Circle(7)
c.display()
