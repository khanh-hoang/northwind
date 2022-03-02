package fi.vamk.e2001365.northwind.controller;

import fi.vamk.e2001365.northwind.entity.SalesReport;
import fi.vamk.e2001365.northwind.service.SalesReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sales/report")
public class SalesReportController {
    @Autowired
    private SalesReportService SalesReportService;

    @GetMapping("")
    public ResponseEntity<Iterable<SalesReport>> getAllSalesReport(){
        return SalesReportService.getAllSalesReport();
    }

    @GetMapping("/{id}")
    public ResponseEntity<SalesReport> getSalesReport(@PathVariable("id") String id){
        return SalesReportService.getSalesReport(id);
    }

    @PostMapping("")
    public ResponseEntity<SalesReport> postSalesReport(@RequestBody SalesReport salesReport){
        return SalesReportService.postSalesReport(salesReport);
    }

    @PutMapping("/{id}")
    public ResponseEntity<SalesReport> updateSalesReport(@RequestBody SalesReport salesReport, @PathVariable("id") String id){
        return SalesReportService.updateSalesReport(id, salesReport);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<SalesReport> deleteSalesReport(@PathVariable("id") String id){
        return SalesReportService.deleteSalesReport(id);
    }
}
