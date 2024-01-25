package com.kob.backend.backend.service.user.account;

import java.util.Map;

public interface RegisterService {
    public Map<String,String> register(String username,String passwd,String confirmedPasswd);
}
