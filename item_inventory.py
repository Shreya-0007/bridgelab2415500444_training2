class Item:
    def __init__(self, item_code, item_name, price):
        self.item_code = item_code
        self.item_name = item_name
        self.price = price

    def display_details(self, quantity):
        total_cost = self.price * quantity
        print(f"Item Code: {self.item_code}")
        print(f"Item Name: {self.item_name}")
        print(f"Price per Unit: ₹{self.price}")
        print(f"Quantity: {quantity}")
        print(f"Total Cost: ₹{total_cost}")

item = Item(101, "Notebook", 50)
item.display_details(10)
