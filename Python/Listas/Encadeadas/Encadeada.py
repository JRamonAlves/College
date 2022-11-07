class elemento:

    def __init__(self, dado = None, seta = None):
        
        self.dado = dado
        self.seta = seta
    
    def __repr__(self):

        return str(self.dado) + " -> " + str(self.seta)

class ListaEncadeada:
    
    def __init__(self):
        
        self.comeco = None
        self.final = None

    def __repr__(self):

        return "[" + str(self.comeco) + "]"
    
    def insere_elementos_comeco(self, dado):

        if self.final == None: 
            
            elemento_novo = elemento(dado)
            self.comeco = elemento_novo
            self.final = elemento_novo
        
        else:
            
            elemento_novo = elemento(dado)
            elemento_novo.seta = self.comeco
            self.comeco = elemento_novo

    def insere_elemento_final(self, dado):
        elemento_novo = elemento(dado)
        elemento_antigo = self.final
        elemento_antigo.seta = elemento_novo
        self.final = elemento_novo

    def procura(self, dado):
        corrente = self.comeco

        while corrente.dado != dado: 
            corrente = corrente.seta
        
        if corrente == None:

            return False
        else:
            return True
    
    def deleta(self, dado):

        if self.comeco == None:
            return False
        
        else:
            if self.comeco == dado:
                proximo = self.comeco
                self.comeco = proximo.seta
            
            else:

                corrente = self.comeco

                while corrente.dado != dado: 
                    anterior = corrente
                    corrente = corrente.seta
        
                if corrente.seta != None:
                    anterior.seta = None

                else:
                    anterior.seta = corrente.seta
            
            return True