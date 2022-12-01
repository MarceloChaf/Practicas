print("usted va a abrir una cuenta de ahorros que ofrece 4% de interes al año")


def porcetanje(n):
    por = n / 100 * 4 + n
    return por


while True:
    try:
        total = int(input("ingrese el monto que va a depositar\n"))
        ano1 = porcetanje(total)
        ano2 = porcetanje(ano1)
        ano3 = porcetanje(ano2)
        interes = 0.04
        ano11 = total * (1 + interes)
        ano22 = ano11 * (1 + interes)
        ano33 = ano22 * (1 + interes)
        print("el retorno del primer año es: ", ano1)
        print("el retorno del segundo año es: ", ano2)
        print("el retorno del tercer año es: ", ano3)
        print("el retorno del primer año es: ", ano11)
        print("el retorno del segundo año es: ", ano22)
        print("el retorno del tercer año es: ", ano33)
        break
    except:
        print("no ingreso un numero valido")
