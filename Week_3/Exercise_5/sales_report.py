user_input = input("Enter numbers separated by spaces: ")
sale = list(map(int, user_input.split()))
def generate_report(sales):
    for i in sales:
        if(i>=500):
            print('='*4,"THE SALES IS ",i,'='*4)
        else:
            print(f"The sales is {i}")
generate_report(sale)