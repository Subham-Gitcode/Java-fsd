package com.subham.fitnessclubautomation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.subham.fitnessclubautomation.model.Admin;
import com.subham.fitnessclubautomation.repository.AdminRepository;

@Service
public class AdminService {
    @Autowired
    AdminRepository adminRepository;

    public Admin getAdmin(Long adminId) {
        return adminRepository.findById(adminId).get();
    }

    public Admin login(String adminEmail, String adminPassword) {
        Admin admin = adminRepository.login(adminEmail, adminPassword);
        return admin;
    }
}
