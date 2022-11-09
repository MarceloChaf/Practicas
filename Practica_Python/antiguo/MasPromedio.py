#Importo el paquete que nos ayuda a leer excel

import pandas as pd

archivo = pd.read_excel("Datos.xlsx") 

def promedio( Index, Ind ):
    alumno = Index.loc[Ind]
    m = alumno["Matematica"]
    q = alumno["Quimica"]
    f = alumno["Fisica"]
    return (m + f + q ) /3

print("El promedio del dato 0 es %0.2f "  % promedio(archivo, 0))
print("El promedio del dato 1 es %0.2f "   % promedio(archivo, 1))