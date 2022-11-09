import time
contador=0
cont=0


print("A continuacion le vamos a ofrecer nuestros 2 tipos de pizza , por favor ingrese el numero de la pizza que desea")
time.sleep(2)
print("1.Vegetariana")
print("2.No vegetariana")
while contador==0:
    pizza= int(input())
    if pizza != 1 and pizza !=2:
        print("por favor , ingrese una opcion valida")
    else:
        contador+=1


if pizza==1:
    fin="Vegetariana"
    print("seleccione el ingrediente que desea")
    time.sleep(2)
    print("1.Pimiento")
    print("2.Tofu")
    ingrediente=int(input(()))
    while cont == 0:
        if ingrediente==1:
            sabor="Pimiento"
            break
        if ingrediente==2:
            sabor="Tofu"
            break
        else:
            print("por favor ingrese un numero valido")
            ingrediente=int(input(()))

if pizza==2:
    fin="No Vegetariana"
    print("seleccione el ingrediente que desea")
    time.sleep(2)
    print("1.Peperoni")
    print("2.Jamón")
    print("3.Salmón")
    ingrediente=int(input(()))
    while cont == 0:
        if ingrediente==1:
            sabor="Peperoni"
            break
        if ingrediente==2:
            sabor="Jamón"
            break
        if ingrediente==3:
            sabor="Salmón"
            break
        else:
            print("por favor ingrese un numero valido")
            ingrediente=int(input(()))

print("Se eligio una pizza", fin , "que contiene Mozarella , Tomate y " , sabor)