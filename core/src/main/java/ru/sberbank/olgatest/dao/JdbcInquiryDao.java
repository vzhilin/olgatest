package ru.sberbank.olgatest.dao;

import org.springframework.stereotype.Component;

import java.util.Date;

import ru.sberbank.olgatest.entities.Inquiry;

@Component
public class JdbcInquiryDao implements InquiryDao {
    public Inquiry getInquiry(long id) {
        Inquiry inquiry = new Inquiry();
        inquiry.setId(id);
        inquiry.setDescription("Fake inquiry");
        inquiry.setCreateDate(new Date());
        return inquiry;
    }
}
