# hello.py
def add_numbers(a, b):
    return a + b

if __name__ == "__main__":
    print("Hello from Jenkins Pipeline Demo!")
    x, y = 5, 7
    print(f"Adding {x} + {y} = {add_numbers(x, y)}")
