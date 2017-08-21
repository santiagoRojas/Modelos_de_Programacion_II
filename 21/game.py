import random
from random import sample

def Contar(mazo):
    print(str(mazo))
    return (None)

def Repartir(mazoJugador, mazo, turno):
    if turno==1:
        mazoJugador.append(mazo[random.randrange(52)])
        print (mazoJugador)
    return (mazoJugador)

def CrearMazo():
    return sample( [ (x,y) for x in ['A', 2, 3, 4, 5, 6, 7, 8, 9, 10, 'J', 'Q', 'K' ] for y in ['Picas', 'Treboles', 'Diamantes', 'Corazones' ] ], 52 )

def Jugar(mazo):
    if mazo!=[]:
        print(mazo)
        Repartir([], mazo, 1)
        return ()

Jugar(CrearMazo())
