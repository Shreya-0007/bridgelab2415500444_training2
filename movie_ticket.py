class MovieTicket:
    def __init__(self):
        self.movie_name = None
        self.seat_number = None
        self.price = 0

    def book_ticket(self, movie_name, seat_number, price):
        self.movie_name = movie_name
        self.seat_number = seat_number
        self.price = price
        print("Ticket booked successfully!")

    def display_ticket(self):
        print(f"Movie: {self.movie_name}")
        print(f"Seat Number: {self.seat_number}")
        print(f"Price: ₹{self.price}")

ticket = MovieTicket()
ticket.book_ticket("Oppenheimer", "A12", 300)
ticket.display_ticket()
