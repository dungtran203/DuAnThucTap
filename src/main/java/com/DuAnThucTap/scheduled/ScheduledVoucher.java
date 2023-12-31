package com.DuAnThucTap.scheduled;

import com.DuAnThucTap.common.ApplicationConstant;
import com.DuAnThucTap.entity.VoucherThuHang;
import com.DuAnThucTap.repository.VoucherThuHangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

@Component
public class ScheduledVoucher {

    @Autowired
    private VoucherThuHangRepository voucherThuHangRepository;
    LocalDate date = LocalDate.now();
    LocalTime time = LocalTime.now();

    LocalDateTime dateTime = LocalDateTime.of(date, time);

    @Scheduled(fixedRate = 1000)
    public void updateVoucherStatus(){
        LocalDateTime currentDateTime = LocalDateTime.now();
        List<VoucherThuHang> voucherThuHangs = voucherThuHangRepository.findByNgayKetThucBeforeAndTrangThaiNot(currentDateTime, ApplicationConstant.TrangThaiVoucher.INACTIVE);

        for (VoucherThuHang voucherThuHang : voucherThuHangs) {
            voucherThuHang.setTrangThai(ApplicationConstant.TrangThaiVoucher.INACTIVE);
        }

        voucherThuHangRepository.saveAll(voucherThuHangs);
    }
}
