package com.kob.backend.backend.service.impl.user.account;

import com.kob.backend.backend.pojo.User;
import com.kob.backend.backend.service.impl.utils.UserDetailsImpl;
import com.kob.backend.backend.service.user.account.InfoService;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class InfoServiceImpl implements InfoService {
    @Override
    public Map<String, String> getinfo() {
        UsernamePasswordAuthenticationToken authenticationToken=
                (UsernamePasswordAuthenticationToken) SecurityContextHolder.getContext().getAuthentication();

        UserDetailsImpl loginUser=(UserDetailsImpl) authenticationToken.getPrincipal();
        User user=loginUser.getUser();

        Map<String,String> map=new HashMap<>();
        map.put("error_message","success");
        map.put("id",user.getPassword().toString());
        map.put("username",user.getUsername().toString());
        map.put("photo",user.getPhoto());
        return map;
    }
}
