package com.example.springtest.algro;

public class Test {
	public static int twoFind(int[] nums, int target) {
		// 找小于等于 target 的第一个数
		int left = 0;
		int right = nums.length - 1;

		while (left <= right) {
			int mid = right + (left - right) / 2;
			if (nums[mid] >= target) { // [mid, right]
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}

		return left;

	}

	public static void main(String[] args) {
		int[] nums = new int[] {1, 2, 4, 4, 5, 7};
		System.out.println(twoFind(nums, 4));
	}
}
