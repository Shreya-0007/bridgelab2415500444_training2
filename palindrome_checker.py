class PalindromeChecker:
    def __init__(self, text):
        self.text = text

    def is_palindrome(self):
        return self.text.lower() == self.text[::-1].lower()

    def display_result(self):
        if self.is_palindrome():
            print(f"'{self.text}' is a Palindrome.")
        else:
            print(f"'{self.text}' is NOT a Palindrome.")

checker = PalindromeChecker("Madam")
checker.display_result()
