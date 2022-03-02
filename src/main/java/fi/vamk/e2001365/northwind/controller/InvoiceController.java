package fi.vamk.e2001365.northwind.controller;

import fi.vamk.e2001365.northwind.entity.Invoice;
import fi.vamk.e2001365.northwind.service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/invoice")
public class InvoiceController {
    @Autowired
    private InvoiceService invoiceService;

    @GetMapping("")
    public ResponseEntity<Iterable<Invoice>> getAllInvoice(){
        return invoiceService.getAllInvoice();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Invoice> getInvoice(@PathVariable("id") Integer id){
        return invoiceService.getInvoice(id);
    }

    @PostMapping("")
    public ResponseEntity<Invoice> postInvoice(@RequestBody Invoice invoice){
        return invoiceService.postInvoice(invoice);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Invoice> updateInvoice(@RequestBody Invoice invoice, @PathVariable("id") Integer id){
        return invoiceService.updateInvoice(id, invoice);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Invoice> deleteInvoice(@PathVariable("id") Integer id){
        return invoiceService.deleteInvoice(id);
    }
}
