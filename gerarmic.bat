@echo off

if exist bin (
	echo  *** Gerando Stubs ***
	rmic -d bin -classpath bin CalculadoraImpl
) else (
	echo  *** Diretorio bin nao existe ***
)