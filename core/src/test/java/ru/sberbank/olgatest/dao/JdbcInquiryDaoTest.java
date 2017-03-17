package ru.sberbank.olgatest.dao;

import org.junit.Test;

import ru.sberbank.olgatest.entities.Inquiry;

import static org.junit.Assert.assertEquals;

public class JdbcInquiryDaoTest {
    @Test
    public void testGetInquiry() throws Exception {
        InquiryDao inquiryDao = new JdbcInquiryDao();
        Inquiry inquiry = inquiryDao.getInquiry(500L);

        assertEquals(Long.valueOf(500L), inquiry.getId());
    }
}
