peso = float(input("Por favor, introduce tu peso en kg: "))
estatura = float(input("Por favor, introduce tu estatura en metros: "))

# Calcular el índice de masa corporal (IMC)
imc = peso / (estatura ** 2)

# Redondear el IMC a dos decimales
imc_redondeado = round(imc, 2)

# Imprimir el resultado
print("Tu índice de masa corporal es:", imc_redondeado)