package fi.vamk.e2001365.northwind.service;

import fi.vamk.e2001365.northwind.entity.SalesReport;
import fi.vamk.e2001365.northwind.repository.SalesReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class SalesReportService {
    @Autowired
    private SalesReportRepository SalesReportRepository;

    public ResponseEntity<Iterable<SalesReport>> getAllSalesReport(){
        return ResponseEntity.ok(SalesReportRepository.findAll());
    }

    public ResponseEntity<SalesReport> getSalesReport(String id) {
        if (SalesReportRepository.existsById(id))
            return ResponseEntity.ok(SalesReportRepository.findById(id).get());
        else
            return ResponseEntity.badRequest().build();
    }

    public ResponseEntity<SalesReport> postSalesReport(SalesReport salesReport){
        if (SalesReportRepository.existsById(salesReport.getId()))
            return ResponseEntity.badRequest().build();
        else
            return ResponseEntity.ok(SalesReportRepository.save(salesReport));
    }

    public ResponseEntity<SalesReport> updateSalesReport(String id, SalesReport salesReport){
        salesReport.setId(id);
        if (SalesReportRepository.existsById(id))
            return ResponseEntity.ok(SalesReportRepository.save(salesReport));
        else
            return ResponseEntity.badRequest().build();
    }

    public ResponseEntity deleteSalesReport(String id){
        if (SalesReportRepository.existsById(id)){
            SalesReportRepository.deleteById(id);
            return ResponseEntity.ok().build();
        }
        else
            return ResponseEntity.badRequest().build();
    }



}
