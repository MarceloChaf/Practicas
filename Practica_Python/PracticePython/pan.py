print("Este programa calcula la cantidad de panes de ayer vendidos")

valor = 3.49

cantidad = int(input("ingrese la cantidad de pan que se vendio hoy \n"))

preciofin = valor * (1 - 0.6)

print("en el dia se vendieron ", cantidad, " barras de pan de ayer , con un descuento del 60% ")
print("si se hubiera vendido al costo comun la ganancia seria de ", cantidad*valor)
print("como se vendieron con descuento , la ganancia es: ", round(cantidad*preciofin, 2))
