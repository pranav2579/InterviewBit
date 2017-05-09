package com.pranav.arrays;

import java.util.List;

public class max_sum_contiguous_subarray {

	public int maxSubArray(final List<Integer> a) {
		int maxSoFar = Integer.MIN_VALUE;
		int currentMax = 0;
		for (int i = 0; i < a.size(); i++) {
			currentMax = currentMax + a.get(i);
			if (currentMax > maxSoFar) {
				maxSoFar = currentMax;
			}
			if (currentMax < 0) {
				currentMax = 0;
			}
		}
		return maxSoFar;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
