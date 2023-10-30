package com.subham.fitnessclubautomation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.subham.fitnessclubautomation.model.Payment;
import com.subham.fitnessclubautomation.repository.PaymentRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class PaymentService {
    @Autowired
    PaymentRepository paymentRepository;

    public Payment addPayment(Payment p) {
        return paymentRepository.save(p);
    }

    public void deletePayment(Long payment_id) {
        paymentRepository.deleteById(payment_id);
    }

    public List<Payment> getAllPayments() {
        List<Payment> payments = new ArrayList<>();
        paymentRepository.findAll().forEach(payments::add);
        return payments;
    }

    public Payment getPayment(Long payment_id) {
        return paymentRepository.findById(payment_id).get();
    }
}
