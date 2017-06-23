package com.pranav.Interviewbit.arrays;

import java.util.ArrayList;
import java.util.Collections;

public class spiral_order_matrix {

	public ArrayList<ArrayList<Integer>> generateMatrix(int a) {
		int L = 0;
		int R = a - 1;
		int T = 0;
		int B = a - 1;
		int num = 1;
		int dir = 1;
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>(a);
		for (int j = 0; j < a; j++) {
			list.add(new ArrayList<Integer>(Collections.nCopies(a, 0)));
		}

		while (L <= R && T <= B) {
			if (dir == 1) {
				for (int i = L; i <= R; i++) {
					list.get(T).set(i, num);
					num++;
				}
				dir = 2;
				T++;
			} else if (dir == 2) {
				for (int i = T; i <= B; i++) {
					list.get(i).set(R, num);
					num++;
				}
				dir = 3;
				R--;
			} else if (dir == 3) {
				for (int i = R; i >= L; i--) {
					list.get(B).set(i, num);
					num++;
				}
				dir = 4;
				B--;
			} else if (dir == 4) {
				for (int i = B; i >= T; i--) {
					list.get(i).set(L, num);
					num++;
				}
				dir = 1;
				L++;
			}

		}
		return list;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
