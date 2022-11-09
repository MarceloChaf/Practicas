import pandas as pd

archivo = pd.read_excel("Tabla1.xlsx") 

data = archivo.to_dict("records") 
# "records" significa que vamos a obtener el contenido separado por cada fila
b=0
c=0
p=10000
for a in data :
    a =data[b]["Puntos"] 
    d=data[b]["Equipo"]
    if a > c:
        c=a
        equipo_ganador = d
    if a < p:
        p=a
        equipo_perdedor = d
    b=b+1

print("El equipo ganador es  " ,equipo_ganador)
print("y el equipo perdedor es" , equipo_perdedor)