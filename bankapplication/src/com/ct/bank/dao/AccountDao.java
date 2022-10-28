package com.ct.bank.dao;

import com.ct.bank.model.Account;

public interface AccountDao {
	public abstract long createAccount(Account account);

	public abstract Account getAccountDetails(Long accountNo);

	public abstract String withdraw(Long accountNo, int witdrawlAmount);

	public abstract String deposit(Long accountNo, int depositAmount);

	public abstract String fundtransfer(Long fromAccountNo, Long toAccountNo, int transferAmount);

	public abstract String printTransactions();

}
