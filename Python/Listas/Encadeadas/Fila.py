class elemento:
    def __init__(self, dado = None, seta = None):
        self.dado = dado
        self.seta = seta

    def __repr__(self) -> str:
        return str(self.dado) + "->" + str(self.seta)

class fila:
    def __init__(self):
        self.comeco
        self.final
    
    def __repr__(self):
        return "[" + str(self.comeco) + "]"
    
    def insere(self, dado):

        elemento_novo = elemento(dado)

        if self.comeco == None:
            self.comeco = elemento_novo
            self.final = elemento_novo
        
        else: 
            elemento_novo.seta = self.final
            self.final = elemento_novo
        
    def remove(self):

        if self.comeco == self.final:
            saindo = self.comeco.dado
            self.comeco = self.final = None
        
        else:
            saindo = self.comeco.dado
            self.comeco = self.comeco.seta
        
        return saindo