package JavaTech;

import java.util.Scanner;
import java.util.Stack;

public class PilhaEx02 {

	public static void main(String[] args) {
		
/*

Escreva um programa Java contendo uma Collection Stack (Pilha) de Objetos da Classe String, 
para organizar a retirada de livros em uma pilha. O programa deverá ter um 
Menu que aceitará as opções 0, 1, 2 e 3:
1: Adicionar um novo livro na pilha. Deve solicitar o nome do livro.
2: Listar todos os livros da Pilha
3: Retirar um livro da pilha 
0: O programa deve ser finalizado. 
Caso a pilha esteja vazia e o atendente tente retirar um livro da pilha, 
ele deverá informar que a pilha está vazia.

Menu:


 */

		Scanner leia = new Scanner(System.in);
		int opcao;
		Stack<String> pilha = new Stack<String>();
		
		do {
			 System.out.println("\nMENU");
	            System.out.println("1: Adicionar um novo livro na pilha");
	            System.out.println("2: Listar todos os livros da Pilha");
	            System.out.println("3: Retirar um livro da pilha");
	            System.out.println("0: Sair");
	            System.out.print("Escolha uma opção: ");
	            opcao = leia.nextInt();
	            leia.nextLine(); 
		
		switch(opcao) {
		case 1:
		System.out.print("Digite o nome do livro: ");
        String novoLivro = leia.nextLine();
        pilha.push(novoLivro);
        System.out.println("Livro adicionado!");
        break;
        
        case 2:
        System.out.println("Livros na pilha:");
        for (String livro : pilha) {
        System.out.println(livro);
        }
        break;
        
        case 3:
        if (!pilha.isEmpty()) {
        String livroRemovido = pilha.pop();
        System.out.println("Livro retirado: " + livroRemovido);
        } else {
        System.out.println("A pilha está vazia.");
        }
        break;
        
        case 0:
        System.out.println("Programa finalizado.");
        break;
        
        default:
        System.out.println("Opção inválida.");
        
    }
} while (opcao != 0);

	}

}
