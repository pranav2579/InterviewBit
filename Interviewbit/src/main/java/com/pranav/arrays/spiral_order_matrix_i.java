package com.pranav.arrays;

import java.util.ArrayList;
import java.util.List;

public class spiral_order_matrix_i {

	public ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> a) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		// Populate result;

		int T = 0, B = a.size() - 1;
		int L = 0, R = a.get(0).size() - 1;
		int dir = 0;
		System.out.println(T + " " + B + " " + L + " " + R);

		while (T <= B && L <= R) {

			if (dir == 0) {
				for (int j = L; j <= R; j++) {
					System.out.println(a.get(T).get(j));
					result.add(a.get(T).get(j));
				}
				T++;
			} else if (dir == 1) {
				for (int j = T; j <= B; j++) {
					System.out.println(a.get(j).get(R));
					result.add(a.get(j).get(R));

				}
				R--;
			} else if (dir == 2) {
				for (int j = R; j >= L; j--) {
					System.out.println(a.get(B).get(j));
					result.add(a.get(B).get(j));

				}
				B--;

			} else if (dir == 3) {
				for (int j = B; j >= T; j--) {
					System.out.println(a.get(j).get(L));
					result.add(a.get(j).get(L));

				}
				L++;
			}
			dir = (dir + 1) % 4;
		}

		return result;
	}

	public static void main(String[] args) {
		List<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> r1 = new ArrayList<Integer>();
		ArrayList<Integer> r2 = new ArrayList<Integer>();
		ArrayList<Integer> r3 = new ArrayList<Integer>();
		r1.add(1);
		r1.add(2);
		r2.add(3);
		r2.add(4);
		r3.add(5);
		r3.add(6);
		a.add(r1);
		a.add(r2);
		a.add(r3);
		spiral_order_matrix_i s = new spiral_order_matrix_i();
		s.spiralOrder(a);

	}

}
