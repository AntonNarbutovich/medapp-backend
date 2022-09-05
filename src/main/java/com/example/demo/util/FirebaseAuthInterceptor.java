package com.example.demo.util;

import com.example.demo.model.dto.UserDTO;
import com.example.demo.repository.UserRepository;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Service
public class FirebaseAuthInterceptor implements HandlerInterceptor {

    @Autowired
    UserRepository userRepository;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String token = request.getHeader("Authorization");
        FirebaseToken decodedToken = FirebaseAuth.getInstance().verifyIdToken(token);
        UserDTO user = userRepository.findByFirebaseId(decodedToken.getUid()).get(0);
        request.setAttribute("userId", user.getUserId());
        return true;
    }

}
