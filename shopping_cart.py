class CartItem:
    def __init__(self, item_name, price, quantity):
        self.item_name = item_name
        self.price = price
        self.quantity = quantity

    def add_item(self, quantity):
        self.quantity += quantity
        print(f"Added {quantity} more {self.item_name}(s).")

    def remove_item(self, quantity):
        if quantity <= self.quantity:
            self.quantity -= quantity
            print(f"Removed {quantity} {self.item_name}(s).")
        else:
            print("Not enough items to remove!")

    def display_total_cost(self):
        total_cost = self.price * self.quantity
        print(f"Item: {self.item_name}")
        print(f"Quantity: {self.quantity}")
        print(f"Total Cost: ₹{total_cost}")

cart = CartItem("Pen", 10, 5)
cart.add_item(3)
cart.remove_item(2)
cart.display_total_cost()
