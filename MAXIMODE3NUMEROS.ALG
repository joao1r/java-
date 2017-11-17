Algoritmo "MaximoDe3Numeros"
// Autor(a)    : João Reisinho
// Data atual  : 17/11/2017
Var
num1, num2, num3, maior:inteiro

Inicio
Escreva("Qual o 1º numero?")
leia(num1)
Escreva("Qual o 2º numero?")
leia(num2)
Escreva("Qual o 3º numero?")
leia(num3)
se(num1>num2) entao
maior <- num1
senao
maior <- num2
fimse
se (maior < num3) entao
maior <- num3
fimse
escreva("maximo: ",valor)


Fimalgoritmo