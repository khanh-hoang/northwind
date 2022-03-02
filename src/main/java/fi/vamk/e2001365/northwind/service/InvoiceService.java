package fi.vamk.e2001365.northwind.service;

import fi.vamk.e2001365.northwind.entity.Invoice;
import fi.vamk.e2001365.northwind.repository.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class InvoiceService {
    @Autowired
    private InvoiceRepository invoiceRepository;

    public ResponseEntity<Iterable<Invoice>> getAllInvoice(){
        return ResponseEntity.ok(invoiceRepository.findAll());
    }

    public ResponseEntity<Invoice> getInvoice(Integer id) {
        if (invoiceRepository.existsById(id))
            return ResponseEntity.ok(invoiceRepository.findById(id).get());
        else
            return ResponseEntity.badRequest().build();
    }

    public ResponseEntity<Invoice> postInvoice(Invoice invoice){
        if (invoiceRepository.existsById(invoice.getId()))
            return ResponseEntity.badRequest().build();
        else
            return ResponseEntity.ok(invoiceRepository.save(invoice));
    }

    public ResponseEntity<Invoice> updateInvoice(Integer id, Invoice invoice){
        invoice.setId(id);
        if (invoiceRepository.existsById(id))
            return ResponseEntity.ok(invoiceRepository.save(invoice));
        else
            return ResponseEntity.badRequest().build();
    }

    public ResponseEntity deleteInvoice(Integer id){
        if (invoiceRepository.existsById(id)){
            invoiceRepository.deleteById(id);
            return ResponseEntity.ok().build();
        }
        else
            return ResponseEntity.badRequest().build();
    }



}
