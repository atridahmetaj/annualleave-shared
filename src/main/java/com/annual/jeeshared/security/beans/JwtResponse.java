package com.annual.jeeshared.security.beans;

import com.annual.jeeshared.entity.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpHeaders;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
public class JwtResponse implements Serializable {
    private static final long serialVersionUID = -8091879091924046844L;
    private final String jwttoken;
    HttpHeaders httpHeader;
    private User user;

}
