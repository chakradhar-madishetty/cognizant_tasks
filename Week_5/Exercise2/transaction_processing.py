import datetime
import re

def log_error(error_message):
    timestamp = datetime.datetime.now().strftime("%Y-%m-%d %H:%M:%S")
    with open("error_log.txt", "a") as log_file:
        log_file.write(f"{timestamp} - {error_message}\n")

def validate_amount(amount):
    try:
        amount = float(amount)
        if amount <= 0:
            raise ValueError("Amount must be positive")
        return amount
    except ValueError as e:
        raise ValueError(f"Invalid amount: {e}")

def validate_account_number(account_number):
    if not re.match(r'^\d{10}₹', account_number):
        raise ValueError("Account number must be 10 digits")
    return account_number

def process_transaction(account_number, amount):
    print(f"Processing transaction: Account {account_number}, Amount ₹{amount:.2f}")
    print("Transaction processed successfully")

def main():
    while True:
        try:
            print("\nTransaction Processing System")
            account_number = input("Enter account number (10 digits): ")
            account_number = validate_account_number(account_number)

            amount = input("Enter transaction amount: ")
            amount = validate_amount(amount)

            process_transaction(account_number, amount)

        except ValueError as e:
            error_message = f"Validation error: {str(e)}"
            print(f"Error: {error_message}")
            log_error(error_message)

        except Exception as e:
            error_message = f"Unexpected error: {str(e)}"
            print(f"An unexpected error occurred: {error_message}")
            log_error(error_message)

        finally:
            choice = input("Do you want to process another transaction? (y/n): ")
            if choice.lower() != 'y':
                print("Thank you for using the Transaction Processing System. Goodbye!")
                break

if __name__ == "__main__":
    main()