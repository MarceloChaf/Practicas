#Importo el paquete que nos ayuda a leer excel

import pandas as pd

archivo = pd.read_excel("Datos.xlsx") 

data = archivo.to_dict("records") 
# "records" significa que vamos a obtener el contenido separado por cada fila

#Creo la variable "b" para que funcione e bucle , y la variable total para ir sumando las notas
b=0
Total=0
for a in data :
    c =data[b]["Quimica"]
    Total= Total + c
    b=b+1

#divido el total por la cantidad de notas , e imprimo el resultado
print("El promedio de las notas de quimica es " , Total/b)