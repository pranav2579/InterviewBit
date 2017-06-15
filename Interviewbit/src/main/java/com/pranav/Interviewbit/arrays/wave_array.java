package com.pranav.Interviewbit.arrays;

import java.util.ArrayList;
import java.util.Collections;

public class wave_array {

	public ArrayList<Integer> wave(ArrayList<Integer> a) {
		Collections.sort(a);
		int size = a.size();
		int temp;
		for (int i = 0; i < size - 1; i += 2) {
			temp = a.get(i);
			a.set(i, a.get(i + 1));
			a.set(i + 1, temp);
		}

		return a;
	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub

	}

}
