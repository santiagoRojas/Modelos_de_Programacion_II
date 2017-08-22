import random
from random import sample

def Contar(mazo):
    #print(str(mazo))
    return (1)

def Repartir(mazoJugador, mazoCasa, mazo, turno):
    if (turno==1):
        mazoJugador.append(mazo[random.randrange(52)])
    if (turno==2):
        mazoCasa.append(mazo[random.randrange(52)])   
    return (None)          
	

def CrearMazo():
    return sample( [ (x,y) for x in ['A', 2, 3, 4, 5, 6, 7, 8, 9, 10, 'J', 'Q', 'K' ] for y in ['Picas', 'Treboles', 'Diamantes', 'Corazones' ] ], 52 )

def Jugar(mazo):
    if mazo!=[]:
        print (mazo)       
        Repartir([], [], mazo, 1) 
        JugarCasa(mazo)               
        return (None)
        
def JugarCasa(mazo):
	if mazo!=[]:
       
        return Repartir([], [], mazo, 2)
              
                
def Preguntar():        
	print("¿Desea jugar de nuevo? ", end="")
	return (input())

Jugar(CrearMazo())
while (Preguntar()=="Y"):
	Jugar(CrearMazo())
