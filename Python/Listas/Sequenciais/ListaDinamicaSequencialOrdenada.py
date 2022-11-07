class ListaDSO: 

    def __init__(self, nElementos=5):
        
        self.lista = []

        for i in range(nElementos):
            self.lista.append(0)
    
    def pesquisa(self):

        for i in range(len(self.lista)):
            print(f"{self.lista[i]} -> {i}")

    def procuraElemento(self, elemento):

        achou = False
        
        for i in range(len(self.lista)):

            if self.lista[i] == elemento:
                achou = True

        return achou
    
    def troca(self, indice, elemento):
        self.lista[indice] = elemento

    def insere(self, elemento):
        self.lista.append(elemento)

    def apagaDado(self, elemento):    

        apagou = False
        i = 0

        while not apagou or i <= len(self.lista):

            if self.lista[i] == elemento:
                self.lista[i] = None
                apagou = True

            i = ++1
        
        return apagou

    def apagaIndice(self, indice):
        self.lista[indice] = None

    def deletaDado(self, elemento):
        self.lista.remove(elemento)
    
    def deletaIndice(self, indice):
        self.lista.remove(self.lista[indice])