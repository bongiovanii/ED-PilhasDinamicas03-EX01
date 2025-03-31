package controller;

import br.edu.fateczl.pilha.PilhaInt;

public class StackController {

	public StackController() {
		// TODO Auto-generated constructor stub
	}

	public void postiveOrNegativeArray(int[] array, int length) {
		PilhaInt p = new PilhaInt();
		int pop1 = 0;
		int pop2 = 0;
		int sum = 0;
		int countPush = 0;
		int countPop = 0;

		for (int i = 0; i < length; i++) {
			if (array[i] >= 0) {
				p.push(array[i]);
				countPush++;
			} else if (array[i] < 0) {
				try {
					pop1 = p.pop();
					pop2 = p.pop();
					countPush -= 2;
					countPop += 2;
					sum = pop1 + pop2;
					p.push(array[i]);
					p.push(sum);

				} catch (Exception e) {
					e.printStackTrace();
				}

			}
		}

		int[] aux = new int[10];
		int auxNum;
		int count = 0;
		System.out.println("Quantidade de valores presentes na pilha: ");
		for (int i : aux) {
			try {
				aux[i] = p.pop();
				count++;
				System.out.println(aux[i]);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		int lenAuxNum = aux.length;

		System.out.println("Tamanho da pilha: " + lenAuxNum);

	}

}
