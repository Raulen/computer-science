package br.com.raulen.string;

// 2) How to check if two Strings are anagrams of each other? (solution)
// 
// A simple coding problem based upon String, but could also be asked with numbers.
// You need to write a Java program to check if two given strings are anagrams of Each other. 
// Two strings are anagrams if they are written using the same exact letters, ignoring space, punctuation, 
// and capitalization. Each letter should have the same count in both strings. For example, the Army and Mary are an anagram of each other.
// Read more: https://javarevisited.blogspot.com/2015/01/top-20-string-coding-interview-question-programming-interview.html#ixzz5uhSS8pVM
// https://pt.wikipedia.org/wiki/Anagrama
// Um anagrama (do grego ana = "voltar" ou "repetir" + graphein = "escrever") é uma espécie de jogo de palavras, resultando do rearranjo das letras de uma palavra ou expressão para produzir outras palavras ou expressões, utilizando todas as letras originais exatamente uma vez. Um exemplo conhecido é a personagem Iracema, claro anagrama de América, no romance de José de Alencar.

public class Anagram {

    public static void main(String[] args) {

        String valueA = "america";
        String valueB = "uuuuuuu";

        if (valueA.length() != valueB.length()) {
            throw new RuntimeException("Palvras não são anagramas");
        }

        boolean is = true;

        char[] valueAChars = valueA.toCharArray();
        char[] valueBChars = valueB.toCharArray();

        for (int i = 0; i <= valueAChars.length - 1; i++) {
            if (!is) {
                break;
            }

            for (int j = 0; j <= valueBChars.length - 1; j++) {
                is = false;
                if (valueAChars[i] == valueAChars[j]) {
                    is = true;
                    break;
                }

            }
        }

        System.out.println(is ? "São anagramas" : "Não são anagramas");

    }

    //Análise Combinatória - Permutação
    public void executeAnaliseCombinatoria() {

    }

}
