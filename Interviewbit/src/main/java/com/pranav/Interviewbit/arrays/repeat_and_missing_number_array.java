package com.pranav.Interviewbit.arrays;

import java.util.ArrayList;
import java.util.List;

public class repeat_and_missing_number_array {

	public ArrayList<Integer> repeatedNumber(final List<Integer> a) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		ArrayList<Integer> solution = new ArrayList<Integer>();
		int missing_num;
		int repeated_num;
		for (int i = 0; i <= a.size(); i++) {
			result.add(0);
		}

		result.set(0, -1);
		for (int i = 0; i < a.size(); i++) {
			int resultIndex = a.get(i);
			result.set(resultIndex, (result.get(resultIndex) + 1));
		}
		for (int i = 1; i <= a.size(); i++) {
			if (result.get(i) == 2) {
				repeated_num = i;
				solution.add(repeated_num);
			}

		}
		for (int i = 1; i <= a.size(); i++) {
			if (result.get(i) == 0) {
				missing_num = i;
				solution.add(missing_num);
			}
		}

		return solution;
	}

	public static void main(String[] args) {

	}

}
