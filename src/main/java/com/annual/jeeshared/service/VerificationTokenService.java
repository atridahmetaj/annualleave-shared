package com.annual.jeeshared.service;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;

import com.annual.jeeshared.constants.Constants;
import com.annual.jeeshared.entity.User;
import com.annual.jeeshared.entity.VerificationToken;
import com.annual.jeeshared.repository.VerificationTokenRepository;
import org.springframework.stereotype.Service;


@Service
public class VerificationTokenService extends GenericService<VerificationToken, VerificationTokenRepository> {

    public VerificationTokenService(VerificationTokenRepository verificationTokenRepository) {
        super.repository = verificationTokenRepository;
    }

    public VerificationToken findByToken(String token) {
        return repository.findByToken(token);
    }

    public void create(User user, String token) {
        VerificationToken verificationToken = new VerificationToken();
        verificationToken.setUser(user);
        verificationToken.setToken(token);
        verificationToken.setExpirationDate(getDefaultExpirationDate());

        save(verificationToken);
    }

    private static Date getDefaultExpirationDate() {
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Timestamp(cal.getTime().getTime()));
        cal.add(Calendar.MINUTE, Constants.TOKEN_EXPIRES_IN_MINUTES);
        return new Date(cal.getTime().getTime());
    }
}
