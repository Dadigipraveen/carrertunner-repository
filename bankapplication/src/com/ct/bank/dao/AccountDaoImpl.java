package com.ct.bank.dao;
import java.util.HashMap;

import com.ct.bank.model.Account;


public class AccountDaoImpl implements AccountDao {
	HashMap<Long, Account> accounts = new HashMap<>();

	@Override
	public long createAccount(Account account) {
		accounts.put(account.getAccNo(), account);
		return account.getAccNo();
	}

	@Override
	public Account getAccountDetails(Long accountNo) {

		return accounts.get(accountNo);
	}

	@Override
	public String withdraw(Long accountNo, int withdrawlAmount) {
		Account account = accounts.get(accountNo);
		int updatedBalance = account.getBalance() - withdrawlAmount;
		account.setBalance(updatedBalance);
		accounts.put(accountNo, account);
		return "After Withdraw your updated balance :" + updatedBalance;
	}

	@Override
	public String deposit(Long accountNo, int depositAmount) {
		Account account = accounts.get(accountNo);
		int updatedBalance = account.getBalance() + depositAmount;
		account.setBalance(updatedBalance);
		accounts.put(accountNo, account);
		return "After Deposit your updated balance :" + updatedBalance;
	}

	@Override
	public String fundtransfer(Long fromAccountNo, Long toAccountNo, int transferAmount) {
		Account fromAccount = accounts.get(fromAccountNo);
		int fromUpdatedBalance = fromAccount.getBalance() - transferAmount;
		Account toAccount = accounts.get(toAccountNo);
		int toUpdatedBalance = toAccount.getBalance() + transferAmount;
		fromAccount.setBalance(fromUpdatedBalance);
		toAccount.setBalance(toUpdatedBalance);
		accounts.put(fromAccountNo, fromAccount);
		accounts.put(toAccountNo, toAccount);
		return "After Fundtransfer updated balance :" + fromUpdatedBalance;
	}

	@Override
	public String printTransactions() {

		return null;
	}

	

}
