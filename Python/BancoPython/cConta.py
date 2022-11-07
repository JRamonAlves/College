class Conta:
    
    def __init__(self, numero, cliente, saldo, limite):
        
        print("INICIALIZANDO UMA CONTA")

        self.numero = numero
        self.cliente = cliente
        self.saldo = saldo
        self.limite = limite
        
    def deposita(self, valor):

        self.saldo += valor
    
    def saca(self, valor):

        if self.saldo >= valor:
            self.saldo -= valor
            return True
        
        else: 
            return False
    
    def transfere_para(self, destino, valor):
        if self.saldo >= valor:
            self.saldo -= valor
            destino.saldo += valor
            return True
        
        else: 
            return False

    def extrato(self, cliente):

        print(f'Titular: {cliente.nome} {cliente.sobrenome}')
        print(f'Número: {self.numero}\nsaldo: {self.saldo}')

    