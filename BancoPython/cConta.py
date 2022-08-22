from socket import NI_NUMERICHOST
from tkinter.filedialog import SaveFileDialog


class Conta:
    
    def __init__(self, numero, titular, saldo, limite):
        
        print("INICIALIZANDO UMA CONTA")

        self.numero = numero
        self.titular = titular
        self.saldo = saldo
        self.limite = limite
        
    def deposita(self, valor):

        self.saldo += valor
    
    