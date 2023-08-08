package JavaTech;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Iterator;

public class FilaEx01 {

	public static void main(String[] args) {
		
/*

Escreva um programa Java contendo uma Collection Queue (Fila) de Objetos da Classe String,
para organizar a ordem de chegada dos clientes de um banco. O programa deverá ter um Menu que
aceitará as opções 0, 1, 2 e 3:

1: Adicionar um novo Cliente na fila. Deve solicitar o nome do Cliente.
2: Listar todos os Clientes na fila
3: Chamar (retirar) uma pessoa da fila
0: O programa deve ser finalizado

Caso a fila esteja vazia, o programa deverá informar que a fila está vazia ao tentar retirar
(chamar) um cliente da fila.

 */
		Scanner leia = new Scanner(System.in);
		String cliente = "";
		Queue<String> fila = new LinkedList<String>();
		
		int opcao = -1; // inicializo a variável com um valor diferente dos das opções
		
		while(opcao != 0) {
			//if(opcao != -1) {
		System.out.println("\nMENU\n-------------------------------------\n1 - Adicionar Cliente na Fila \n2 - Listar todos os clientes \n3 - Chamar (retirar Cliente da Fila) \n0 - Sair\n-------------------------------------\nEntre com a opção desejada: ");
		opcao = leia.nextInt();
		
		switch(opcao) {
		case 1:
			System.out.println("Digite o nome do cliente: ");
			cliente = leia.next();
			leia.nextLine();
			fila.add(cliente);
			System.out.println("\nCliente adicionado com sucesso.");
			break;
			
		case 2:
			if(fila.isEmpty()) {//se for verdadeiro que a fila está vazia
				System.out.println("\nA fila está vazia!");
			}else {//se for falso, então:
				System.out.println("\nClientes na fila: ");
				Iterator<String> iterator = fila.iterator();//percorre os clientes
				while (iterator.hasNext()) {
					String clienteAtual = iterator.next();
				System.out.println(clienteAtual);//mostra o nome dos clientes
			}
		}
			break;
			
		case 3:
			if(fila.isEmpty()) {//se for verdadeiro que a fila está vazia
				System.out.println("\nA fila está vazia!");
			} else {//se for falso, então:
				String clienteChamado = fila.poll();
				System.out.println("\nCliente chamado: "+clienteChamado);
			}
			break;
			
		case 0:
			System.out.println("\nVolte sempre!");
			break;
			
			default:
			System.out.println("\nOpção inválida! Digite uma opção válida.");
		}

}
}
}