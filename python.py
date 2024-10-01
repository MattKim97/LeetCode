# programming act of telling a computer what to do
# terminal is also known as the command-line, shell command prompt or console
# the Python programming language was released in 1991 by Guido van Rossum
# Python is an open-source programming language that is free to use and distribute
# Python has a small formal and rigid syntax
# includes identifiers, keywords, statements, code blocks, whitespace, and comments
# a variable is an identifier that labels a value
# a variable's value can change
# name is important for a variable so we remember what it is stored as
# each variable has a data type, inferred by the value assigned to it
# The standard input stream allows an application to capture text typed in the terminal. 
# The standard output stream allows an application to print text to the terminal window.
# Identifiers have hard rules. They are case sensitive. Whitespace is not permitted.
# Class identifiers should be CamelCase.
# Variable and function identifiers should be snake_case.
# No single character identifiers.

plates = []

def run ():
    choice = int(read_required_string("Menu\n================\n0. [Exit]\n1. Add a plate\n2. Print plates\n3. Remove plates\nSelect [0-3]: "))
    while choice != 0:
        if choice == 1:
            add_plate(plates)
        elif choice == 2:
            print_plates(plates)
        elif choice == 3:
            remove_plates(plates)
        else:
            print("Invalid choice.")
        choice = int(read_required_string("Menu\n================\n0. [Exit]\n1. Add a plate\n2. Print plates\n3. Remove plates\nSelect [0-3]: "))
    print("Goodbye!")




def read_required_string(prompt):
    value = ""
    while not value:
        value = input(prompt).strip()
    return value

def add_plate(plates):
    print("Add a plate")
    print("==========")
    prev_size = plates[-1] if plates else 0
    size = int(read_required_string("Enter a plate size: "))

    if(size <= 0):
        print("Cannot add a plate of size 0 or less.")
        return
    
    if prev_size == 0:
        plates.append(size)
        print("Success!")
        return
    if size > prev_size:
        print(f"Cannot place a plate of size {size} on top of another plate of size {prev_size}.")
        return
    plates.append(size)
    print("Success!")

def print_plates(plates):
    print("Print plates")
    print("============")
    if(not plates):
        print("There are no stacked plates.")
        return
    for plate in reversed(plates):
        print(plate)

def remove_plates(plates):
    print("Remove plates")
    print("==========")
    num_plates = int(read_required_string("How many plates to remove?: "))
    if(num_plates <= 0):
        print("Cannot remove 0 or less plates.")
        return
    if(num_plates > len(plates)):
        print(f"Cannot remove more than {len(plates)} plates. You chose {num_plates}.")
        return
    while num_plates > 0:
        plates.pop(-1)
        num_plates -= 1
    print("Success!")


run()

# works as expected
# got a 8/8
