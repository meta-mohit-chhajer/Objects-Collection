package com.metacube.ObjectsCollection;

import java.util.*;

public class MoleculeWeight {
	public int stack[], index;

	public MoleculeWeight() {
		stack = new int[100];
		index = -1;
	}

	/*
	 * Push Elements in Stack
	 * 
	 * @Param x Value to be Pushed
	 */
	public void push(int x) {
		stack[index + 1] = x;
		index++;
	}

	/*
	 * Pop Element from the Stack
	 * 
	 * @return Popped Element
	 */

	public int pop() {
		if (index == -1) {
			return -1;
		}
		int num = stack[index];
		index--;
		return num;
	}

	/*
	 * Current Position of Index in Stack
	 * 
	 * @return value at index
	 */
	public int peek() {
		if (index == -1) {
			return 0;
		}
		return stack[index];
	}

	/*
	 * Evaluation of Molecule
	 * @param s String
	 * @return Molecular Weight of Molecule
	 */
	public static int evaluate(String s) {
		MoleculeWeight s1 = new MoleculeWeight();
		if (s == null)
			throw new AssertionError("Empty String");
		int ans = 0;
		int num = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			switch (c) {
			case '2':
			case '3':
			case '4':
			case '5':
			case '6':
				num = s1.pop();
				num *= Integer.parseInt(String.valueOf(c));
				s1.push(num);
				break;
			case 'C':
				s1.push(12);
				break;
			case 'H':
				s1.push(1);
				break;
			case 'O':
				s1.push(16);
				break;
			case '(':
				s1.push(0);
				break;
			case ')':
				int result = 0;
				while (s1.peek() != 0) {
					result += s1.pop();
				}
				int throwaway = s1.pop();
				s1.push(result);
				break;
			default:
				break;

			}
		}
		for (int i = 0; s1.index > -1; i--) {
			ans += s1.pop();
		}
		return ans;
	}

	public static void main(String... arg) {
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter the Molecule");
		String input=kb.nextLine();
		int result=evaluate(input);
		System.out.println(result);
		kb.close();
	}

}
