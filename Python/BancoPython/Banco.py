from cConta import Conta
from cCliente import Cliente

cliente1 = Cliente("José Ramon", "Severo Alves", 12345678910)
conta1 = Conta(123, cliente1.nome, 1000, 5000)
cliente2 = Cliente("Ramon José", "Alves Severo", 98765432101)
conta2 = Conta(321,cliente2.nome, 8000, 40000)

conta1.deposita(1000)

consegui = conta1.saca(500)

if consegui:
    print("Conseguiu efetuar o saque!")

else: 
    print("Não conseguiu efetuar o saque!")

transferencia = conta1.transfere_para(conta2, 600)

if transferencia:
    print("Consegui tranferir!")

else: print("Não consegui transferir!")

conta1.extrato
conta2.extrato 