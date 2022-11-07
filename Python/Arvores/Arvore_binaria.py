from readline import insert_text


class Elemento:
    
    def __init__(self, dado = 0, seta = None) -> None:
        
        self.dado = dado
        self.seta = seta
    
    def __repr__(self) -> str:
        
        return self.dado + "->" + self.seta
    
class Arvore_Binaria:
    
    def __init__(self) -> None:
        
        self.comeco = None

    def  __repr__(self) -> str:
        
        return "[" + self.comeco + "]"
    
    def insere(self, dado):
        