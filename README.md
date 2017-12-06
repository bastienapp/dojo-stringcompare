# Comparateur de chaînes

Écrire une méthode qui retourne le nombre de caractères identiques, à position identiques, entre deux chaînes de même longueur.
La méthode retournera -1 si les chaînes n'ont pas la même longueur.

Exemples :

	chaine1  chaine2  retour
	"a"      "a"       1
	"a"      "b"       0
	"aa"     "ba"      1
	"cassis" "castor"  3
	"tacos"  "poulpe" -1

Rappel des commandes junit :

    javac -cp .:junit-4.12.jar StringCompareTest.java
    java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore StringCompareTest
