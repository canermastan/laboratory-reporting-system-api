package com.canermastan.laboratoryreportingsystemapi.service.report;

import com.canermastan.laboratoryreportingsystemapi.entity.Report;
import org.springframework.cglib.core.Local;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.access.prepost.PreAuthorize;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public interface ReportService {
    Report save(Report report);
    Report update(Report report);
    Report findById(Long id);
    void deleteById(Long id);
    List<Report> findAll();
    Page<Report> findAll(int page);

    List<Report> findAllByPatientFirstNameOrLastName(String name);
    List<Report> findAllByPatientIdentityNumber(String identityNumber);
    List<Report> findAllByReportDate(LocalDate reportDate);
    List<Report> findAllByLaboratoryTechnicianFirstNameOrLastName(String name);
}
