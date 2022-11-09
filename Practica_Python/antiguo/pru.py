def biciesto(ano):
    if ano & 4 == 0:
        if ano & 100 == 0:
            if ano & 400 == 0:
                return True
            else:
                return False
        else:
            return True
    else:
        return False

permiso=True

print("ingrese la fecha que desea , de la forma dd/mm/aaaa a medida que se lo pide el programa")

dia=int(input("ingrese el dia: "))
while dia<=0 or dia>=32:
    print("el dia no puede ser menor que cero ni mayor a 31")
    dia=int(input("ingrese el dia: "))

mes=int(input("ingrese el mes: "))
while mes<=0 or mes>=13:
    print("el mes no puede ser menor que cero ni mayor que 12")
    mes=int(input("ingrese el mes: "))

ano=int(input("ingrese el año: "))
while ano<=0:

    print("el año no puede ser menor que cero")
    ano=int(input("ingrese el año: "))
print("la fecha inicial es: ",dia,"/",mes,"/",ano)
while permiso==True:
    if dia ==30 or dia ==31:
        if dia==31 and mes==12:
            dia=1
            mes=1
            ano+=1
            break
        if dia==31 and mes==1 or mes==3 or mes==5 or mes==7 or mes==8 or mes==10:
            dia=1
            mes+=1
            break
        elif dia==31 and mes==4 or mes==6 or mes==9 or mes==11:
            print("esta fecha es invalida")
            permiso=False
            break
        if dia==30 and mes==4 or mes==6 or mes==9 or mes==11:
            dia=1
            mes+=1
            break
        elif dia==30 and mes==1 or mes==3 or mes==5 or mes==7 or mes==8 or mes==10:
            print("esta fecha es invalida")
            permiso=False
            break
    elif biciesto(ano)==True:
        if dia==29 and mes==2:
            dia=1
            mes+=1
            break
        elif dia==28 and mes==2:
            dia+=1
            break
        else:
            dia+=1
    elif dia==28 and mes==2:
        dia=1
        mes+=1
        break
    else:
        dia+=1
        break


while permiso==True:
    print("el dia que le sigue es: ",dia,"/",mes,"/",ano)
    permiso=False
