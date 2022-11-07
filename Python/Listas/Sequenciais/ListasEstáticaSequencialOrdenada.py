class ListaESO: 

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
    
    def insere(self, indice, elemento):
        self.lista[indice] = elemento

    def deletaDado(self, elemento):
        
        deleta = False
        i = 0

        while not deleta or i <= len(self.lista):

            if self.lista[i] == elemento:
                self.lista[i] = None
                deleta = True

            i = ++1
        
        return deleta 

    def deletaIndice(self, indice):        
        self.lista[indice] = None