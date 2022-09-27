# Function to add two numbers
def add(num1, num2):
    return num1 + num2
 
# Function to subtract two numbers
def subtract(num1, num2):
    return num1 - num2
 
# Function to multiply two numbers
def multiply(num1, num2):
    return num1 * num2
 
# Function to divide two numbers
def divide(num1, num2):
    return num1 / num2
 
print("Please select operation -\n" \
        "1. Add\n" \
        "2. Subtract\n" \
        "3. Multiply\n" \
        "4. Divide\n")
 
 
# Take input from the user
select = int(input("Select operations form 1, 2, 3, 4 :"))
 
number_1 = int(input("Enter first number: "))
number_2 = int(input("Enter second number: "))
 
if select == 1:
    print(number_1, "+", number_2, "=",
                    add(number_1, number_2))
 
elif select == 2:
    print(number_1, "-", number_2, "=",
                    subtract(number_1, number_2))
 
elif select == 3:
    print(number_1, "*", number_2, "=",
                    multiply(number_1, number_2))
 
elif select == 4:
    print(number_1, "/", number_2, "=",
                    divide(number_1, number_2))
else:
    print("Invalid input")





# Outputs Of the Program :

'''
(1) Addition :

Please select operation -
1. Add
2. Subtract
3. Multiply
4. Divide

Select operations form 1, 2, 3, 4 :1
Enter first number: 3
Enter second number: 4
3 + 4 = 7


(2) Substraction :

Please select operation -
1. Add
2. Subtract
3. Multiply
4. Divide

Select operations form 1, 2, 3, 4 :2
Enter first number: 5
Enter second number: 4
5 - 4 = 1


(3) Multiplication :

Please select operation -
1. Add
2. Subtract
3. Multiply
4. Divide

Select operations form 1, 2, 3, 4 :3
Enter first number: 3
Enter second number: 4
3 * 4 = 12


(4) Division :

Please select operation -
1. Add
2. Subtract
3. Multiply
4. Divide

Select operations form 1, 2, 3, 4 :4
Enter first number: 6
Enter second number: 3
6 / 3 = 2.0


(5) Invalid Operator :

Please select operation -
1. Add
2. Subtract
3. Multiply
4. Divide

Select operations form 1, 2, 3, 4 :5
Enter first number: 4
Enter second number: 3
Invalid input

'''

