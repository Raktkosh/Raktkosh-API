package com.raktkosh.services;

import com.raktkosh.exceptions.ActivationException;

import javax.mail.MessagingException;

import com.raktkosh.dto.BloodBankDTO;

public interface IAccountService {
	void userSignUp(BloodBankDTO dto) throws ActivationException, MessagingException;
}
