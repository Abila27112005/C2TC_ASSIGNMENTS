package com.tnsif.assignmentthree;

public class Bank {
	private static int totalAccounts = 0;
	public static int getTotalAccounts() {
		return totalAccounts;
		}
	public static void incrementAccounts() {
		totalAccounts++;
		}
}