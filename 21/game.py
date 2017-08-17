from random import *

def mazo():
    return sample( [ (x,y) for x in ['A', 'J', 'Q', 'K' ] + range (2, 11) for y in ['Picas', 'Treboles', 'Diamantes', 'Corazones' ] ], 52 )

def jugar(mazo):
    if mazo!=[]:
        print mazo[0]
        print mazo[1]
        return jugar(mazo[2:])

jugar(mazo())
