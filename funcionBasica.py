def operacion_matematica(a, b, c):
    resultado = (a ** 2 + b ** 2) * c +2 
    return resultado

def division(a, b):
    if b == 0:
        return "Error: División por cero"
    return a / b

resultado = operacion_matematica(2, 3, 4)
print("El resultado es:", resultado)  

resultado_division = division(10, 2)
print("El resultado de la división es:", resultado_division)
